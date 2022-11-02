package com.spring.jenkins.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {
Logger logger= LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test case executing....and I am checking..count 1");
		logger.info("Test case executing....and I am checking..count 2");

		assertEquals(true,true);
	}

}
