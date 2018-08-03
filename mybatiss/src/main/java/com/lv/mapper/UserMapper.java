package com.lv.mapper;

import com.lv.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
	List<User> findByPage(@Param("start") int start, @Param("pagesize") int pagesize);

    /**
     * 使用Map 作为查询参数
     * @param map
     * @return
     */
	User findByMap(Map map);

}	
