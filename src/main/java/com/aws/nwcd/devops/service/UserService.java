package com.aws.nwcd.devops.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {


    public boolean validUser(String userName);

    public boolean validPassword(String password);

    public String findUserName(String userName);

}
