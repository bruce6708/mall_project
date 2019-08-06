package com.mallproject.managerweb.controller;


import com.mallproject.common.entity.PageResult;
import com.mallproject.common.entity.Result;
import com.mallproject.managerweb.domain.TbBrand;
import com.mallproject.service.BrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/brand")
public class BrandController {
    @Resource
    private BrandService brandService;

    @RequestMapping("/selectAll")
    @ApiOperation(value="获取品牌列表", notes="获取全部品牌列表")
    public List<TbBrand> selectAll(){
        return brandService.selectAll();
    }


    @RequestMapping("/selectPage")
    @ApiOperation(value="品牌列表分页", notes="分页获取品牌列表")
    public PageResult selectPage(int pageNum,int pageSize){
        return brandService.selectPage(pageNum,pageSize);
    }

    @RequestMapping("/add")
    @ApiOperation(value="增加品牌", notes="添加品牌")
    public Result addBrand(@RequestBody TbBrand record){
        try {
            brandService.insert(record);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/deleteBrand")
    @ApiOperation(value="删除品牌", notes="删除品牌")
    public int deleteBrand(long id){
        return brandService.deleteByPrimaryKey(id);
    }


}
