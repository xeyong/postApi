package com.example.postapi.controller;

import com.example.postapi.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){

        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key:" + stringObjectEntry.getKey());
            System.out.println("value: "+ stringObjectEntry.getValue());
        });
    }

    @PostMapping("/post02")
    public void post02(@RequestBody PostRequestDto postRequestDto){//body에 객체를 넣을때는 get과는 다르게 @RequestBody를 써줘야한다.
        System.out.println(postRequestDto.toString());
    }

}
