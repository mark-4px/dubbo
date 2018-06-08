/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.dubbo.provider.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.mark.samples.dubbo.api.domain.Book;
import com.mark.samples.dubbo.api.service.IBookService;

/**
 *
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@Service("bookService")
public class BookService implements IBookService {

    @Override
    public Book getById(Integer id) {
        Book book = new Book();
        book.setId(id);
        book.setName("商战：电商时代");
        book.setImage("http://bjkjjggysfook.markwuwei.com/shangzhanshidai.jpg");
        book.setCategory("IT互联网");
        book.setPrice(new BigDecimal(51));
        book.setDescription("商战：电商时代（吴晓波撰稿，CCTV财经频道年度巨献《商战之电商风云》同名图书，马云、柳传志、刘强东、李国庆、雷军等电商巨子首次同台、深度解读：要么电商，要么死！）");
        book.setCreateTime(new Date());
        return book;
    }

}
