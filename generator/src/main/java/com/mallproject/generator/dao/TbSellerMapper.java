package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbSeller;
import java.util.List;

public interface TbSellerMapper {
    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    TbSeller selectByPrimaryKey(String sellerId);

    List<TbSeller> selectAll();

    int updateByPrimaryKey(TbSeller record);
}