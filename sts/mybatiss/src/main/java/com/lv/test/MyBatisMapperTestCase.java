package com.lv.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import com.lv.entity.User;
import com.lv.mapper.UserMapper;
import com.lv.util.MybatisUtil;

public class MyBatisMapperTestCase {

	private static SqlSession sqlsession;
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(MyBatisMapperTestCase.class);
	private static UserMapper userMapper;
	
	@Before
	public void init() throws IOException {
		sqlsession = MybatisUtil.getSqlSession();
		userMapper = sqlsession.getMapper(UserMapper.class);
	}
	@After
	public void destory() {
		sqlsession.close();
	}
	
	@Test
	public void mapperInsertTestCase() {
		User user = userMapper.findById(1);
		logger.info(user.toString());
	}
	
	@Test
	public void mapperLimitTestCase() {
		
	}
	
	
}
