package com.ql.hg.user.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ql.hg.user.entity.Role;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HG
 * @since 2018-11-08
 */
public interface RoleService extends IService<Role> {
	
	/**
	 * 加载角色
	 * @param roleId
	 * @return
	 */
	public Role loadRoleById(String roleId);
}
