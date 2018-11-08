package com.ql.hg.utils;

import java.util.Map;
import com.alibaba.fastjson.JSON;

public class JsonResultUtils {
	
	public static String mapToJsonString(Map<String, String> result2){
		String result =JSON.toJSONString(result2);
		return result;
	}

}
