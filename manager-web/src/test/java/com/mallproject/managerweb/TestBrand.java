package com.mallproject.managerweb;
import com.mallproject.common.entity.Result;
import com.mallproject.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.context.SpringBootTest;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ManagerWebApplication.class )//这里是启动类
public class TestBrand {
    @Autowired
    private BrandService brandService;

    @Test
    public void selectList(){
        System.out.println("--------查询列表开始--------");
        System.out.println(brandService.selectAll());
        System.out.println("--------查询列表结束--------");
    }

    @Test
    public void selectById(){
        System.out.println("--------根据id查询开始--------");
        Long id= Long.valueOf(1);
        System.out.println(brandService.selectByPrimaryKey(id));
        System.out.println("--------根据id查询结束--------");
    }




}