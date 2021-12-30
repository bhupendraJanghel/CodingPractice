package com.structural.proxy;

public class ClientClass {

	public static void main(String arg[]) {
		Subject proxy = new ProxyClass();
		
		proxy.method();
	}
}
