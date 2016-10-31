package com.example;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringExpressionEvaluatorTest {

	@Resource
	private SpringExpressionEvaluator evaluator;

	@Test
	public void test() {
		String result = evaluator.evaluate(null);
		System.out.println("result=" + result);
		Assert.assertEquals("Hello World", result);
	}

}
