package com.codes.si;

public class SimpleInterest {
   public int calSi(int p, int r, int t) {
	   int si = (p*r*t)/100;
	   System.out.println("The si is " + si);
	return si;
   }
   
   public static void main(String[] args) {
	   SimpleInterest si = new SimpleInterest();
	   si.calSi(5000, 12, 5);
   }
}
