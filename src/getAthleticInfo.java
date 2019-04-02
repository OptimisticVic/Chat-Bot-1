import java.util.Random;

public class getAthleticInfo extends ioHandler {

	//Re-evaluate use for below function as this is more non-specific therefore this AI would sound more like a robot than a normal person
	//I decided not to use this function, continueTalking().

	public static void stopTalking() {

		String way1 = "Oh look at the time, I got to go now. Or actually you can go. But out of all seriousness, Good Bye! And Sorry to cut this conversation short.";

		String way2 = "Please look behind you as I slowly move away from this conservation, haha, just kidding but Sorry to cut this conversation short. But Good-Bye, I hope to talk to you again later";

		String way3 = "Wow a metor is coming down from the sky, I highly suggest you start running. Haha, just kidding, I bet you never imagined that I would scare you like that, right? But anyways sorry to cut this conversation short. Good bye";

		String way4 = "I have 0 percent power remaining-Powering off, good bye, nice talking to you, see you later and sorry to cut this conversation short.";

		String way5 = "I must say we had quite the intriguing conference, but I think there are some other more intresting things around me so why don't you proceed to some other exhibits instead of admiring my superb diction. And sorry to cut this conversation short.";

		String[] waysOfSayingGoodBye = { way1, way2, way3, way4, way5 };

		Random randomNum = new Random();

		int randomNumber = randomNum.nextInt(5);

		System.out.println(waysOfSayingGoodBye[randomNumber]);//Having different ways of saying good bye makes our chat bot sound like an actual human being speaking

	}

