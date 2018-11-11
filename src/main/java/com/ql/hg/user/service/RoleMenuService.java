package com.ql.hg.user.service;

import com.ql.hg.user.entity.RoleMenu;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HG
 * @since 2018-11-11
 */
public interface RoleMenuService extends IService<RoleMenu> {
	
	/**
	 * 通过roleId加载菜单
	 * @param roleId
	 * @return
	 */
	public  List<RoleMenu> loadMenuByRoleId(String roleId);

}
