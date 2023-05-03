package com.example.testrestservice.service;

import com.example.testrestservice.model.Request;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class ModifyRequestSystemTime implements ModifyRequestService{
    @Override
    public void modifyRq(Request request){
        request.setSystemTime(LocalDate.now().toString()); //Установить текущее время и преобразовать в строку
        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8082/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
