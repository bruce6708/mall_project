package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbOrderItem;
import java.util.List;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    TbOrderItem selectByPrimaryKey(Long id);

    List<TbOrderItem> selectAll();

    int updateByPrimaryKey(TbOrderItem record);
}