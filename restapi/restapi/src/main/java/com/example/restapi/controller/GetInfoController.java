package com.example.restapi.controller;


import com.example.restapi.entity.Response;
import com.example.restapi.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetInfoController {

    @Autowired
    GetInfoService getInfoService;

    @GetMapping("/hello")
    public String show(){
        return "hello world!";
    }

    @GetMapping("/info")
    public ResponseEntity<Response> getInfo(){
        Response response = getInfoService.stageInfo();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

