package com.ql.hg.utils;

import org.springframework.ui.ModelMap;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class PageUtils<T> {
	
	
	public Page<T> getPage(ModelMap map){
		Integer page =  (Integer) map.get("page");
		Integer limit =  (Integer) map.get("limit");
		if(null == page){
			page = 1;
		}
		if(null == limit ){
			limit = 20;
		}
		return  new Page<T>(page, limit );
	}

}
