package org.wltea.expression.translate.sap;

import org.wltea.expression.translate.ExpressionTranslate;

public class SapTranslate implements ExpressionTranslate {

	@Override
	public String ibpToOther(String expression) {
		if(expression.contains("\"")){
			expression=expression.replaceAll("\"", "'");
		}
		if(expression.contains("==")){
			expression=expression.replaceAll("==", "=");
		}
		return expression;
	}

	@Override
	public String otherToIbp(String expression) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
