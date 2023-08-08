package com.javatpoint2;

public class PrintableFactory {
    public static Printable getPrintable() { 
    	return new B();
//    	return new A();
    }
}
