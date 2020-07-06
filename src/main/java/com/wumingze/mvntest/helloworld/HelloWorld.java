package com.wumingze.mvntest.helloworld;

public class HelloWorld{
	public String sayHello(){
		System.out.println("SUCCESS!");
		return "Hello Maven";
	}


public static void main(String[] args){
	System.out.print(new HelloWorld().sayHello());
 }
}
//This is a test
