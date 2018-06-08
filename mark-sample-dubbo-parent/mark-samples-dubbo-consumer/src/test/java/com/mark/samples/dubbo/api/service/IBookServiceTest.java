/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.dubbo.api.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.mark.samples.dubbo.api.domain.Book;
import com.mark.test.base.BaseTest;

/**
 *
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class IBookServiceTest extends BaseTest {
    
    @Resource
    private IBookService bookService;
    
    
    @Test
    public void testEcho(){
        System.out.println("test excuted ...");
    }
    
    
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        Assert.assertNotNull(book);
    }
    
}
