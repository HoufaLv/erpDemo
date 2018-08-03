package com.lv.mapper;

import com.lv.entity.School;

import java.util.List;

/**
 * Created by houfalv on 2018/7/11.
 */
public interface SchoolMapper {

    School selectSchoolWithPersonById(int id);

    List<School> listSchoolWithPerson();
}
