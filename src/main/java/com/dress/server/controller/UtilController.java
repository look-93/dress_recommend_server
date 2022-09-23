package com.dress.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/util")
public class UtilController {

    @PostMapping("/uploadFile")
    public ResponseEntity uploadFile(@RequestParam("imgFile") MultipartFile imgFile){
        //System.out.println(imgFile);
        String uploadUrl = "";
        File file= new File("C:\\finalproject\\dress_recommend_server\\src\\main\\resources\\static\\usedreview\\"+imgFile.getOriginalFilename());
        try {
            imgFile.transferTo(file);
            System.out.println(file);
            uploadUrl = "http://localhost:8080/static-url/usedreview/"+imgFile.getOriginalFilename();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return ResponseEntity.ok().body(uploadUrl);
    }
    @PostMapping("/uploadProfile")
    public ResponseEntity uploadProfile(@RequestParam("imgFile") MultipartFile imgFile){
        //System.out.println(imgFile);
        String uploadUrl = "";
        File file= new File("C:\\finalproject\\dress_recommend_server\\src\\main\\resources\\static\\usedreview\\uploadProfile\\"+imgFile.getOriginalFilename());
        try {
            imgFile.transferTo(file);
            //System.out.println(file);
            uploadUrl = "http://localhost:8080/static-url/usedreview/uploadProfile/"+imgFile.getOriginalFilename();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return ResponseEntity.ok().body(uploadUrl);

    }

}
