package com.digit.projectK;

import java.util.Scanner;

public class KBC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome To Project-KBC\n");

		Candidate candidate = new Candidate();
		candidate.inputCandidateDetails();
		Helper.welcomeToGame(candidate.getName());

		Helper curGame = new Helper();

		GameLoop: while (true) {
			Question curQuestion = curGame.returnQuestionBasedOnDifficulty();

			QuestionLoop: while (true) {
				Questions.printQuestion(curGame.questionNumber, curQuestion);
				String chosenOption = sc.next();

				if (chosenOption.equalsIgnoreCase(Questions.optionAlphas[curQuestion.getCorrectAnswer() - 1])) {
					System.out.println("Correct Answer!");
					curGame.numberOfRightAnswers++;
					break QuestionLoop;
				} else if (chosenOption.equalsIgnoreCase("L")) {
					curGame.printLifeLineDetails();
					if (curGame.lifeLinesLeft <= 0) {
						System.out.println("No Lifelines Left! Choose on Your Own!\n");
						continue QuestionLoop;
					} else {
						LifeLineLoop: while (true) {
							System.out.println("Lifelines In Game(Select From Options)\n1. 50_50\n2.Audience Poll");
							int chosenLifeline = sc.nextInt();
							if (chosenLifeline == 1) {
								if (curGame.fiftyFiftyLifeLineLeft > 0) {
									Questions.printOptionsForLifeline("50_50", curQuestion);
									curGame.fiftyFiftyLifeLineLeft--;
								} else {
									System.out.println("You have already Utilized it!");
									continue LifeLineLoop;
								}
							} else if (chosenLifeline == 2) {
								if (curGame.audiencePollLifeLineLeft > 0) {
									Questions.printOptionsForLifeline("AudiencePoll", curQuestion);
									curGame.audiencePollLifeLineLeft--;
								} else {
									System.out.println("You have already Utilized it!");
									continue LifeLineLoop;
								}
							} else {
								System.out.println("Please Choose From Options");
							}
							curGame.lifeLinesLeft--;
							chosenOption = sc.next();
							if (chosenOption
									.equalsIgnoreCase(Questions.optionAlphas[curQuestion.getCorrectAnswer() - 1])) {
								System.out.println("Correct Answer!");
								curGame.numberOfRightAnswers++;
								break QuestionLoop;
							} else if (chosenOption.equalsIgnoreCase("L")) {
								curGame.printLifeLineDetails();
								continue LifeLineLoop;
							} else {
								System.out.println("You Lose");
								break GameLoop;
							}
						}
					}

				} else if (chosenOption.equalsIgnoreCase("Q")) {
					String quitMsg = "Would you like to Quit";
					if (curGame.numberOfRightAnswers > 0) {
						quitMsg += " with Rs. " + Helper.moneyForRightAnswers[curGame.numberOfRightAnswers - 1];
					}
					quitMsg += " (Y/N): ";
					System.out.println(quitMsg);
					String gp = sc.next();
					if (gp.equalsIgnoreCase("Y")) {
						System.out.println("You Have Choosen to Quit!");
						if (curGame.numberOfRightAnswers > 0) {
							System.out.println("You are walking away with Rs."
									+ Helper.moneyForRightAnswers[curGame.numberOfRightAnswers - 1]);
						}
						System.out.println("Bye Bye");
						break GameLoop;
					}
				} else if (chosenOption.equalsIgnoreCase("A") || chosenOption.equalsIgnoreCase("B")
						|| chosenOption.equalsIgnoreCase("C") || chosenOption.equalsIgnoreCase("D")) {
					System.out.println("Wrong Answer!");
					System.out.println("You are Out!");
					break GameLoop;
				} else {
					System.out.println("Wrong Input! Choose from Options or Enter L/Q for Special Commands");
					continue QuestionLoop;
				}
			}
			if (curGame.questionNumber == 10) {
				System.out.println("Qns Done!");
				break GameLoop;
			}
			curGame.questionNumber++;
			System.out.println(
					"Congrats! You have won Rs." + Helper.moneyForRightAnswers[curGame.numberOfRightAnswers - 1]);
		}
	}
}
