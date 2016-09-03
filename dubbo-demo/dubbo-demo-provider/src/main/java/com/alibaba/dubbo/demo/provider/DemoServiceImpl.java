package com.alibaba.dubbo.demo.provider;


import org.springframework.stereotype.Service;
import com.alibaba.dubbo.demo.DemoService;



@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("this provided by provider");
        return "hello "+name;
    }
    
}