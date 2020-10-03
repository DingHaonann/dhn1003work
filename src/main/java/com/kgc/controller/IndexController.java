package com.kgc.controller;


import com.github.pagehelper.PageHelper;
import com.kgc.pojo.Person;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping("/")
    public String sel(Model model) {
        PageHelper.orderBy("id desc");
        List<Person> selall = indexService.selall();
        model.addAttribute("list", selall);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Person person) {
        indexService.add(person);
        return "redirect:/";
    }
}
