package com.lv.mapper;

import com.lv.entity.User;

public interface UserMapper {
	
	/**
	 * 根据id 查询
	 * @param id
	 * @return
	 */
	User findById(int id);
	
	/**
	 * 查询分页数据
	 * @param start
	 * @param pagesize
	 * @return
	 */
	User findByPage(int start,int pagesize);
}	
