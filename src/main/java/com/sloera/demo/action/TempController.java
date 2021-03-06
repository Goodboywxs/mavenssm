package com.sloera.demo.action;

import com.sloera.demo.service.TempService;
import com.sloera.mng.core.action.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "temp/main")
public class TempController extends BaseController {
    @Autowired
    private TempService tempService;

    @RequestMapping(value = "index")
    public String index(HttpServletResponse response){
        System.out.println("index");
        System.out.println(tempService.test("hello"));
//        return "default";
        return "test";
    }
}
