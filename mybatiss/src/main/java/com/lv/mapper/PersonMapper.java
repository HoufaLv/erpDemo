package com.lv.mapper;

import com.lv.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by houfalv on 2018/7/10.
 */
public interface PersonMapper {

    /**
     * 查询所有person
     * @return
     */
    List<Person> listPerson();


    /**
     * 根据id 查询 person
     * @param id
     * @return
     */
    Person selectByPersonId(int id);

    /**
     * @param map
     * @return
     */
    Person selectByMap(Map map);

    /**
     *
     * @param map
     * @return
     */
    List<Person> selectByNameOrGender(Map map);

    List<Person> selectByWhere(Map map);

    List<Person> selectByTrim(Map map);

    int batchInsert(List<Person> personList);
}
