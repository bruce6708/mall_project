package com.mallproject.managerweb.service.impl;

import com.mallproject.managerweb.dao.TbItemCatMapper;
import com.mallproject.managerweb.dao.TbItemMapper;
import com.mallproject.managerweb.domain.TbItemCat;
import com.mallproject.service.ItemCatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ItemCatService")
public class ItemCatServiceImpl implements ItemCatService {

    @Resource
   private TbItemCatMapper tbItemCatMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemCatMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItemCat record) {
        return tbItemCatMapper.insert(record);
    }

    @Override
    public TbItemCat selectByPrimaryKey(Long id) {
        return tbItemCatMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbItemCat> selectAll() {
        return tbItemCatMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TbItemCat record) {
        return tbItemCatMapper.updateByPrimaryKey(record);
    }
}
