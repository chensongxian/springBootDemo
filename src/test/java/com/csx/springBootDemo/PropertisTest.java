package com.csx.springBootDemo;

import com.csx.springBootDemo.properties.PropertiesComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertisTest {
    @Autowired
    private PropertiesComponent propertiesComponent;

    @Test
    public void testPropertis(){
        Assert.assertEquals(propertiesComponent.getName(),"csx");
        Assert.assertEquals(propertiesComponent.getPassword(),"1234");
        System.out.println(propertiesComponent.getDesc());
        System.out.println("random value:"+propertiesComponent.getValue());
        System.out.println("BigNumber:"+propertiesComponent.getBignumber());
        System.out.println("test1:"+propertiesComponent.getTest1());
        System.out.println("test2:"+propertiesComponent.getTest2());
        //是哪个环境的配置文件
        System.out.println("profile:"+propertiesComponent.getProfile());
    }
}
