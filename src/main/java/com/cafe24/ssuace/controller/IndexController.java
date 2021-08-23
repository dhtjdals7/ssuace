package com.cafe24.ssuace.controller;

import com.cafe24.ssuace.service.IndexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController
{
    @Autowired
    private IndexService indexService;

    @GetMapping("/home")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model model)
    {
        indexService.updateMember();
        model.addAttribute("name", indexService.getMember());

        return "index";
    }
}