package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbSpecificationOption;
import java.util.List;

public interface TbSpecificationOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSpecificationOption record);

    TbSpecificationOption selectByPrimaryKey(Long id);

    List<TbSpecificationOption> selectAll();

    int updateByPrimaryKey(TbSpecificationOption record);
}