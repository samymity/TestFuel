package com.example.demo.controller;



import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutageController {

   

    @RequestMapping("/Outage")
    public int greeting(@RequestParam(value="OutageRegion", defaultValue="US") String name) {
        return new Integer("3000");
    }
}