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
    }
}
