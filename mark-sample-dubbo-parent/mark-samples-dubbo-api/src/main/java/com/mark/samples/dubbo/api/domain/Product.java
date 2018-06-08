/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.dubbo.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author mark
 * @date 2017年10月16日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class Product implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -3689183527231621757L;

    /**
     * 产品Id
     */
    private String itemId;
    
    /**
     * 标题
     */
    private String title;
    
    /**
     * 价格
     */
    private BigDecimal price;
    
    /**
     * 图片
     */
    private List<String> imageList;
    
    /**
     * 描述
     */
    private String description;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
