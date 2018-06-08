/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.dubbo.api.service;

import com.mark.samples.dubbo.api.domain.Product;

/**
 * 
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public interface IProductService {

    /**
     * 根据产品Id获取
     * 
     * @param itemId
     * @return
     */
    Product getByItemId(String itemId);

}
