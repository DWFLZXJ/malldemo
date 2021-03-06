package com.daiwf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daiwf.common.utils.PageUtils;
import com.daiwf.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:04:32
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

