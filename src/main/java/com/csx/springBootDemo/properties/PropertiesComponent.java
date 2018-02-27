package com.csx.springBootDemo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/27
 */
@Component
public class PropertiesComponent {
    @Value("${com.csx.name}")
    private String name;
    @Value("${com.csx.password}")
    private String password;

    @Value("${com.csx.desc}")
    private String desc;

    @Value("${com.csx.value}")
    private String value;

    @Value("${com.csx.number}")
    private int number;

    @Value("${com.csx.bignumber}")
    private BigInteger bignumber;

    @Value("${com.csx.test1}")
    private int test1;

    @Value("${com.csx.test2}")
    private int test2;

    @Value("${profile}")
    private String profile;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigInteger getBignumber() {
        return bignumber;
    }

    public void setBignumber(BigInteger bignumber) {
        this.bignumber = bignumber;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
