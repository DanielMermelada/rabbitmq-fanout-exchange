package com.example.demo.controller;

import com.example.demo.service.rabbitmq.ServicePublishResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private ServicePublishResource servicePublishResource;

    public ApplicationController(ServicePublishResource servicePublishResource) {
        this.servicePublishResource = servicePublishResource;
    }

    @GetMapping(path = "/send-resource/{resource}")
    void sendResource(@PathVariable String resource){
        servicePublishResource.sendResource(resource);
    }

    @GetMapping(path = "/send-instructions/{instructions}")
    void sendInstructions(@PathVariable String instructions){
        servicePublishResource.sendInstructions(instructions);
    }
    @GetMapping(path = "/send-error/{error}")
    void sendError(@PathVariable String error){
        servicePublishResource.sendError(error);}
    @GetMapping(path = "/send-confirmation/{confirmation}")
    void sendConfirmation(@PathVariable String confirmation){
        servicePublishResource.sendConfirmation(confirmation);}
}
