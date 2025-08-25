package com.tnsif.daynineteen;

public class LambdaWithoutParameter {

	//Program to demonstrate Lambda expression without parameters

		public static void main(String[] args) {
			
			IStatement s = () -> {return "Hello World!!";};
			System.out.println(s.show());


		}
}
