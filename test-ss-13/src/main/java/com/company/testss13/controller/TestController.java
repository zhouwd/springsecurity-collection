package com.company.testss13.controller;

import com.company.testss13.support.RetVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/delete")
    public RetVO list(){
        RetVO retVO = new RetVO();
        retVO.setMsg("delete");

        return retVO;

    }

}
