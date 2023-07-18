package com.digit.projectK;

public class Questions {

	static Question[] easyQuestions = {
			new Question("Which is the world’s largest desert?",
					new String[] { "Thar", "Rajasthan Desert", "Sahara", "Kandal" }, 3,
					new String[] { "Thar", "", "Sahara", "" }, new int[] { 19, 3, 75, 3 }),
			new Question("Which is the National bird of India?",
					new String[] { "Pigeon", "Peacock", "Crow", "Ostrich" }, 2,
					new String[] { "Pigeon", "Peacock", "", "" }, new int[] { 19, 75, 3, 3 }),
			new Question("The adult human skeleton is made up of how many bones?",
					new String[] { "216", "206", "209", "210" }, 2, new String[] { "", "206", "209", "" },
					new int[] { 3, 75, 19, 3 }),
			new Question("In the game of ludo the discs or tokens are of how many colours?",
					new String[] { "One", "Two", "Three", "Four" }, 4, new String[] { "", "", "Three", "Four" },
					new int[] { 3, 3, 19, 75 }),
			new Question("What is the capital of United States of America?",
					new String[] { "New York", "Washington, D.C.", "Los Angeles", "Philadelphia" }, 2,
					new String[] { "New York", "Washington D.C.", "", "" }, new int[] { 19, 75, 3, 3 }),
			new Question("In the game of ludo the discs or tokens are of how many colours?",
					new String[] { "One", "Two", "Three", "Four" }, 4, new String[] { "", "", "Three", "Four" },
					new int[] { 3, 3, 19, 75 }),
			new Question("Name the house made of ice?", new String[] { "Ice House", "Igloo", "Icy Home", "Iceland" }, 2,
					new String[] { "Ice House", "Igloo", "", "" }, new int[] { 22, 69, 5, 4 }),

			new Question("Which of these sports requires you to shout out a word loudly during play?",
					new String[] { "Ludo", "Kho-Kho", "Playing Cards", "Chess" }, 2,
					new String[] { "", "Kho-Kho", "Playing Cards", "" }, new int[] { 12, 68, 11, 9 }) };

	static Question[] mediumQuestions = {
			new Question("Which planet is closest to the Sun?", new String[] { "Earth", "Mercury", "Venus", "Mars" }, 2,
					new String[] { "", "Mercury", "Venus", "" }, new int[] { 3, 75, 19, 3 }),
			new Question("Baby frog is known as?", new String[] { "Tadpole", "Frogget", "Kitten", "Chick" }, 1,
					new String[] { "Tadpole", "Frogget", "", "" }, new int[] { 75, 19, 3, 3 }),
			new Question("Delhi is situated on the bank of which river?",
					new String[] { "Ganga", "Kavery", "Tunga", "Yamuna" }, 4,
					new String[] { "Ganga", "", "", "Yamuna" }, new int[] { 19, 3, 3, 75 }),
			new Question("Which continent is known as Dark Continent?",
					new String[] { "Asia", "South America", "Australia", "Africa" }, 4,
					new String[] { "", "", "Australia", "Africa" }, new int[] { 3, 3, 19, 75 }),
			new Question("Name the summer capital of Jammu and Kashmir?",
					new String[] { "SriNagar", "Dehradun", "Lucknow", "Kedarnath" }, 1,
					new String[] { "SriNagar", "Dehradun", "", "" }, new int[] { 75, 19, 3, 3 }),
			new Question("Which of these are names of national parks located in Madhya Pradesh?",
					new String[] { "Krishna and Kanhaiya", "Kanha and Madhav", "Ghanshyam and Murari",
							"Girdhar and Gopal" },
					2, new String[] { "", "Kanha and Madhav", "", "Girdhar and Gopal" }, new int[] { 3, 75, 3, 19 }),
			new Question("Which is largest flower in the world?",
					new String[] { "Rafflesia", "Jasmine", "Balloon Flower", "Camellia" }, 1,
					new String[] { "Rafflesia", "", "", "Camellia" }, new int[] { 69, 4, 5, 22 }),
			new Question("The deepest part of the ocean is called?",
					new String[] { "Deep Hole", "Ocean Deep", "Hole", "Challenger Deep" }, 4,
					new String[] { "Deep Hole", "", "", "Challenger Deep" }, new int[] { 22, 4, 5, 69 }), };

