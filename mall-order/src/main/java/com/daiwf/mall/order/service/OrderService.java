package com.daiwf.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daiwf.common.utils.PageUtils;
import com.daiwf.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:37:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

