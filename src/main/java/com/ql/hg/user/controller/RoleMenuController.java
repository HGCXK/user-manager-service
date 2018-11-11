package com.ql.hg.user.controller;


import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HG
 * @since 2018-11-11
 */
@RestController
@RequestMapping("/roleMenu")
public class RoleMenuController {
	@RequestMapping("/loadRoleMenu")
	public String loadRoleMenu(ModelMap model){
		String roleId = (String) model.get("role_id");
		return "";
	}
	

}

