package com.mallproject.managerweb.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mallproject.common.entity.PageResult;
import com.mallproject.managerweb.dao.BrandMapper;
import com.mallproject.managerweb.domain.TbBrand;
import com.mallproject.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandMapper brandMapper;
    @Override
    public void deleteByPrimaryKey(Long[] ids) {
        for(Long id:ids){
            brandMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void insert(TbBrand record) {
         brandMapper.insert(record);
    }

    @Override
    public TbBrand selectByPrimaryKey(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbBrand> selectAll() {
        return brandMapper.selectAll();
    }

    @Override
    public PageResult selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);//分页
        Page<TbBrand> page=(Page<TbBrand>) brandMapper.selectAll();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void updateByPrimaryKey(TbBrand record) {
         brandMapper.updateByPrimaryKey(record);
    }
}
