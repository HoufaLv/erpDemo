package com.lv.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lv.entity.User;
import com.lv.util.MybatisUtil;

public class MyBatisTestCase {

	private static SqlSession SqlSession;

	@Before
	public void init() throws IOException {
		SqlSession = MybatisUtil.getSqlSession();
	}

	@After
	public void release() {
		SqlSession.close();
	}

	/**
	 * 查询单个
	 * 
	 * @throws IOException
	 */
	@Test
	public void mybatisSelectOneTestCase() throws IOException {
		User user = SqlSession.selectOne("com.lv.mapper.UserMapper.findById", 1);
		System.out.println(user);
	}

	/**
	 * 插入单条记录
	 */
	@Test
	public void insertTestCase() {
		int insert = SqlSession.insert("com.lv.mapper.UserMapper.insertUser", new User("lucy", "lucy"));
		System.out.println(insert);
	}

	/**
	 * 更新一条记录
	 */
	@Test
	public void updateTestCase() {
		User user = SqlSession.selectOne("com.lv.mapper.UserMapper.findById", 1);
		user.setUsername("lili");
		user.setPassword("lili");

		int update = SqlSession.update("com.lv.mapper.UserMapper.updateUserById", user);
		Assert.assertEquals(update, 1);
	}
	
	/**
	 * 删除一条记录
	 */
	@Test
	public void deleteTestCase() {
		int delete = SqlSession.delete("com.lv.mapper.UserMapper.deleteUserById", 3);
		Assert.assertEquals(delete, 1);
	}
	
	/**
	 * 查询User 集合
	 */
	@Test
	public void listTestCase() {
		List<User> users = SqlSession.selectList("com.lv.mapper.UserMapper.listUser");
		for (User user : users) {
			System.out.println(user);
		}
	}
	
}
