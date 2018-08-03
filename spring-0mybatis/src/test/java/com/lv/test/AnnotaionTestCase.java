package com.lv.test;

import com.lv.Application;
import com.lv.entity.Person;
import com.lv.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by houfalv on 2018/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class AnnotaionTestCase {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testInsert(){
        Person person = new Person();
        person.setGender("男");
        person.setName("张三");
        person.setSchoolId(2);

        personMapper.insertSelective(person);
    }
}
