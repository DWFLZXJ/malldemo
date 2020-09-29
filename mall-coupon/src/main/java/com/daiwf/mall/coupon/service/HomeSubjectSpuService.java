package com.daiwf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daiwf.common.utils.PageUtils;
import com.daiwf.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:04:32
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

