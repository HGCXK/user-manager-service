package com.ql.hg.user.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.hg.user.entity.Menu;
import com.ql.hg.user.service.MenuService;
import com.ql.hg.utils.JsonResultUtils;
import com.ql.hg.utils.PageUtils;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HG
 * @since 2018-11-12
 */
@Controller
@RequestMapping("/menu")
@EnableRedisHttpSession
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	/*@Resource(name="redisTemplate")
    private ListOperations<String, String> listOps;*/
	
	@Resource(name="redisTemplate")
	private HashOperations<String, String, Object> hashOperation;
	
	
	
	@RequestMapping("/index")
	public String list(){
		return "/user/menu/menuindex.html";
	}
	
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Menu> list(ModelMap modelMap){
		Page<Menu> page = new PageUtils().getPage(modelMap);
		QueryWrapper<Menu> wrapper = new QueryWrapper<>();
		return menuService.selectMenuList(page, wrapper);
	}
	
	
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(ModelMap map,Menu menu){
		menu.setId(UUID.randomUUID().toString());
		boolean save = menuService.save(menu);
		return  updateRedis(new ModelMap(),menu);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(Menu menu){
		int update = menuService.update(menu);
		return  updateRedis(new ModelMap(),menu);
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Menu menu){
		int delete = menuService.delete(menu);
		Map<String, String> result = new HashMap<>();
		result.put("success", +delete+"");
		updateRedis(new ModelMap(), new Menu());
		return JsonResultUtils.mapToJsonString(result);
	}
	
	@RequestMapping("/updateRedis")
	public String updateRedis(ModelMap map,Menu menu){
		//从数据库中加载所有数据
		List<Menu> list = list(map);
		hashOperation.put("menu", "", "");
		for(Menu menuTmp:list){
			hashOperation.put("menu",menuTmp.getId(), JSON.toJSONString(menuTmp));
		}
		return JsonResultUtils.mapToJsonString("200", "");
	}
	
	
}

