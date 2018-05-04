package org.wltea.expression.test;

import java.util.ArrayList;

import org.wltea.expression.ExpressionEvaluator;
import org.wltea.expression.datameta.Variable;
import org.wltea.expression.translate.sap.SapTranslate;

import junit.framework.TestCase;

public class OdTest extends TestCase{

	public void testEqual() throws Exception {
		//BBB = 'B1'
		//String expression=new String("BBB == 'B1'");
		String expression=new String("BBB == 'B1'");
		System.out.println("expression:"+expression);
		ArrayList<Variable> variables = new ArrayList<Variable>();	
		variables.add(Variable.createVariable("BBB", "A1"));
		variables.add(Variable.createVariable("AAAA", "AAA"));
		System.out.println("Variable BBB,set value is B1");
		Object result =  ExpressionEvaluator.evaluate(expression, variables);
		System.out.println("result:"+result);
		SapTranslate transplate = new SapTranslate();
		System.out.println("transplate to sap :"+transplate.ibpToOther(expression));
	}
}
