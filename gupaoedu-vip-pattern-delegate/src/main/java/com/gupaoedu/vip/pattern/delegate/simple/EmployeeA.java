package com.gupaoedu.vip.pattern.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeA：我擅长" + command);
    }
}
