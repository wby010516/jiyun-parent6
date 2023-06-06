package com.jiyun.goods.feign;

import com.jiyun.goods.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "jiyun-service-goods")
public interface GoodsFeign {

    @GetMapping("goods/{id}")
    Goods getGoodsById(@PathVariable Integer id);

}
