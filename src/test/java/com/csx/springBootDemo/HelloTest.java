package com.csx.springBootDemo;

import com.csx.springBootDemo.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/27
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private HelloController helloController;

    @Test
    public void testHello() throws Exception {
        BDDMockito.given(this.helloController.index())
                    .willReturn("Hello World");
        this.mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(new Equals("Hello World1")))
                .andReturn();

    }
}
