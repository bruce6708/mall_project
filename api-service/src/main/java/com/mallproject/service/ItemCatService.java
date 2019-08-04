package com.mallproject.service;

import com.mallproject.managerweb.domain.TbItemCat;

import java.util.List;

public interface ItemCatService {
    public int deleteByPrimaryKey(Long id);

    public int insert(TbItemCat record);

    public TbItemCat selectByPrimaryKey(Long id);

    public List<TbItemCat> selectAll();

    public int updateByPrimaryKey(TbItemCat record);
}
