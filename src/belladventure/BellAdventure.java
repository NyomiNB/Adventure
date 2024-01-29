/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belladventure;

import java.util.Random;
import java.util.Scanner;// declare Scanner object inside method that gets user input
//Shift ctrl F

import java.util.Random;

public class BellAdventure {

    String name; //user name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rNumber = new Random();
        Scanner keyboard = new Scanner(System.in);

        //VARIABLES 
        boolean playing;//ends game 
        playing = true;

        String tutorial;
        tutorial = "";
        String name; //user name
        name = ""; // name initialization so program doesn't yell at me

        int choices = 0;//tallies  users' choices throughout game
        String email = "";//variable to store user's choice to open email-used in 2 seperate if stmts 

        String inst = ""; //user instrument
        boolean invalid;//boolean for instrument to make sure they choose a valid instrument
        invalid = true;

        String newMusic;//variable for user's choice to look/ignore music
        newMusic = "";

        String effort;//used to determine if user's seating range-front row or back row in orchestra
        effort = "";//decides seating range  

        String noPractice;//
        noPractice = "";

        String cope;//variable for endings 5 & 6 so scope applies to both sets of if stmts

        int chair;//int variable to randomly users' seating in orchestra
        chair = 0;

        String practiceConcert;//var to store user's choice to practice concert music so scope applies to all if stmts
        practiceConcert = "";

        String seatingName;//String to print out user's seating
        seatingName = "";

        int gameNum;//random number  determine which game prints out for ending 8
        gameNum = 1 + rNumber.nextInt(5);
        String game;
        game = "";
//if stmts determine which game prints out for ending 8
        if (gameNum == 1) {
            game = "Minecraft";
        } else if (gameNum == 2) {
            game = "Tetris";
        } else if (gameNum == 3) {
            game = "Spider Solitaire";
        } else if (gameNum == 4) {
            game = "Crossy Road";
        } else {
            game = "Among Us";
        }
//START OF GAME
        System.out.println("Welcome to \"I Survived: Orchestra Edition.\"\nTo play this game, simply type whichever choice you like the most-\npreferably a choice that that results in you making it to the concert (optional)");
        System.out.println("\nChoices are indicated in the story one of two ways:\n1) Quotation marks\n2) or being displayed with a \"*\" symbol next to it.");
        System.out.print("\nEasy enough, right?\n*yes\n*yes! but more enthusiastic\n\n>");//first choice (tutorial)
        tutorial = keyboard.nextLine();

        System.out.print("\nGreat! Before we get started, let's get aquainted! What's your name? ");
        name = keyboard.nextLine();
        //PICK INSTRUMENT
        System.out.println("\nCongratulations, " + name + ", you're a musican now.");
        while (invalid) {
            System.out.println("What instrument do you play?");
            System.out.println("*violin");
            System.out.println("*viola");
            System.out.println("*cello");
            System.out.println("*bass");
            System.out.print("\n>");
            inst = keyboard.nextLine();

            System.out.print("\n");

            if ((inst.equalsIgnoreCase("violin")) || (inst.equalsIgnoreCase("viola")) || (inst.equalsIgnoreCase("cello")) || (inst.equalsIgnoreCase("bass"))) {
                invalid = false;
            } else if (!(inst.equalsIgnoreCase("violin")) || !(inst.equalsIgnoreCase("viola")) || !(inst.equalsIgnoreCase("cello")) || !(inst.equalsIgnoreCase("bass"))) {
                System.out.println("Sorry!" + inst + " is not an instrument...");
            }
        }
//print statements depending on instrument
        if ((inst.equalsIgnoreCase("violin")) || (inst.equalsIgnoreCase("bass"))) {
            System.out.println("You're a " + inst + "ist at Trillium High School!");
        } else if (inst.equalsIgnoreCase("viola")) {
            System.out.println("You're a violist at Trillium High School!");
        } else {
            System.out.println("You're a cellist at Trillium High School!");
        }
        System.out.println("You are taking orchestra for honors credit, which means you need to complete a project this semester.");
        System.out.println("You chose to audition for the annual Regional Orchestra as your project.\n");
        enter();
        System.out.println(" \nIn order to get credit, really all you have to do is audition, and show up for the concert.");
        System.out.println ("You've just been given the music.");
        //FIRST CHOICE
        System.out.print("Do you \"look\" at the music or \"ignore\" it?\n\n*look\n*ignore");
        System.out.print("\n\n>");

