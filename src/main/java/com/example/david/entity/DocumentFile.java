package com.example.david.entity;

/**
 * Created by David on 5/9/17.
 */
public class DocumentFile extends File {
    @Override
    public String open() {
//        System.out.println("Open Document File Success!");
        return "Open Document File Success!";
    }
}
