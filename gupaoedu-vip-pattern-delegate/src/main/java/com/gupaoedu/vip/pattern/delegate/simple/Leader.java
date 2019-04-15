package com.gupaoedu.vip.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String,IEmployee> register = new HashMap<String, IEmployee>();

    public  Leader(){

        register.put("加密" ,new EmployeeA());
        register.put("架构" ,new EmployeeB());

    }

    /**
     * 预先知道每个员工的特长，根据每个员工的特长来分发任务
     * @param command
     */
    public void doing(String command){

        register.get(command).doing(command);

    }
}
