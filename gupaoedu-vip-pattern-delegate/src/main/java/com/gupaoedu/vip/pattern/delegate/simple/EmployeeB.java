package com.gupaoedu.vip.pattern.delegate.simple;

public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeB：我擅长" + command);
    }
}
