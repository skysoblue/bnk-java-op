package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.SwitchAvg;


public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기 
		CalcAvg avg = new CalcAvg();
	//	avg.calcAvg();
		// 2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
	//	calc.calc();
		SwitchAvg avg2 = new SwitchAvg();
		avg2.calc();
	}
}
