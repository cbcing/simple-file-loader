package com.example.david.entity;

/**
 * Created by David on 5/9/17.
 */
public class PngFile extends ImageFile {
    @Override
    public String open() {
        System.out.println("Open Png File Success!");
        return "Open Png File Success!";
    }
}
