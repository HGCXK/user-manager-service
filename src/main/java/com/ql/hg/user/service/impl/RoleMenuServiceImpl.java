package com.ql.hg.user.service.impl;

import com.ql.hg.user.entity.RoleMenu;
import com.ql.hg.user.mapper.RoleMenuMapper;
import com.ql.hg.user.service.RoleMenuService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HG
 * @since 2018-11-11
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {

	@Autowired
	private BaseMapper<RoleMenu> roleMenuMapper;
	
	@Override
	public List<RoleMenu> loadMenuByRoleId(String roleId) {
		return roleMenuMapper.selectList(new QueryWrapper<RoleMenu>().eq("role_id", roleId));
	}
	
	

}
