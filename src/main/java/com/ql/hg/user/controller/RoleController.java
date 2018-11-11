package com.ql.hg.user.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ql.hg.user.entity.Role;
import com.ql.hg.user.service.RoleMenuService;
import com.ql.hg.user.service.RoleService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HG
 * @since 2018-11-08
 */
@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired RoleService service;
	
	@Autowired RoleMenuService roleMenuService;
	
	@RequestMapping("loadById")
	@ResponseBody
	public Map<String, Object>  loadRoleById(ModelMap model) {
		String role_id =  (String) model.get("role_id");
		Map<String, Object> map = new HashMap<>();
		map.put("role",service.loadRoleById(role_id) );
		map.put("menus",roleMenuService.loadMenuByRoleId(role_id) );
		return map;
	}

}

