package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbContentCategory;
import java.util.List;

public interface TbContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    TbContentCategory selectByPrimaryKey(Long id);

    List<TbContentCategory> selectAll();

    int updateByPrimaryKey(TbContentCategory record);
}