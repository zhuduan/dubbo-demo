package com.alibaba.dubbo.demo.consumer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.demo.DemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dubbo-demo-consumer.xml")
public class ConsumerTest {

	@Autowired
    private DemoService demoService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String result = demoService.sayHello("I am consumer!");
		System.out.println(result);
	}

}
