package com.lv.mapper;

import com.lv.entity.User;
import com.lv.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by houfalv on 2018/7/10.
 */
public class UserMapperTest {

    private static SqlSession sqlsession;
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserMapperTest.class);
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
    public void testPage(){
        List<User> userList = userMapper.findByPage(0,3);
        for (User user : userList) {
            logger.info(user.toString());
        }
    }

    @Test
    public void testRestultMap(){
        User user = userMapper.findById(1);
        logger.info(user.toString());
    }

    @Test
    public void testQueryByMap(){
        Map map = new HashMap();
        map.put("id",1);
        map.put("username","lili");

        User user = userMapper.findByMap(map);
        logger.info(user.toString());
    }
}