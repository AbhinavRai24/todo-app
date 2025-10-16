package com.ab.todo_application.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String login(){
//        logger.debug("Query Param {}",name);
        return "loginPage";
    }
}
