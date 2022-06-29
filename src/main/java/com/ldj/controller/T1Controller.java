package com.ldj.controller;


import com.ldj.service.IT1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ldj
 * @since 2022-06-28
 */
@Controller
@RequestMapping("/t1")
public class T1Controller {

    @Autowired
    private IT1Service it1Service;

    @GetMapping("/test")
    private void test(String str){
//        it1Service.test();
        it1Service.saveRedis(str);
    }

    @GetMapping("/getValue")
    private void getValue(){
        it1Service.getValue();
    }

}
