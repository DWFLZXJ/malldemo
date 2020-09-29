package com.daiwf.mall.member.dao;

import com.daiwf.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author daiwf
 * @email 997940675@qq.com
 * @date 2020-09-29 21:27:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
