package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbSeckillGoods;
import java.util.List;

public interface TbSeckillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillGoods record);

    TbSeckillGoods selectByPrimaryKey(Long id);

    List<TbSeckillGoods> selectAll();

    int updateByPrimaryKey(TbSeckillGoods record);
}