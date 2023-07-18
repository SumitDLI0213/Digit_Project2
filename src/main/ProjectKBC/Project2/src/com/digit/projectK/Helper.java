package com.digit.projectK;

import java.util.Random;
import java.util.Scanner;

public class Helper {

	static int[] moneyForRightAnswers = { 3_000, 6_000, 12_500, 25_000, 50_000, 1_00_000, 5_00_000, 10_00_000,
			50_00_000, 1_00_00_000 };

	int lifeLinesLeft = 2;
	int audiencePollLifeLineLeft = 1;
	int fiftyFiftyLifeLineLeft = 1;
	int numberOfRightAnswers = 0;

	Question[] easyQuestions = Questions.easyQuestions;
	Question[] mediumQuestions = Questions.mediumQuestions;
	Question[] hardQuestions = Questions.hardQuestions;

	int questionNumber = 1;

	Question returnQuestionBasedOnDifficulty() {
		Question curQuestion;
		if (questionNumber <= 3) {
			int randInt = Helper.generateRandomInt(easyQuestions.length);
			curQuestion = easyQuestions[randInt];
			easyQuestions = Helper.removeElementAtIndexInArray(randInt, easyQuestions);
		} else if (questionNumber > 3 && questionNumber <= 6) {
			int randInt = Helper.generateRandomInt(mediumQuestions.length);
			curQuestion = mediumQuestions[randInt];
			mediumQuestions = Helper.removeElementAtIndexInArray(randInt, mediumQuestions);
		} else {
			int randInt = Helper.generateRandomInt(hardQuestions.length);
			curQuestion = hardQuestions[randInt];
			hardQuestions = Helper.removeElementAtIndexInArray(randInt, hardQuestions);
		}
		return curQuestion;
	}

	static Question[] removeElementAtIndexInArray(int index, Question[] questionsArr) {
		Question[] newArr = new Question[questionsArr.length - 1];
		int newArrIndex = 0;
		for (int i = 0; i < questionsArr.length; i++) {
			if (i != index) {
				newArr[newArrIndex] = questionsArr[i];
				newArrIndex++;
			}
		}
		return newArr;
	}

	void printLifeLineDetails() {
		System.out.println();

		if (fiftyFiftyLifeLineLeft > 0) {
			System.out.println("50-50 ✔\t");
		} else {
			System.out.println("50-50 ❌\t");
		}

		if (audiencePollLifeLineLeft > 0) {
			System.out.println("Audience Poll ✔\t");
		} else {
			System.out.println("Audience Poll ❌\t");
		}
	}

	static int generateRandomInt(int len) {
		Random rand = new Random();
		return rand.nextInt(len);
	}
	
	static void welcomeToGame(String name) {
		System.out.println("Hey There! " + name);
		System.out.println("\nWelcome Again To Project-K's KBC");
		System.out.println("\t---Become Crorepati using Your Knowledge!\n");

		System.out.println("Do You Wish To Read Rules and Regulations of Game? (Recommended to Read for First Time Players) (Y/N): ");
		Scanner sc = new Scanner(System.in);

		String ch = sc.next();
		if (ch.equalsIgnoreCase("Y")) {
			while (true) {
				System.out.println("* There will be 10 Questions 4️");
				System.out.println("* Each Question has 4 options and One of them is Correct!");
				System.out.println("* Throughout the Game, You are given Only 2 Lifelines");
				System.out.println("* To Utilize Lifelines, Enter \"L\" instead of Options!");
				System.out.println(
						"* One is 50-50 where 2 wrong options are eliminated and You are given with 2 options which one is Right Answer");
				System.out.println(
						"* Other is Audience Poll where Selected People choose right answers based on their Knowledge and Answer Percentages are shown for You");
				System.out.println("* Each Right Question increases Amount you won and Difficulty too!");
				System.out.println("\nNOTE:");
				System.out.println(
						"* Through out the Game if you wish to use LIFELINE, Enter \"L\" instead of an Answer.");
				System.out.println(
						"* If you wish to Quit with money that you have won for whatsoever reason, Enter \"Q\" to Safe Quit with money you have won till that Question");
				System.out.println("If you Enter Wrong answer for any Question, You Lose all of your winnings. Choose Wisely and Be on Alert!");
				System.out.println("\nAmount For Each Right Answer\n");
				for (int i = 0; i < Helper.moneyForRightAnswers.length; i++) {
					System.out.println(
							"\tFor " + (i + 1) + " Right Answer(s), You Get " + Helper.moneyForRightAnswers[i]);
				}

				System.out.println("\nEnter \"Y\" to acknowledge the Rules: ");
				ch = sc.next();
				if (ch.equalsIgnoreCase("Y")) {
					break;
				} else {
					System.out.println("You haven't acknowledged!");
					System.out.println("Please Read Rules Again⚠");
					continue;
				}
			}
		}
		System.out.println("Loading...");
		System.out.println("\nLet's Begin The Show!!\n\n\n");
	}
}
