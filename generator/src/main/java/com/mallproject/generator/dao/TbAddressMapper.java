package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbAddress;
import java.util.List;

public interface TbAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbAddress record);

    TbAddress selectByPrimaryKey(Long id);

    List<TbAddress> selectAll();

    int updateByPrimaryKey(TbAddress record);
}