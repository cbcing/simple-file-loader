package com.example.david.service;

import com.example.david.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by David on 5/9/17.
 */
@Service
public class FileLoaderServiceImpl implements FileLoaderService {
    @Autowired
    File file;

    @Override
    public File judgeFileType(String nameOfFile) {
        String[] suffixOfName = nameOfFile.split("\\.");
        String suffix = suffixOfName[suffixOfName.length-1];

        if (suffix.equals("txt")) {
            return new TxtFile();
        } else if (suffix.equals("docx") || suffix.equals("doc")) {
            return new WordFile();
        } else if (suffix.equals("jpg")) {
            return new JpgFile();
        } else if (suffix.equals("png")) {
            return new PngFile();
        } else if (suffix.equals("avi")) {
            return new AviFile();
        } else if (suffix.equals("mp3")) {
            return new Mp3File();
        } else {
            return file;
        }

    }
}
