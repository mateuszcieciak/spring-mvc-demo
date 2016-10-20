package com.mcieciak.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //    controller method to show the initial html form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";

    }

    //    controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //    controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        //      read the req parameter from html form
        String theName = request.getParameter("studentName");

        //      convert data to allCaps
        theName = theName.toUpperCase();

        //      create the message
        String result = "yo! " + theName;

        //      add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    //    controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {
        //      read the req parameter from html form is by @RequestParam
        //      convert data to allCaps
        theName = theName.toUpperCase();

        //      create the message
        String result = "Hey my friend! " + theName;

        //      add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }


}
