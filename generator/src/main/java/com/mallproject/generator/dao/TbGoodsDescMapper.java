package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbGoodsDesc;
import java.util.List;

public interface TbGoodsDescMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoodsDesc record);

    TbGoodsDesc selectByPrimaryKey(Long goodsId);

    List<TbGoodsDesc> selectAll();

    int updateByPrimaryKey(TbGoodsDesc record);
}