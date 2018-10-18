package com.ql.hg.user.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.injector.methods.Update;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.hg.user.entity.Menu;
import com.ql.hg.user.service.MenuService;
import com.ql.hg.utils.PageUtils;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HG
 * @since 2018-09-20
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	
	
	@RequestMapping("/index")
	public String list(){
		return "/user/menu/menuindex.html";
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Menu>list(ModelMap modelMap){
		Page<Menu> page = new PageUtils().getPage(modelMap);
		QueryWrapper<Menu> wrapper = new QueryWrapper<>();
		return menuService.selectMenuList(page, wrapper);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(ModelMap map,Menu menu){
		return  menuService.save(menu)+"";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(Menu menu){
		return menuService.update(menu)+"";
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Menu menu){
		return menuService.delete(menu)+"";
	}
	
	


}

