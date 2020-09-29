package com.daiwf.mall.product;

import com.daiwf.mall.product.entity.BrandEntity;
import com.daiwf.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test

    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
       brandEntity.setBrandId(1L);
        brandEntity.setName("华为");
        brandEntity.setDescript("华为的新手机");
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }

}
