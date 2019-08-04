package com.mallproject.service;

import com.mallproject.managerweb.domain.TbItem;

import java.util.List;

public interface ItemService {
    public int deleteByPrimaryKey(Long id);

    public int insert(TbItem record);

    public TbItem selectByPrimaryKey(Long id);

    public List<TbItem> selectAll();

    public int updateByPrimaryKey(TbItem record);
}
