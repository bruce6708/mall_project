package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbAreas;
import java.util.List;

public interface TbAreasMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAreas record);

    TbAreas selectByPrimaryKey(Integer id);

    List<TbAreas> selectAll();

    int updateByPrimaryKey(TbAreas record);
}