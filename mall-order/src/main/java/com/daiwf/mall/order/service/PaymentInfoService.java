package com.daiwf.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daiwf.common.utils.PageUtils;
import com.daiwf.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:37:08
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

