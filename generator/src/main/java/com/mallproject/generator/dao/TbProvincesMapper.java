package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbProvinces;
import java.util.List;

public interface TbProvincesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbProvinces record);

    TbProvinces selectByPrimaryKey(Integer id);

    List<TbProvinces> selectAll();

    int updateByPrimaryKey(TbProvinces record);
}