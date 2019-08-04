package com.mallproject.managerweb.controller;

import com.mallproject.managerweb.domain.TbItem;
import com.mallproject.service.ItemService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Item")
public class ItemController {
    @Resource
    private ItemService itemService;
    @RequestMapping("/selectAll")
    @ApiOperation(value="获取类目列表", notes="获取全部类目列表")
    public List<TbItem> selectAll(){
        return itemService.selectAll();
    }
}
