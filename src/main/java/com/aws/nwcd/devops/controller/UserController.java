package com.aws.nwcd.devops.controller;


import com.aws.nwcd.devops.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String  userlogin(String userName,String passWord){
        String result="";
        if(null!=userName&&null!=passWord){
           if(!userService.validUser(userName)){
               result ="userNameError";
           }else if(!userService.validPassword(passWord)){
               result ="passWordError";
           }else{
               result="success";
           }

        }
        return result;
    }

    @RequestMapping(value = "/finduser")
    public String findPassword(String userName){
       return  userService.findUserName(userName);
    }
}
