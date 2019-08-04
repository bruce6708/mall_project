package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbFreightTemplate;
import java.util.List;

public interface TbFreightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbFreightTemplate record);

    TbFreightTemplate selectByPrimaryKey(Long id);

    List<TbFreightTemplate> selectAll();

    int updateByPrimaryKey(TbFreightTemplate record);
}