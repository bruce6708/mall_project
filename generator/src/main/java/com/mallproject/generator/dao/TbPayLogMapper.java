package com.mallproject.generator.dao;

import com.mallproject.generator.domain.TbPayLog;
import java.util.List;

public interface TbPayLogMapper {
    int deleteByPrimaryKey(String outTradeNo);

    int insert(TbPayLog record);

    TbPayLog selectByPrimaryKey(String outTradeNo);

    List<TbPayLog> selectAll();

    int updateByPrimaryKey(TbPayLog record);
}