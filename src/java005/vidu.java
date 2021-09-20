package java005;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
// khai bao bien
	int a, b;
// nhap du lieu
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao a:");
	a = sc.nextInt();
	System.out.println("Nhap vao b:");
	b = sc.nextInt();
	int tong = a + b;
	System.out.println(a+" + "+b+" = "+ tong);
	}
}
