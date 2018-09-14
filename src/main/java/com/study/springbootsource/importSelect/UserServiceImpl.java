package com.study.springbootsource.importSelect;

@EnableUserService
public class UserServiceImpl implements UserService{

    @Override
    public void say(){
        System.out.println("hello user-service");
    }
}
