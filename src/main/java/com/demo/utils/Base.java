package com.demo.utils;

public class Base {
	private String baseName = "base";
	public Base(){
		callBack();
	}
	public void callBack(){
		System.out.println(baseName);
	}
	static class Sub extends Base{
		private String baseName = "sub";
		public void callBack(){
			System.out.println(baseName);
		}
	}
	public static void main(String[] args) {
		Base base = new Base();
		Base b = new Sub();
		Sub sub = new Sub();
	}
}
