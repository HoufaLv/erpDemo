package com.lv.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static final Boolean IS_AUTOCOMMIT = true;
	
	/**
	 * 返回SqlSessionFactory 对象
	 * @return
	 * @throws IOException
	 */
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		return new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
	}
	
	/**
	 * 返回SqlSession
	 * @return
	 * @throws IOException
	 */
	public static SqlSession getSqlSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		return sqlSessionFactory.openSession(IS_AUTOCOMMIT);
	}
	
}
