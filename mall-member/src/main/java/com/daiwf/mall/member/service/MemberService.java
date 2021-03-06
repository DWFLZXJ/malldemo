package com.daiwf.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daiwf.common.utils.PageUtils;
import com.daiwf.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:27:17
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

