package com.hello.flow;

public class TiXingDemo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
		    for (int k=0; k<=5-i+1-2; k++) {
		    	System.out.print(" ");
		    }
		    for(int j=1;j<=i*2+1;j++){
		        System.out.print('*');
		    }
		    System.out.println();
		}
	}
}