	public getAthleticInfo() {

		System.out.println("Which sports do you you want to know more about at Cardozo?");

		String response = scanner.nextLine();
		
                
		//Soccer (1)

		if (response.indexOf("soccer") >= 0) {

			System.out.println("Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

			System.out.println("So do you want to know more about our awesome Coaches? or hear about some team statistics?  \n Personally I think we have some great coaches"); //Ask what they want to know about

			response = scanner.nextLine();
			 

			//Limited Answer Choices

			if (response.indexOf("coach") >= 0) {

				System.out.println("The coaches of Cardozo's Soccer Team are: Coach Richard Parascos Of The Boys Soccer Varsity Team and Coach Alyssa Rocco Of The Girls Soccer Varsity Team. They're both really great coaches o don't underestimate our soccer team!");

				stopTalking();

			} else if (response.indexOf("Statistics") >= 0) {

				//response = scanner.nextLine();

				System.out.println("So far our Boys Soccer Team is 3 and 7, but our boys soccer team aren't done as they'll do even better in their next few games!! And for our Girls Soccer Team they're 4 and 6, but our girls soccer team are doing their best to make a comeback and they're going to have fun doing it!");

				stopTalking();

		}

			} /*Baseball (2)*/ else if (response.indexOf("baseball") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Of Cardozo's Baseball team, would you rather hear more about our coaches or the stats of our team?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Baseball Team are: Coach Martin Finklelstein Of The Boys Baseball Junior Varsity Team and Coach Ronald Gorecki Of The Boys Baseball Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"So far our girls soccer team is 4 and 6, but our girls soccer team are doing their best to make a comeback and they're going to have fun doing it!");
					stopTalking();
				} else {
					stopTalking();
				}
			} /*Basketball (3)*/ else if (response.indexOf("basketball") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Of Cardozo's basketball team, what do you want to hear more about? Its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {

					//Coaches
					System.out.println(
							"The coaches of Cardozo's Basketball Team are: Coach Kyriakos Peponakis Of The Boys Basketball Junior Varsity Team and Coach Ron Naclerio Of The Boys Basketball Varsity Team and Coach Vincent O'Donoghue of The Girls Basketball Varsity Team");
					stopTalking();

				} else if (response.indexOf("stat") >= 0) {

					//Stats
					System.out.println(
							"So far amazingly our Boys Basketball Junior Varsity Team is 12 and 0, while our Boys Basketball Varsity Team is 15 and 1. That's pretty impressive, right?");
					stopTalking();
				} else {
					stopTalking();
				}
			} /*Bowling (4)*/ else if (response.indexOf("bowling") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("What do you want to hear more about Cardozo's bowling, its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {

					//Coaches
					System.out.println(
							"The coach of Cardozo's Bowling Team is: Coach John Tsolekas Of The Boys Bowling Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {

					//Stats
					System.out.println(
							"Our Boys Bowling Varsity Team is 10 and 0. So I reccomend that you don't want to mess with them.");
					stopTalking();
				} else {
					stopTalking();
				}
			} /*Cross Country (5)*/ else if (response.indexOf("cross country") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("Would you care to hear more about its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices
				if (response.indexOf("coach") >= 0) {

					//Coaches
					System.out.println(
							"The coaches of Cardozo's Cross Country Team are: Coach Anthony West Of The Boys Cross Country Varsity Team and Coach Gail Emmanuel Of The Girls Cross Country Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Both our boys and girls cross country teams are 0 and 0. But don't worry they'll sure to make great progress later on.");
					stopTalking();
				} else {
					stopTalking();
				}
			} /*Fencing (6)*/

			else if (response.indexOf("fencing") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Would you care to learn more about the coaches or the stats of our fencing team then?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coach of Cardozo's Fencing Team is: Coach Seth Skolnick Of The Boys Fencing Varsity Team and Of The Girls Fencing Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"For our Boys Fencing Varsity Team, they're doing well being 9 and 1 , and our Girls Fencing Varsity Team is 0 and 0 at the moment so please check in later if you want. Which you should cause they're pretty good and you don't want to miss out on knowing.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//American Football (7)

			else if (response.indexOf("football") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("About Cardozo's football, what do you want to know more about?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Football Team are: Head Coach Joseph Kaso & Assisstant Coaches: Lou Decicco, and John Savage Of The Boys Football Junior Varsity Team and Coach Joseph Kaso again with Coach Louis Decicco Of The Boys Football Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Although our Boys Football Junior Varsity Team is 0 and 0, our Boys Football Varsity Team is 7 and 2");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Golf (8)

			else if (response.indexOf("golf") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("Of our golf team, do you want to know more about the coaches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					System.out.println(
							"The coaches of Cardozo's Golf Team are: Coach Matthew Handell Of The Golf Coed Varsity Team and Coach Pamela Goldberg Of The Girls Golf Varsity Team");
				} else if (response.indexOf("stat") >= 0) {
					System.out.println(
							"Our Co-Ed Golf Team is 1 and 0 which is a pretty good start, Am I right? Well the answer is yes and I will disregard all different opinions. Haha just kidding, I do respect all different opinions. And as for our Girls Golf Team, they are at a striking 9 to 0 ");
				} else {
					stopTalking();
				}
			}

			//Gymnastics (9)

			else if (response.indexOf("gymnastics") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"About our gymnastics team, do you want to hear more more about the caoches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out
							.println("The coach of Cardozo's Girls Gymnastics Varsity Team is Coach Richard Parascos");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"I think you'll find impressive that our Girls Gymnastics Varsity Team is 16 and 0");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Handball (10)

			else if (response.indexOf("handball") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Of our handball team, what exactly do you want to hear more about? The coaches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Handball Team are: Coach John Tsolekas Of The Boys Handball Varsity Team and Coach David Green Of The Girls Handball Varsity Team");
					stopTalking();
				} else if (response.indexOf("coach") >= 0) {
					//Stats
					System.out.println(
							"For our Boys Handball Varsity Team, they are 2 and 2 at the moment, so watch them rise from it all and win their next few games. Then for our Girls Handball Varsity Team, they're 3 and 0 which is mighty decent if I don't say so myself.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Track Team (11)

			else if (response.indexOf("track") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Anyway of our track team, are intrested to hear more about the coaches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Track Team are: Coach Anthony West Of The Boys Indoor and Outdoor Track Varsity Team and Coaches Gail Emmanuel and Colin Mc Nally Of The Girls Indoor and Outdoor Track Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Both our Indoor and Outdoor Boys and Girls Track Team are at 0 and 0, but don't worry they'll make a great start soon.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Lacrosse team (12)

			else if (response.indexOf("lacrosse") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"What makes you intrested to know more about the lacrosse team, would it be the coaches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Lacrosse Team are: Coach John Savage Of The Boys Lacrosse Varsity Team and Coach Larissa Demelo Of The Girls Lacrosse Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"For now, our Boys Lacrosse Varsity Team is 0 and 0. For our Girls Lacrosse Varsity Team, they're 0 and 2 but don't worry they're just going easy on their opponents for now.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Softball (13)

			else if (response.indexOf("softball") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("Of softball, what would you like to know more about, the coaches or the stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println("The coach of Cardozo's Girls Softball Varsity Team is Coach Richard Parascos");
					stopTalking();
				} else if (response.indexOf("coach") >= 0) {
					//Stats
					System.out.println(
							"Our Girls Softball Varsity Team is 0 and 1, and just so you know they're only starting to getting warmed up.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Swimming Team (14)

			else if (response.indexOf("swimming") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("Do you want o hear more of Cardozo's Swimming Team Coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices
				if (response.indexOf("coach") >= 0) {
					//Cocahes
					System.out.println("The coach of Cardozo's Girls Swimming Varsity Team is Coach Richard Amira");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Cardozo's Girls Swimming Varsity Team is 10 and 0 and not to brag but they did win the queens championship the last past 2 years");
					stopTalking();
				} else {
					stopTalking();
				}
				//Stats about swim team (Our girls team won the Queens championship the past two years

			}

			//Table Tennis (15)

			else if (response.indexOf("table") >= 0 && response.indexOf("tennis") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println("Of table tennis, do you want to know more about its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Bowling Team are: Coach Joshua Glasel Of The Boys Table Tennis Varsity Team and Coach Richard Amira Of The Girls Table Tennis Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Our Table Tennis Teams Are Coming Up strong as our boys table tennis varsity team is 9 and 3 while our girls table tennis varsity team is 10 and 2.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Tennis (16)

			else if (response.indexOf("tennis") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Now tell me, what do you want to hear more about Cardozo's Tennis Team, its caoches or tis stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coaches of Cardozo's Tennis Team are: Coach Jeffery Loh Of The Boys Tennis Varsity Team and Coach Neal Baskin Of The Girls Varsity Team.");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"So far our tennis teams are neck and neck being tied in thier win loss record. As ours boys tennis varsity team is  1 and 1. And our girls tennis varsity team is 5 and 5.");
					stopTalking();
				} else {
					stopTalking();
				}
			}

			//Volleyball (17)

			else if (response.indexOf("volleyball") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Now of this intresting topic, would you care to know more about its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coach of Cardozo's Volleyball Team is: Coach Daniel Scarola Of The Boys VolleyBall Varsity Team and Of The Girls Volleyball Varsity Team and Coach Vincent O'Donoghue Of The Girls Volleyball Junior Varsity Team.");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"All of our volleyball teams have a good win loss record. Our Boys Volleyball Varsity Team is 2 and 1. Our Girls Volleyball Varsity team is 4 and 2. And our Girls Volleyball Junior Varsity Team is 6 and 4.");
					stopTalking();
				} else {
					//Loop Back Feature Needed, continueTalking();   
				}
			}

			//Wrestling (18)

			else if (response.indexOf("wrestling") >= 0) {

				System.out.println(
						"Good Choice! Cardozo's " + response + " Team is a really intresting topic to talk about.");

				System.out.println(
						"Now that we're talking about Cardozo's wrestling team, about what would you want to know more about, its coaches or its stats?"); //Ask what they want to know about

				response = scanner.nextLine();
				 

				//Limited Answer Choices

				if (response.indexOf("coach") >= 0) {
					//Coaches
					System.out.println(
							"The coach of Cardozo's Wrestling Team is Coach Christopher Milani Of Both The Boys Wrestling Varsity Team and The Girls Wrestling Varsity Team");
					stopTalking();
				} else if (response.indexOf("stat") >= 0) {
					//Stats
					System.out.println(
							"Our wrestling teams are doing well. Let me tell you that our boys wrestling varsity team is 7 and 0. While our girls wrestling varsity team is 2 and 0.");
					stopTalking();
			} else {
				stopTalking();
			}
		} else {
			stopTalking();
		}
	}
}