package com.example;

import javax.annotation.Resource;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringExpressionEvaluator {

	@Resource
	private XPathEvaluator evaluator;
	
	public String evaluate(String expression) {
		System.out.println("evaluator=" + evaluator);
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("value(null)");		
		EvaluationContext context = new StandardEvaluationContext(evaluator);		
		String message = (String) exp.getValue(context);
		return message;
	}
}
