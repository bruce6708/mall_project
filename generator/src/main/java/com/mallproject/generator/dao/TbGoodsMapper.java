package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbGoods;
import java.util.List;

public interface TbGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    TbGoods selectByPrimaryKey(Long id);

    List<TbGoods> selectAll();

    int updateByPrimaryKey(TbGoods record);
}