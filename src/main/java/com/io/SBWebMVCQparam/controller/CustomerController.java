package com.io.SBWebMVCQparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class CustomerController {
    @GetMapping("/customer")
    public String getCustName(@RequestParam("id") Integer custId, Model model){
        if(custId ==101){
            model.addAttribute("name","john");
        }
        else if(custId ==102){
            model.addAttribute("name","Rudra");
        }
        else{
            model.addAttribute("name","Unknown");
        }

        return "cust-details";
    }

    @GetMapping("/test")
    public String getCustNames(@RequestParam("id") Integer[] custId,Model model){
        System.out.println("## : " + Arrays.toString(custId));
        model.addAttribute("msg","Id's received - "+Arrays.toString(custId));
        return "cust-details";
    }
}
