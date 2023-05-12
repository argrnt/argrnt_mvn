package pl.myTraverse.switches;

import java.util.Scanner;

public class SwitchExpression {

    // zadanie 3
    //Based on given grade return grade description
    //1-bad
    //2-not good
    //3-ok
    //4-good
    //5-excellent
    //in case of incorrect grade return null

    public String returnGrade(int grade) {
        return switch (grade) {
            case 1 -> "bad";
            case 2 -> "not good";
            case 3 -> "ok";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> "null";
        };
    }


    // zadanie 4
    //Using switch statement and Scanner class implement quiz. User should enter one of following answers:
    // a,b,c or d after every question
    //In case of correct answer print "Correct!" and increment variable score;
    //In case of incorrect answer  print "Incorrect!" and DO NOT increment variable 'score';
    //In case of or answer different then a,b,c,d print "Answer not available!" and DO NOT increment variable 'score';
    //After quiz call method returnGrade() with 'score' parameter
    //Tip: to increment int variable use ++ operator. For example i++ will increment variable i by 1.
    // int i =0;
    // i++        <<< now value of i is 1
    // i++        <<< now value of i is 2

    public void startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        //Question 1
        System.out.println();
        System.out.println("question 1");
        System.out.println("Which primitive types represents integral numbers?");
        System.out.println("a. int,float,short,long");
        System.out.println("b. int,short,byte,double");
        System.out.println("c. int,byte,short,long");
        System.out.println("d. float,long,short,byte");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer1 = scanner.next();
        //here add switch
        switch (answer1) {
            case "c" -> {
                System.out.println("Correct");
                score++;
            }
            case "a", "b", "d" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }


        //Question 2
        System.out.println();
        System.out.println("question 2");
        System.out.println("Assuming x is int variable, how to correctly write 'if' statement?");
        System.out.println("a. if(1) {}");
        System.out.println("b. if(x=1) {}");
        System.out.println("c. if(x==true) {}");
        System.out.println("d. if(x==1) {}");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer2 = scanner.next();
        //here add switch
        switch (answer2) {
            case "d" -> {
                System.out.println("Correct");
                score++;
            }
            case "a", "b", "c" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }


        //Question 3
        System.out.println();
        System.out.println("question 3");
        System.out.println("Number 15 in binary system is:");
        System.out.println("a. 1010");
        System.out.println("b. 1111");
        System.out.println("c. 1001");
        System.out.println("d. 10000");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer3 = scanner.next();
        //here add switch
        switch (answer3) {
            case "b" -> {
                System.out.println("Correct");
                score++;
            }
            case "a", "c", "d" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }


        //Question 4
        System.out.println();
        System.out.println("question 4");
        System.out.println("String is not:");
        System.out.println("a. an object");
        System.out.println("b. representing text type");
        System.out.println("c. a primitive type");
        System.out.println("d. all answers are correct");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer4 = scanner.next();
        //here add switch
        switch (answer4) {
            case "c" -> {
                System.out.println("Correct");
                score++;
            }
            case "a", "b", "d" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }


        //Question 5
        System.out.println();
        System.out.println("question 5");
        System.out.println("What is the size of double type in Java?");
        System.out.println("a. 8 bit");
        System.out.println("b. 16 bit");
        System.out.println("c  32 bit");
        System.out.println("d. 64 bit");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer5 = scanner.next();
        //here add switch
        switch (answer5) {
            case "d" -> {
                System.out.println("Correct");
                score++;
            }
            case "a", "b", "c" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }
        System.out.println("Your score is: " + score);
        System.out.println("Your skills are: " + returnGrade(score));
    }

}
