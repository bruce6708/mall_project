package com.mallproject.service;

import com.mallproject.common.entity.PageResult;
import com.mallproject.managerweb.domain.TbBrand;

import java.util.List;
/**
 * 品牌接口
 */
public interface BrandService {
    /**
     * 删除
     * @param ids
     */
    public void deleteByPrimaryKey(Long[] ids);

    /**
     * 增加品牌
     * @param record
     */
    public void insert(TbBrand record);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public TbBrand selectByPrimaryKey(Long id);

    public    List<TbBrand> selectAll();      //品牌列表

    /**
     * 品牌分页
     * @param pageNum  当前页码
     * @param pageSize  每页记录数
     * @return
     */
    public PageResult selectPage(int pageNum,int pageSize);

    public  void updateByPrimaryKey(TbBrand record);
}
