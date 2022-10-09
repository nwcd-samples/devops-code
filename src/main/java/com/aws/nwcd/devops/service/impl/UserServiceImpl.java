package com.aws.nwcd.devops.service.impl;

import com.aws.nwcd.devops.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static String USER_NAME="devops";
    private static String PASS_WORD="devops1013";

    public boolean validUser(String userName){
        boolean flag = false;
        if(userName.equals(USER_NAME)){
            flag=true;
        }
        return flag;
    }

    public boolean validPassword(String password){
        boolean flag = false;
        if(password.equals(PASS_WORD)){
            flag=true;
        }
        return flag;
    }

    public String findUserName(String userName){
        if(USER_NAME.equals(userName)){
            return USER_NAME;
        }
        return "username is not password!";
    }
}
