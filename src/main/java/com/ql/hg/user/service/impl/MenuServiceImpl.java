package com.ql.hg.user.service.impl;

import com.ql.hg.user.entity.Menu;
import com.ql.hg.user.mapper.MenuMapper;
import com.ql.hg.user.service.MenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HG
 * @since 2018-11-12
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

	@Autowired
	private BaseMapper<Menu> menuMapper;
	
	@Override
	public List<Menu> selectMenuList(Page<Menu> page, QueryWrapper<Menu> queryWrapper) {
		return menuMapper.selectPage(page, queryWrapper).getRecords();
	}

	@Override
	public int saveList(List<Menu> menus) {
		int i=0;
		for(Menu menu:menus){
			menu.setId(UUID.randomUUID().toString());
			menuMapper.insert(menu);
			i++;
		}
		return i;
	}

	
	
	@Override
	public int delete(Menu menu){
	   return 	menuMapper.deleteById(menu.getId());
	}
	
	
	@Override 
	public int update(Menu menu){
		return menuMapper.updateById(menu);
	}
	
	
}