        newMusic = keyboard.nextLine();
        choices++;

        System.out.print("\n");
        if (newMusic.equalsIgnoreCase("ignore")) {//CHOICE 1 ignore
            System.out.print("You ignore the music because honestly that's a problem future " + name + " has to worry about.");
            System.out.println("*Four Weeks Later*\n\n");
            System.out.println("Well. The time has come.\nYou have to turn in your audition tape, but since you didn't practice, you're not very prepared...");
            System.out.println("You could always just tough it out, and try to figure out how to play it as you film.\n\nThere's...also no shame in quitting while you're ahead.");
            System.out.println("Well, I guess in this case you'd be behind, but the offer still stands-");

            System.out.print("\nWhat do you do?\n*try\n*quit");
            System.out.print("\n\n>");
            noPractice = keyboard.nextLine();
            choices++;

            if (noPractice.equalsIgnoreCase("quit")) {
                System.out.println("You decide against it-maybe sight reading an audition isn't the best decision...");
                System.out.println("\nUnfortunately for you, that audition was supposed to be your project grade.");
                System.out.println("Your orchestra director asks why you didn't submit the audition.");

                System.out.print("Do you tell the \"truth\" or \"lie\"?\n*truth\n*lie");
                System.out.print("\n\n>");

                String end;
                end = keyboard.nextLine();
                choices++;
                if (end.equalsIgnoreCase("lie")) {
                    System.out.println("You tell your director that your dog ate your phone so you weren't able to tape your audition.");
                    System.out.println("...");
                    System.out.println("She doesn't believe you.\nShe gives you an assignment to write a 500 word paper on the harmonic structure on the entirety of Shostakovich's quartet No. 8, to replace the audition grade.");
                    System.out.println("\n-The End-");
                    System.out.println("You did not survive Regional Orchestra, " + name +  " :((");
                    System.out.println("You made " + choices + " choices and recieved Ending 1: \"The Easy Way Out.\"\n");
                    System.out.println("Thank you for playing, " + name + "!");
                    playing = false;
                } else {
                    System.out.println("You own up to it, and decide to tell the truth. You tell your director that you didn't practice.");
                    System.out.println("She understands and assigns you a mock audition to replace the missing assignment for full credit.");
                    System.out.println("\n-The End-\n");
                    System.out.println("You did not survive Regional Orchestra, " + name + " (╥﹏╥)");
                    System.out.println("You made " + choices + " choices and recieved Ending 2: \"Chronic Procrastinator.\"\n");
                    System.out.println("Thank you for playing, " + name + "!");
                    playing = false;

                }

            } else {// 
                System.out.println("\nBegrudingly, you decide to try turning in an audition, knowing you're in for several hours of trying to get a decent recording...\n");
                System.out.println("In the end, it isn't the prettiest. But you got it done.");
                effort = "low";
            }
        } else { //look at audition music
            System.out.println("You look at the music-it looks pretty difficult, so you practice it.");
            effort = "high";
            System.out.println("Your back hurts, but at least you'll know what you're doing come auditions.\n");
            enter();
        }
        if (playing == true) {
            System.out.print("\nA few weeks after you submit your audition, you get a notification on your laptop-it's an email-");
            System.out.println("\nThe subject line is:\n\"Buckeye State Strings Roster\"\nThat means seating is out!\n");
            enter();
            if (inst.equalsIgnoreCase("violin")) {
                System.out.print("\nFinally-today is the day you find out where you're ranked among 35 other violinists...");
            } else if (inst.equalsIgnoreCase("cello")) {
                System.out.print("\nFinally-today is the day you find out where you're ranked among 18 other cellists...");
            } else if (inst.equalsIgnoreCase("bass")) {
                System.out.print("\nFinally-today is the day you find out where you're ranked among 6 other bassists...");
            } else {
                System.out.print("\nFinally-today is the day you find out where you're ranked among 10 other violists...");
            }
            System.out.println("\nWill you \"open\" the email or \"ignore\" it?");

            //look or ignore email
            System.out.print("\n*open\n*ignore");
            System.out.print("\n\n>");
            email = keyboard.nextLine();
            choices++;

            if (email.equalsIgnoreCase("ignore")) {//IGNORE EMAIL
                System.out.print("\n");
                System.out.print("You \"ignore\" the email, because who doesn't like a little suspense?\n\n");

                enter();

                System.out.println("\n*One Month Later*\n\n~November 1st~\n\n");
                System.out.println("Your director reminds you that today's the first rehearsal!");
                System.out.println("You're ready to go!\n");
                System.out.println("Well...you didn't read the email, so you don't really know what you'll need but nevertheless-");

                System.out.println("You head to rehearsal.\nAs you pull out of your driveway you realize you quite literally have no clue where you're going.");
                System.out.println("\nMaybe the suspenseful route wasn't the best choice, " + name + "...\n");
                enter();
                System.out.println("\nYou open the email that you decided to ignore earlier, and skim through it-");
                System.out.println("\"2023-2024 Regional Information\n");
                System.out.println("Rehearsal will begin promptly at 4:00 PM and last until 7:00 PM-");
                System.out.println("Attendance is mandatory.\nAbsences are not excused unless accompanied by a doctor's note-\nOtherwise, you may not perform at the concert.\"\n");
                enter(); 
                System.out.println("\nYou check your watch-it's 7:00 PM-\n\nYou realize that you've missed the entirety of rehearsal.\n");

                enter();

                if (effort.equalsIgnoreCase("high")) {
                    System.out.println("\nMan. All of that practicing for nothing.");
                    System.out.println("Well. You're feeling kind of defeated.");
                    System.out.println("Will you get yourself a \"treat\" to cheer yourself up or \"cry\" it out.");
                    System.out.print("\n");
                    System.out.println("*treat\n*cry");
                    System.out.print("\n");
                    System.out.print(">");

                    cope = keyboard.next();
                    choices++;

                } else {
                    System.out.println("Honestly, you're not feeling too disappointed about it-I mean there wasn't that much practice put into it in the first place.");
                    System.out.println("Will you get yourself a little \"treat\" to celebrate yourself up or \"cry\" it out, because you got ready for nothing.");
                    System.out.print("\n");
                    System.out.println("*treat\n*cry");
                    System.out.print("\n");
                    System.out.print(">");

                    cope = keyboard.next();
                    choices++;

                }

                if (cope.equalsIgnoreCase("treat")) {
                    System.out.println("\nYou buy yourself a hot cocoa to deal with the disappointment, because honestly it isn't serious enough to cry over.");
                    System.out.println("Although your spirits are lifted, you have to let your director know you aren't performing at the concert due to your absence.");
                    System.out.println("\nDo you \"lie\" or tell the \"truth\" and own up to your mistake.\n(no, you can't tell her the truth after five minutes)");
                    System.out.println("\n*lie\n*truth");
                    System.out.print("\n");
                    System.out.print(">");

                    String truth2;
                    truth2 = keyboard.next();
                    choices++;

                    if (truth2.equalsIgnoreCase("lie")) {
                        System.out.println("You \"lie\", and tell your director that your dog ate your car keys so you weren't able to make it to rehearsal on time.");
                        System.out.println("She doesn't believe you, and makes you organize sheet music to make up the project grade.");
                        //System.out.println("\nYou wonder if this constitutes cruel and unusual punishment\n.");

                        System.out.println("\n-The End-");
                        System.out.println("\nWomp Womp. You did not survive Regional Orchestra, " + name + " (╥_╥).");
                        System.out.println("You made " + choices + " choices and recieved Ending 3: \"Cruel and Unusal Punishment.\"");
                        System.out.println("\nThank you for playing, " + name + "!");
                    } else {
                        System.out.println("\nYou tell the truth. ");
                        System.out.println("She says to make sure to check your email next time, but since you owned up to your mistake and still completed the audition, she gave you partial credit.");

                        System.out.println("\n-The End-\n");
                        System.out.println("Womp Womp. You did not survive Regional Orchestra, " + name + " (◡︵◡).");
                        System.out.println("You made " + choices + " choices and recieved Ending 4: \"Honestly is Always the Best Policy.\"\n");
                        System.out.println("Thank you for playing, " + name + "!");
                    }

                } else {
                    System.out.println("\nYou cry in your car.");
                    System.out.println("The next day your orchestra director notices you're not in the best mood.");
                    System.out.println("You tell her what happened, and she gives you partial credit for the assignment.");
                    System.out.println("Your grade is only brought down slightly, and you're able to bring it up by the end of the quarter.");

                    System.out.println("\n-The End-\n");
                    System.out.println("Womp Womp. You did not survive Regional Orchestra, " + name + " （◞‸◟）.");
                    System.out.println("You made " + choices + " choices and recieved Ending 5: \"Bittersweet\".\n");
                    System.out.println("Thank you for playing, " + name + "!");
                }
            } else {
                System.out.print("\n");
                System.out.print("You \"open\" the email...");
                //VIOLIN statements 
                if (inst.equalsIgnoreCase("violin") && (effort.equalsIgnoreCase("high"))) {
                    chair = 1 + rNumber.nextInt(8);
                    int section = 1 + rNumber.nextInt(20);

                    if (chair == 1) {
                        System.out.print("You're " + chair + "st ");
                        seatingName = chair + "st ";
                    } else if (chair == 2) {
                        System.out.print("You're " + chair + "nd ");
                        seatingName = +chair + "nd ";
                    } else if (chair == 3) {
                        System.out.print("You're " + chair + "rd ");
                        seatingName = +chair + "rd ";
                    } else {
                        System.out.print("You're " + chair + "th ");
                        seatingName = chair + "th ";
                    }

                    if (section % 2 == 0) {
                        System.out.print("chair, first violin!");
                    } else {
                        System.out.print("chair, second violin!");

                    }

                } else if (inst.equalsIgnoreCase("violin") && (effort.equalsIgnoreCase("low"))) {
                    chair = 9 + rNumber.nextInt(14);
                    int section = 1 + rNumber.nextInt(20);
                    if (section % 2 == 0) {
                        System.out.print("You're " + chair + " chair first violin!");
                    } else {
                        System.out.print("You're " + chair + " chair second violin!");
                    }

                    //CELLO statements 
                } else if (inst.equalsIgnoreCase("cello") && (effort.equalsIgnoreCase("high"))) {
                    chair = 1 + rNumber.nextInt(9);
                    if (chair == 1) {
                        System.out.print("You're " + chair + "st ");
                    } else if (chair == 2) {
                        System.out.print("You're " + chair + "nd ");
                    } else if (chair == 3) {
                        System.out.print("You're " + chair + "rd ");
                    } else {
                        System.out.print("You're " + chair + "th ");
                    }
                    System.out.print("chair cello!");
                } else if (inst.equalsIgnoreCase("cello") && (effort.equalsIgnoreCase("low"))) {
                    chair = 10 + rNumber.nextInt(18);
                    System.out.print("You're " + chair + "th chair cello!");

//BASS statements 
                } else if (inst.equalsIgnoreCase("bass") && (effort.equalsIgnoreCase("high"))) {
                    chair = 1 + rNumber.nextInt(3);
                    if (chair == 1) {
                        System.out.print("You're " + chair + "st ");
                        seatingName = chair + "st ";
                    } else if (chair == 2) {
                        System.out.print("You're " + chair + "nd ");
                        seatingName = chair + "nd ";

                    } else if (chair == 3) {
                        System.out.print("You're " + chair + "rd ");
                        seatingName = chair + "rd ";

                    } else {
                        System.out.print("You're " + chair + "th ");
                    }
                    System.out.print("chair bass! ");
                } else if (inst.equalsIgnoreCase("bass") && (effort.equalsIgnoreCase("low"))) {
                    chair = 4 + rNumber.nextInt(6);
                    System.out.print("You're " + chair + "th chair bass!");
                    seatingName = chair + "th";
                } else if (inst.equalsIgnoreCase("viola") && (effort.equalsIgnoreCase("high"))) {        //VIOLA STMTS
                    chair = 1 + rNumber.nextInt(5);
                    if (chair == 1) {
                        System.out.print("You're " + chair + "st ");
                                                seatingName = chair + "st ";
                    } else if (chair == 2) {
                        System.out.print("You're " + chair + "nd ");
                                                seatingName = chair + "nd ";
                    } else if (chair == 3) {
                        System.out.print("You're " + chair + "rd ");
                                                seatingName = chair + "rd ";
                    } else {
                        System.out.print("You're " + chair + "th ");
                       seatingName = chair + "th";
                    }
                    System.out.print("chair viola!");
                } else if (inst.equalsIgnoreCase("viola") && (effort.equalsIgnoreCase("low"))) {
                    chair = 6 + rNumber.nextInt(10);
                    System.out.print("You're " + chair + "th chair viola!");
                }
                //STORY CONTINUES
                System.out.println("\n\nNot only do you know your ranking, but now you know the pieces you'll be performing!\n");
                enter();
                System.out.print("\n\nThe email reads:\n");
                System.out.println("\"The program for this 2023-2024 Season will be:\n\nRomeo and Juliet Fantasy Overture by Tchaikovsky");
                System.out.println("Beethoven's 7th Symphony-Alegretto");
                System.out.println("Danse Bacchanale by Camille Saint-Saëns");
                System.out.println("These are very technically challenging pieces, so it is imperative that you practice before our first rehearsal in November!\n");
                System.out.println("Please come prepared with your music, a pencil, and rosin.");
                System.out.println("Call Time: 4:45 PM");
                System.out.println("Rehearsal Time: 5:00 PM\"");
                System.out.println("\nWow, those sound like some really exciting pieces!");

                System.out.println("\nDo you practice? \"Yes\" or \"no\"?");
                System.out.print("\n*yes\n*no\n");
                System.out.print("\n>");

                practiceConcert = keyboard.nextLine();
                choices++;
                System.out.print("\n");
                if (practiceConcert.equalsIgnoreCase("no")) {
                    System.out.print("You decide not to practice. Everyone sight reads the music during rehearsal anyways...right?\n");
                    System.out.println("\n*One Month Later*\n~November 1st~\n");

                    System.out.println("Once you get to rehearsal, you set up.\nThe conductor starts off with Romeo and Juliet.");
                    System.out.println("Since you didn't practice, you kind of have no clue what you're doing and just airbow the entire time.\n");
                    enter();
                    System.out.println("\nAfter faking it for most of rehearsal, you go home and ponder...to practice or not to practice..that is the question.");
                    String practice3;
                    System.out.println("Do you practice?\n\"Yes\" or \"no\"?\n");
                    System.out.print(">");

                    practice3 = keyboard.nextLine();
                    choices++;

                    if (practice3.equalsIgnoreCase("no")) {
                        System.out.println("\nYou've decided that you're too far gone at this point-they gave you a month to practice for a reason-these pieces are hard.");
                        System.out.println("\n~Concert Day~\n");
                        System.out.println("\nIt's the day of the concert and you honestly have no clue what you're doing.");
                        System.out.println("\nAs you take your bow at the conclusion of the performance, you think about how much you can't wait to play " + game + " right now.");

                        System.out.println("\n-The End-");
                        System.out.println("\nCongratulations, " + name + " you (barely) survived Regional Orchestra!٩(^ᗜ^ )و -");
                        System.out.println("You made " + choices + " choices and recieved Ending 6: \"Underachiever\"\n");
                        System.out.println("Thank you for playing, " + name + "!");
                    } else {
                        System.out.println("You decide to take a closer look at the music and properly learn your part.");
                        System.out.println("It isn't perfect, but you feel better about the concert.");
                        System.out.println("\nAs you take your bow at the conclusion of the performance, you feel content knowing that you tried your best near the end.");

                        System.out.println("\n-The End-\n");
                        System.out.println("Congratulations, " + name + " you survived Regional Orchestra! （^ᗜ^）");
                        System.out.println("You made " + choices + " choices and recieved the Ending 7: \"" + name + "'s Redemption Arc\"\n");
                        System.out.println("Thank you for playing, " + name + "!");
                    }

                } else { //PRACTICE CONCERT MUSIC ROUTE
                    System.out.print("\nYou practice! You feel very prepared for rehearsal.");
                    System.out.println("\n\n*One Month Later*\n~November 1st~\n");
                    System.out.println("Today's the first rehearsal!");
                    System.out.println("\nYou've got your instrument and your backpack. It seems like you're ready to go.\n");
                    enter();
                    System.out.println("\nYou head to rehearsal. Once you get there, you begin to set up your cello.");
                    System.out.println("Since you practiced, you're pretty confident during rehearsal despite the piece's difficulty.\n\n");

                    System.out.println("Near the end of rehearsal, the conductor gives the " + inst + " section a note to write in a breathmark before the soli.\nDo you write in the conductor's note...\n\"yes\" or \"no\"?");
                    System.out.println("\n*yes\n*no");
                    System.out.print("\n");
                    System.out.print(">");

                    String note;
                    note = keyboard.nextLine();
                    choices++;
                    System.out.print("\n");

                    if (note.equalsIgnoreCase("no")) {
                        System.out.println("You don't write in the breath mark. You'll definitely remember it during the concert...right?");
                       System.out.println("She also tells the orchestra what time to get to the concert hall the following day-Again, you don't write it down because you're confident in your memory.");
                        System.out.println("Rehearsal is FINALLY over. But tomorrow's concert day.\n");
                        System.out.println("Will you \"sleep\" or play a \"game\"");
                        System.out.println("*sleep\n*game");
                        System.out.print("\n");
                        System.out.print(">");

                        String concertEve;
                        concertEve = keyboard.nextLine();
                        choices++;

                        if (concertEve.equalsIgnoreCase("game")) {

                            if (gameNum == 1) {
                                System.out.println("You decide to continue building your farm in Minecraft.\n");
                                enter();
                            } else if (gameNum == 2) {
                                System.out.println("You decide to feed into your Tetris addiction and beat your high score of 3200.");
                            } else if (gameNum == 3) {
                                System.out.println("You decide to play a game of Spider Solitaire to see if you can beat your record of winning than three suits.");
                            }

                            System.out.println("\nYou wake up and realize you fell asleep playing " + game + ".");
                            System.out.println("Unfortunately for you, your phone died-which means your alarm didn't go off.\n");
                            enter();
                            System.out.println("\nYou check the time on your watch-it reads, \"11:00 AM.\"");
                            System.out.println("You realize you're running late for the concert!");
                            System.out.println("You show up just as the concert begins, but because you didn't have time to tune your intonnation is off the entire time.\n");
                            enter();
                            System.out.println("\nAs the concert comes to a close and you take your bows, you hope no one noticed (they definitely noticed)");

                            System.out.println("\n-The End-");
                            System.out.println("\nCongratulations, " + name + ", you survived Regional Orchestra! (⁀ᗢ⁀)");
                            System.out.println("You made " + choices + " choices and recieved Ending 8: \"Hate the Game not the Player\"\n");
                            System.out.println("Thank you for playing, " + name + "!");
                        } else {
                            System.out.println("\n (_ _ ) Zzz z\n\n*Many honk shoo's later*");
                            System.out.println("\nYou wake up feeling well rested, and head to the concert.");
                            System.out.println("During the concert, you up playing on a fermata rest while everyone else is quiet...");
                            if (chair<=4) {
                            System.out.println("Because you're " + seatingName + "chair " + inst + ", the conductor, and the entire audience for that matter, saw that it was you...");
                            System.out.println( "\nMaybe your memory isn't as good as you thought?");
                            } else                             {
                                System.out.println( "Maybe your memory isn't as good as you thought.");
                            }
                            System.out.println("\n-The End-");
                            System.out.println("\nCongratulations-You survived Regional Orchestra!ヽ(•‿•)ノ");
                            System.out.println("You made " + choices + " choices and recieved Ending 9: \"A(n Accidental) Solo.\"\n");
                            System.out.println("Thank you for playing, " + name + "!");
                        }
                    } else {
                        System.out.println("\nYou take your pencil, and write the breath mark into the music.");
                        System.out.println("As much as you'd like to believe you have a good memory, you don't risk it.");
                        System.out.println("\nSince it's near the end of rehearsal, she also tells you what time to arrive at the concert hall tomorrow, and you write that down as well.\n");
                        
                        enter();

                        System.out.println("\nRehearsal is FINALLY over. But tomorrow's concert day\n");
                        System.out.println("Will you \"sleep\" or play a \"game\"");

                        System.out.println("\n*sleep\n*game");
                        System.out.print("\n");
                        System.out.print(">");

                        String concertEve;
                        concertEve = keyboard.nextLine();
                        choices++;

                        if (concertEve.equalsIgnoreCase("game")) {

                            if (gameNum == 1) {
                                System.out.println("You decide to continue building your farm in Minecraft.");
                                enter();
                            } else if (gameNum == 2) {
                                System.out.println("You decide to feed into your Tetris addiction and beat your high score of 3200.");
                            } else if (gameNum == 3) {
                                System.out.println("You decide to play a game of Spider Solitaire to see if you can win with three suits.");
                            }

                            System.out.println("You wake up to the sound of your alarm, and realize you fell asleep playing " + game + ".");
                            System.out.println("You remember setting your alarm the night before, after writing down the conductor's reminder of the concert time.\n");
                            
                            enter();

                            System.out.println("\nDuring the concert, someone plays during the fermata-but at least it wasn't you-yay " + name + "!");
                             System.out.println("As the concert comes to a close and you take your bows, you're glad you weren't the unlucky muscian who played while the concert hall was completely silent.");

                            System.out.println("\n-The End-");
                            System.out.println("\nCongratulations " + name + ", you survived Regional Orchestra! ヾ(˶ᵔ ᗜ ᵔ˶)");
                            System.out.println("You made " + choices + " choices and recieved Ending 10: \"Power of the Pen(cil)\"\n");
                            System.out.println("Thank you for playing, " + name + "!");
                        } else {
                            System.out.println("\n\n(￣。￣)～ｚｚZ\n\n*Many honk shoo's later*");
                            System.out.println("\nYou wake up feeling well rested.");
                            System.out.println("As the concert comes to a close and you take your bows, you're glad to have the privledge to perform alongside so many talented musicians.");

                            System.out.println("\n-The End-\n");
                            System.out.println("Congratulations, " + name + ", you survived Regional Orchestra! ヾ(＾-＾)ノ");
                            System.out.println("You made " + choices + " choices and recieved the final ending, Ending 11: \"Pitch Perfect\"\n");
                            System.out.println("Thank you for playing, " + name + "!");

                        }
                    }
                }
            }
        }
    }//end of main method

    public static void enter() {
        System.out.print("Press \"Enter\" to continue. ");
        String pressedKey;

        pressedKey = new Scanner(System.in).nextLine();

    }//end of enterKey method

    public static void tape() {
        //TAPE LINE !!!!!!!!
        String tape;
        System.out.println("Your finger hovers over the voice memo app...");

        System.out.print("*tape\n*don't tape");
        System.out.print("\n\n>");
        tape = new Scanner(System.in).nextLine();
    }
}//end of class
