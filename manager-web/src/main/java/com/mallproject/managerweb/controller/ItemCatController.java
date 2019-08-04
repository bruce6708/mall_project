package com.mallproject.managerweb.controller;

import com.mallproject.managerweb.domain.TbBrand;
import com.mallproject.managerweb.domain.TbItemCat;
import com.mallproject.service.ItemCatService;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/ItemCat")
public class ItemCatController {

    @Resource
    private ItemCatService itemCatService;

    @RequestMapping("/selectAll")
    @ApiOperation(value="获取类目列表", notes="获取全部类目列表")
    public List<TbItemCat> selectAll(){
        return itemCatService.selectAll();
    }
}
