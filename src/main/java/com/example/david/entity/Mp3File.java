package com.example.david.entity;

/**
 * Created by David on 5/9/17.
 */
public class Mp3File extends AudioFile {
    @Override
    public String open() {
//        System.out.println("Open Mp3 File Success!");
        return "Open Mp3 File Success!";
    }
}
