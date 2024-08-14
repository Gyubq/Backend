package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Controller
@Slf4j
public class SampleController {

    @GetMapping("/exUpload")
    public String exUpload() {
        log.info("/exUpload..........");
        return "sample/exUpload";
    }


    @PostMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        for (MultipartFile file : files) {
            log.info("----------------------------------");
            log.info("name:" + file.getOriginalFilename());
            log.info("size:" + file.getSize());
            
        }
    }

}