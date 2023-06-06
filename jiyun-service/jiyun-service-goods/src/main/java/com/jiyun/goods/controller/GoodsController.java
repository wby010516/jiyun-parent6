package com.jiyun.goods.controller;

import com.jiyun.goods.mapper.GoodsMapper;
import com.jiyun.goods.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping("/{id}")
    public Goods getGoodsById(@PathVariable Integer id){
        return goodsMapper.selectById(id);
    }

}
