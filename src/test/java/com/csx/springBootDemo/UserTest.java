package com.csx.springBootDemo;

import com.csx.springBootDemo.web.HelloController;
import com.csx.springBootDemo.web.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/27
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserController userController;

    @Test
    public void testUser() throws Exception {
        /*
         * 测试UserController
         */
        RequestBuilder request=null;

        request= get("/users/");

        mvc.perform(request)
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string(new Equals("[]")));

        // 2、post提交一个user
        request = post("/users/")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.content().string(new Equals("success")));

        // 3、get获取user列表，应该有刚才插入的数据
        request = get("/users/");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(new Equals("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

        // 4、put修改id为1的user
        request = put("/users/1")
                .param("name", "测试终极大师")
                .param("age", "30");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.content().string(new Equals("success")));

        // 5、get一个id为1的user
        request = get("/users/1");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.content().string(new Equals("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));


        // 6、del删除id为1的user
        request = delete("/users/1");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.content().string(new Equals("success")));

        // 7、get查一下user列表，应该为空
        request = get("/users/");
        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(new Equals("[]")));
    }
}
