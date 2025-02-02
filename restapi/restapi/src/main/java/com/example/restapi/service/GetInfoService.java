package com.example.restapi.service;

import com.example.restapi.entity.Response;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class GetInfoService {
    public Response stageInfo() {
        String currentTime = Instant.now().toString();

        return new Response("igbokwevictor122@gmail.com", currentTime, "https://github.com/meysdays/HNG12/tree/master/restapi");
    }
}
