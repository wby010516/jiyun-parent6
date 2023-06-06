package com.jiyun.order.controller;

import com.jiyun.goods.feign.GoodsFeign;
import com.jiyun.goods.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private GoodsFeign goodsFeign;

    @GetMapping
    public Goods getGoodsById(){
        return goodsFeign.getGoodsById(2);
    }

}
