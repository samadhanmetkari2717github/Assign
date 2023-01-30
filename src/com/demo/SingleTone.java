package com.demo;

public class SingleTone {
	
	public static void main(String[] args) {
		
		SingleTone st = new SingleTone();
		SingleTone st1 = new SingleTone();
		SingleTone st3 = new SingleTone();
		
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st3.hashCode());
		
		
		
		
		// ****   by this way we get different hashcode  ****
	}

}
 