	static Question[] hardQuestions = {
			new Question("Which of these terms can only be used for women?",
					new String[] { "Dirghaayu", "Suhagan", "Chiranjeevi", "Sushil" }, 2,
					new String[] { "Dirghaayu", "Suhagan", "", "" }, new int[] { 22, 65, 3, 10 }),
			new Question("Who wrote the introduction to the English translation of Rabindranath Tagore’s Gitanjali?",
					new String[] { "P.B. Shelley", "Alfred Tennyson", "W.B. Yeats", "T.S. Elliot" }, 3,
					new String[] { "", "", "W.B. Yeats", "T.S. Elliot" }, new int[] { 20, 4, 65, 11 }),
			new Question("Where was the BRICS summit held in 2014?",
					new String[] { "Brazil", "India", "Russia", "China" }, 1,
					new String[] { "Brazil", "India", "", "Hockey" }, new int[] { 65, 20, 11, 4 }),
			new Question("Where is Gir National Forest located?",
					new String[] { "GandhiNagar", "Gujarat", "Hyderabad", "Madikeri" }, 2,
					new String[] { "", "Gujarat", "", "Madikeri" }, new int[] { 4, 69, 5, 22 }),
			new Question("Which is the largest plateau in the world?",
					new String[] { "Europe", "Plateau of Asia", "Africa", "Tibetian Plateau" }, 4,
					new String[] { "", "Plateau of Asia", "", "Tibetian plateau" }, new int[] { 4, 21, 5, 65 }),
			new Question("Which of the following gods is also known as ‘Gauri Nandan’?",
					new String[] { "Agni", "Indra", "Hanuman", "Ganesha" }, 4,
					new String[] { "", "Indra", "", "Ganesha" }, new int[] { 3, 19, 3, 75 }),
			new Question(
					"Which of these leaders was a recipient of a gallantry award in 1987 by a state government for saving two girls from drowning?",
					new String[] { "Anandiben Patel", "Vasundhara Raje Scindia", "Uma Bharti", "Mamata Banerjee" }, 1,
					new String[] { "Anandiben Patel", "Vasundhara Raje Scindia", "", "" },
					new int[] { 57, 22, 11, 10 }),
			new Question("The wife of which of these famous sports persons was once captain of Indian volleyball team?",
					new String[] { "K.D.Jadav", "Dhyan Chand", "Prakash Padukone", "Milkha Singh" }, 4,
					new String[] { "", "Dhyan Chand", "", "Milkha Singh" }, new int[] { 11, 25, 9, 55 }) };

	static String[] optionAlphas = { "A", "B", "C", "D" };

	static void printQuestion(int questionNumber, Question curQuestion) {
		System.out.println("\n--- Question: " + questionNumber + "---\n");
		System.out.println(curQuestion.getQuestionName());
		String[] optionsForCurQn = curQuestion.getOptions();
		for (int i = 1; i <= optionsForCurQn.length; i++) {
			System.out.print(optionAlphas[i - 1] + ". " + optionsForCurQn[i - 1] + "\t\t");
			if (i % 2 == 0) {
				System.out.println();
			}
		}
	}

	static void printOptionsForLifeline(String lifeLine, Question curQuestion) {
		System.out.println("Utilizing Lifeline...\n");

		System.out.println(curQuestion.getQuestionName());
		if (lifeLine.equals("50_50")) {
			String[] optionsForCurQn = curQuestion.getOptionsFor50_50();
			for (int i = 1; i <= optionsForCurQn.length; i++) {
				System.out.print(optionAlphas[i - 1] + ". " + optionsForCurQn[i - 1] + "\t\t");
				if (i % 2 == 0) {
					System.out.println();
				}
			}
		} else {
			String[] optionsForCurQn = curQuestion.getOptions();
			int[] percentagesForQn = curQuestion.getAudiencePollPercentages();
			for (int i = 1; i <= optionsForCurQn.length; i++) {
				System.out.println(optionAlphas[i - 1] + ". " + optionsForCurQn[i - 1] + " ------ "
						+ percentagesForQn[i - 1] + "%\t\t");
			}
		}
	}
}
