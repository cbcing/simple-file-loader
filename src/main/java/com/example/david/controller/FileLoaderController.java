package com.example.david.controller;

import com.example.david.entity.File;
import com.example.david.service.FileLoaderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by David on 5/9/17.
 */
@Controller
public class FileLoaderController {

    @Autowired
    File file;

    @Autowired
    FileLoaderServiceImpl fileLoaderServiceImpl;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showResult() {
        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile, Model model) {
        String fileName =  multipartFile.getOriginalFilename();
        file = fileLoaderServiceImpl.judgeFileType(fileName);
        model.addAttribute("message", file.open());
        return "result";
    }
}