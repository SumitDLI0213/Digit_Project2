package com.digit.projectK;

import java.util.Scanner;

public class Candidate {
	private String name;
	private int age;
	private String gender;
	private String cityAndState;

	public String getCityAndState() {
		return cityAndState;
	}

	public void setCityAndState(String cityAndState) {
		this.cityAndState = cityAndState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void inputCandidateDetails() {
		System.out.println("Before Starting the Game, Let's know about you");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your Name: ");
		this.name = sc.nextLine();

		System.out.println("Please Enter Your City And State: ");
		this.cityAndState = sc.nextLine();

		System.out.println("Please Enter Your Age: ");
		this.age = sc.nextInt();

		System.out.println("Please Enter Your Gender: ");
		this.gender = sc.next();
	}
}
