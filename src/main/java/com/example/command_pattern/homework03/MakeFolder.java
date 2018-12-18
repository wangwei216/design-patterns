package com.example.command_pattern.homework03;

import java.io.File;

public class MakeFolder {

    public void createMulu(String name) {
        File Mulu = new File(name);
        Mulu.mkdir();
        System.out.println("创建一个目录---->");
    }

    public void deleteMulu(String name) {
        File Mulu = new File(name);
        Mulu.delete();
        System.out.println("删除目录---->");
    }

}
