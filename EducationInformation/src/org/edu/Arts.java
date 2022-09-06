package org.edu;

public class Arts extends Education {

	public void bsc() {
      System.out.println("bSC: Maths");

	}
	public void bEd() {
		 System.out.println("bED: Maths");

	}
	public void bA() {
		 System.out.println("BA: History");

	}
	public void bBA() {
		 System.out.println("bBA:Commerce");

	}
	@Override
	public void ug() {
		 System.out.println("UG:Mechanical");		
	}
	@Override
	public void pg() {
		 System.out.println("PG:MBA");
	}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bA();
	a.bBA();
	a.bEd();
	a.bsc();
	a.ug();
	a.pg();
}
}
