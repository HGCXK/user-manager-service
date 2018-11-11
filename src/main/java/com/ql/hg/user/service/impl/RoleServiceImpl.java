package com.ql.hg.user.service.impl;

import com.ql.hg.user.entity.Role;
import com.ql.hg.user.entity.RoleMenu;
import com.ql.hg.user.mapper.RoleMapper;
import com.ql.hg.user.service.RoleService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HG
 * @since 2018-11-08
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

	@Autowired
	private BaseMapper<Role> roleMapper; 
	
	@Autowired
	private BaseMapper<RoleMenu> roleMenuMapper;
	
	@Override
	public Role loadRoleById(String roleId) {
		Role role  = roleMapper.selectById(roleId);
		return role;
	}

}
