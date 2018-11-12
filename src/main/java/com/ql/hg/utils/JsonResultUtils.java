package com.ql.hg.utils;

import java.util.HashMap;
import java.util.Map;
import com.alibaba.fastjson.JSON;

public class JsonResultUtils {
	
	public static String mapToJsonString(String successCode,String reason){
		Map<String,String> map =  new HashMap<>();
		map.put("successCode", successCode);
		map.put("reason", reason);
		String result =JSON.toJSONString(map);
		return result;
	}

	public static String mapToJsonString(Map<String, String> result) {
		String resultJson =JSON.toJSONString(result);
		return resultJson;
	}

}
