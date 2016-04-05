package com.basic.tryAndCatch;

public class Lab1 {

	
	/*public static int getVal() {
		try {
			int a = 23;
			int b = 34;
			int c = a + b;

			return c;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return 34;
		}

	}*/

	public static void m1() {
      try {
			System.out.println("abc");
		} finally{
			System.out.println("bcd");
		}

      
      /*try {
	} 
     try{
     } catch (Exception e) {
	}*/
      
    /*  try {
	} catch (NumberFormatException  | ArrayIndexOutOfBoundsException ab) {
	}catch (Exception e) {
	}catch (Throwable t) {
	}*/
      
      
      
	}
	public static void main(String[] args) {
		// System.out.println(Lab1.getVal());
		Lab1.m1();
	}
}
