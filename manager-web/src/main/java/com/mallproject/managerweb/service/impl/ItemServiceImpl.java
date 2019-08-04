package com.mallproject.managerweb.service.impl;

import com.mallproject.managerweb.dao.TbItemMapper;
import com.mallproject.managerweb.domain.TbItem;
import com.mallproject.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ItemService")
public class ItemServiceImpl implements ItemService {
    @Resource
    private TbItemMapper tbItemMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbItem record) {
        return tbItemMapper.insert(record);
    }

    @Override
    public TbItem selectByPrimaryKey(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbItem> selectAll() {
        return tbItemMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TbItem record) {
        return tbItemMapper.updateByPrimaryKey(record);
    }
}
