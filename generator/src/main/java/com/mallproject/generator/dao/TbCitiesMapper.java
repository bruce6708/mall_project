package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbCities;
import java.util.List;

public interface TbCitiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    TbCities selectByPrimaryKey(Integer id);

    List<TbCities> selectAll();

    int updateByPrimaryKey(TbCities record);
}