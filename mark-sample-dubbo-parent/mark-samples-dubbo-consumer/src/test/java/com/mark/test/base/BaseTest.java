/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试基类,不要运行此类,
 * 此类是用于各个子系统继承用的
 *
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-test.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests{
    
    @Test
    public void test(){
        System.out.println("test.........");
    }
}
