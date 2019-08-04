package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbSeckillOrder;
import java.util.List;

public interface TbSeckillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillOrder record);

    TbSeckillOrder selectByPrimaryKey(Long id);

    List<TbSeckillOrder> selectAll();

    int updateByPrimaryKey(TbSeckillOrder record);
}