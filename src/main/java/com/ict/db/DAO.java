package com.ict.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<VO> getDynamic(String search, String keyword){
		List<VO> list = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", search);
		map.put("keyword", keyword);
		list = sqlSessionTemplate.selectList("list", map);
		return list;
	}
}
