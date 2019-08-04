package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbBrand;
import java.util.List;

public interface TbBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    List<TbBrand> selectAll();

    int updateByPrimaryKey(TbBrand record);
}