package com.classPrograms;
import java.util.Scanner;
public class MainTrainers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("---------------------------------------------");
		Trainers t1=new Trainers("kalyan",101,100000.54);
		System.out.println(t1);
		System.out.println("----------------------------------------------");
		Trainers t2=new Trainers("Thanuja",102,900000.44);
		System.out.println(t2);
		System.out.println("----------------------------------------------");
		Trainers t3=new Trainers("Demon",103,800000.34);
		System.out.println(t3);
		System.out.println("----------------------------------------------");
		Trainers t4=new Trainers("Rithu",104,700000.24);
		System.out.println(t4);
		System.out.println("----------------------------------------------");
		Trainers t5=new Trainers("Emmu",105,600000.34);
		System.out.println(t5);
		System.out.println("----------------------------------------------");
		
		
		s.close();

	}

}
