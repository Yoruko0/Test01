package com.study.wotk;
/**
 * 方法练习
 * @author cly
 * @date 2023年11月28日
 */

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//1.
	      // System.out.println(getMin(1.4, 1.1));
		//2.
		    // System.out.println(getMax(10, 9, 6));
		//3.
			//intInput();
		//4.
			//cfb();
		//5.
		 //px();
		//6.
			//xs(-11.45);
		//7.
		sswr(4.5);
	}
/*	public static double getMin(double math1,double math2){//1.
		if (math1 > math2) {
			return  math2;
		}
		else  {
			return math1;
		}*/
	 /*public static int getMax(int mh1,int mh2,int mh3){//2.
	      if (mh1 < mh2 && mh2 > mh3) {
			return mh2;
		}	 
	      else if (mh3 < mh1 && mh1 > mh2) {
				return mh1;
			}
	   else {
		return mh3;
	    }
	}*/
   /*   public static void intInput() {//3.
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("请输入第一个数:");
    		int n = scanner.nextInt();
    		System.out.println("请输入第二个数:");
    		int m = scanner.nextInt();
    		for (int i = 0; i < n; i++) {
    			System.out.println();
				for(int j = 0 ; j < m ; j++){
					System.out.print("@");
				}
			}
    		scanner.close();
	}*/
    /*  	public static void cfb() {//4.
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个1-9之间的整数:");
			int n = scanner.nextInt();
			for(int i = 1 ; i <= n ; i++){
				for(int j = 1 ; j <= i ; j++){
					System.out.print(j+"*"+i+"="+i * j + "\t");
				}
				System.out.println();
			}
			scanner.close();
		}	*/
     /* 	public static void px() {//5.
      			Scanner scanner = new Scanner(System.in);
      			System.out.println("请输入第一个整数:");
      			int l = scanner.nextInt();
      			System.out.println("请输入第二个整数:");
      			int m = scanner.nextInt();
      			System.out.println("请输入第三个整数:");
      			int n =scanner.nextInt();
				if (l > m && l > n) { 
					if(n >m){
							System.out.println(l+"\t"+n+"\t"+m);
						}
					else if (m > n) {
						System.out.println(l+"\t"+m+"\t"+n);
					}
				}
				else if (m > l && m > n) {
					if (l >n) {
						System.out.println(m + "\t" + l + "\t" + n);
					}
					else if (n > l) {
						System.out.println(m + "\t" + n + "\t" + l);
					}
				}
				else if (n > l && n > m) {
					if (l > m) {
						System.out.println(n+"\t"+l+"\t"+m);
					}
					else if (m > l) {
						System.out.println(n + "\t" + m + "\t" + l);
					}
				}
				scanner.close();
      		}*/
	/*public static double xs(double num) {//6.
		if (num >= 0) {
			System.out.println("绝对值是:"+num);
			return num;
		}
		else {
			System.out.println("绝对值是:"+ ((num) *(-1)));
			return num;
		}
	}*/
	public static int sswr(double zs) {
		int num;
		if ((zs * 10 % 10) >= 5) {
			num = (int) zs + 1 ;
			System.out.println("四合五入的值是:"+num);
			return num;
		}
		else{
			num = (int) zs;
			System.out.println("四舍五入的值是:"+num);
			return num;
		}
	}
	
}

      		

