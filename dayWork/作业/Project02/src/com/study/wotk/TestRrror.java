package com.study.wotk;

import java.util.Scanner;

public class TestRrror {

	public static void main(String[] args) {
		 
	    		Scanner scanner = new Scanner(System.in);
	    		int n = scanner.nextInt();
	    		int m = scanner.nextInt();
	    		for (int i = 0; i < n; i++) {
	    			System.out.println();
					for(int j = 0 ; j < m ; j++){
						System.out.print("@");
					}
				}
	    		scanner.close();

	}

}
