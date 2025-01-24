package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneFactory.orderIphone("X", "standart");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone2 = IPhoneFactory.orderIphone("11", "standart");
		System.out.println(iphone2);
	}
}
