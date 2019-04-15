package com.gupaoedu.vip.pattern.delegate.simple;

public class SimpleDelegateTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("加密",leader);
        boss.command("架构",leader);
    }
}
