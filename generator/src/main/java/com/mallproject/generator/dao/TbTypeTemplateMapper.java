package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbTypeTemplate;
import java.util.List;

public interface TbTypeTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    TbTypeTemplate selectByPrimaryKey(Long id);

    List<TbTypeTemplate> selectAll();

    int updateByPrimaryKey(TbTypeTemplate record);
}