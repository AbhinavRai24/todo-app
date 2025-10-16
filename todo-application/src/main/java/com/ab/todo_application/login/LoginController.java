package com.ab.todo_application.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @Autowired
    private AuthenticationServices authenticationServices;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String goToLoginPage(){
        return "loginPage";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model){
        if(authenticationServices.authenticate(username, password)){
            model.put("username",username);
            model.put("password",password);
            return "welcomePage";
        }
        return "loginPage";
    }
}
