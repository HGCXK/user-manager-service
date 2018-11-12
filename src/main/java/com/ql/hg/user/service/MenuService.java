package com.ql.hg.user.service;

import com.ql.hg.user.entity.Menu;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HG
 * @since 2018-11-12
 */
public interface MenuService extends IService<Menu> {

	
List<Menu> selectMenuList(Page<Menu> page, QueryWrapper<Menu> queryWrapper);
	
	int saveList(List<Menu> menus);
	
	
	int delete(Menu menu);
	
	int update(Menu menu);
}
