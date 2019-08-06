package com.mallproject.service;

import com.mallproject.common.entity.PageResult;
import com.mallproject.managerweb.domain.TbBrand;

import java.util.List;
/**
 * 品牌接口
 */
public interface BrandService {
    public int deleteByPrimaryKey(Long id);

    public void insert(TbBrand record);

    public TbBrand selectByPrimaryKey(Long id);

    public    List<TbBrand> selectAll();      //品牌列表

    /**
     * 品牌分页
     * @param pageNum  当前页码
     * @param pageSize  每页记录数
     * @return
     */
    public PageResult selectPage(int pageNum,int pageSize);

    public  int updateByPrimaryKey(TbBrand record);
}
