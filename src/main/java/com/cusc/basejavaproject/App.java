package com.cusc.basejavaproject;

import classtest.AliPayClass;
import classtest.PayInterface;
import classtest.WeixinPayClass;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		PayInterface interface1 = new AliPayClass();
		PayInterface interface2 = new WeixinPayClass();
		interface1.pay();

		InTest(interface1);
		InTest(interface2);
		System.out.println("Hello World!");
	}

	public static void InTest(PayInterface in) {
		in.pay();
	}

	// public static void InTest1(AliPayClass in) {
	// System.out.println(in.pay());
	// }
	//
	// public static void InTest2(WeixinPayClass in) {
	// System.out.println(in.pay());
	// }
}
