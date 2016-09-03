package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.ConsumerService;




public class ConsumerServiceImpl implements ConsumerService {


	@Override
	public String sayBye(String name) {
		System.out.println("this is provided by consumer");
		return "bye "+name;
	}
    
}