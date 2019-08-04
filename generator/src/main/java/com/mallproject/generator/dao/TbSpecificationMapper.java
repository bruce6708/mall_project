package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbSpecification;
import java.util.List;

public interface TbSpecificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    TbSpecification selectByPrimaryKey(Long id);

    List<TbSpecification> selectAll();

    int updateByPrimaryKey(TbSpecification record);
}