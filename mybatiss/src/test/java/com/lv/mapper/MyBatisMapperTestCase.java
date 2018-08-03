package com.lv.mapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lv.entity.Person;
import com.lv.entity.School;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import com.lv.entity.User;
import com.lv.util.MybatisUtil;

public class MyBatisMapperTestCase {

	private static SqlSession sqlsession;
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(MyBatisMapperTestCase.class);
	private static UserMapper userMapper;
	private static PersonMapper personMapper;
	private static SchoolMapper schoolMapper;
	
	@Before
	public void init() throws IOException {
		sqlsession = MybatisUtil.getSqlSession();
		userMapper = sqlsession.getMapper(UserMapper.class);
		personMapper = sqlsession.getMapper(PersonMapper.class);
		schoolMapper = sqlsession.getMapper(SchoolMapper.class);
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

    /**
     * 多对一查询，查询所有学生对象 并匹配学校
     */
	@Test
	public void manyToOne(){
		List<Person> personList = personMapper.listPerson();
		for (Person person : personList) {
            System.out.println(person);
        }
	}

    /**
     * 多对一查询，根据id查询学生对象，并匹配学校
     */
    @Test
    public void selectByPersonId(){
        Person person = personMapper.selectByPersonId(1);
        System.out.println(person);
    }

    /**
     * 根据学校查询对应的学生列表
     */
    @Test
    public void listPersonWithSchool(){
        List<School> schools = schoolMapper.listSchoolWithPerson();
        for (School school : schools) {
            System.out.println(school);
        }
    }

    @Test
    public void selectPersonBySchoolId(){
        School school = schoolMapper.selectSchoolWithPersonById(2);
        System.out.println(school);
    }

    @Test
    public void selectSchoolWithPersonList(){
        List<School> schools = schoolMapper.listSchoolWithPerson();
        for (School school : schools) {
            System.out.println(school);
        }
    }

    @Test
    public void selectByIf(){
        Map<String,Object> paramMap = new HashMap<String, Object>();
        paramMap.put("id",1);

        Person person = personMapper.selectByMap(paramMap);
        System.out.println(person);
    }

    @Test
    public void selectByChoose(){
        //通过指定的条件查询，如果没有给指定条件，就看sql 怎么写
        Map<String,Object> paramMap = new HashMap<String, Object>();

       //paramMap.put("name","apple");
        //paramMap.put("id",6);
        paramMap.put("gender","男");

        List<Person> personList = personMapper.selectByNameOrGender(paramMap);

        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void selectByWhere(){
        Map<String,Object> paramMap = new HashMap<String, Object>();

        paramMap.put("name","max");
        paramMap.put("gender","男");
        List<Person> personList = personMapper.selectByTrim(paramMap);

        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void batchInsert(){
        List<Person> personList = new ArrayList<Person>();
        Person person = new Person();
        person.setName("toms");
        person.setGender("男");
        person.setSchoolId(1);
        personList.add(person);

        personMapper.batchInsert(personList);
    }
}
