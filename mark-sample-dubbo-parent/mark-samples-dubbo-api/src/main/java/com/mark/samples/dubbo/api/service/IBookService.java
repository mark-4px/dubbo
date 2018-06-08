/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.dubbo.api.service;

import com.mark.samples.dubbo.api.domain.Book;

/**
 *
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public interface IBookService {
    
    /**
     * 根据Id获取
     * 
     * @param id
     * @return
     */
    Book getById(Integer id);
    
}
