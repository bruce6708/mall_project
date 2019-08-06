package com.mallproject.managerweb.dao;


import com.mallproject.managerweb.domain.TbBrand;

import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Long id);

    void insert(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    List<TbBrand> selectAll();

    int updateByPrimaryKey(TbBrand record);
}