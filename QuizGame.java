import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks = 0;

        System.out. println("=================================");
        System.out.println(" QUIZ GAME ");
        System.out.println("=================================");        
      
 
System.out.println("\n1. Which keyword is used to create a class in Java?\n");

System.out.println("A. function");
System.out.println("B. define");
System.out.println("C. class");
System.out.println("D. object");

System.out.print("Enter Answer: ");
char q1 = input.next().charAt(0);

if (q1 == 'C' || q1 == 'c') {
    System.out.println("Correct!");
    marks++;
} else {
    System.out.println("Wrong!");
}

 System.out.println("\n2. What is the default value of int in Java?\n");
System.out.println("A. 0");
System.out.println("B. null");
System.out.println("C. 1");
System.out.println("D. undefined");

System.out.print("Enter Answer: ");
char q2 = input.next().charAt(0);

if (q2 == 'A' || q2== 'a') {
    System.out.println("Correct!");
    marks++;
} else {
    System.out.println("Wrong!");
}

        System.out.println("\n3. Which symbol is used to end a statement in Java?\n");
        System.out.println("A. :");
        System.out.println("B. ;");
        System.out.println("C. ?");
        System.out.println("D. ,");

        System.out.print("Choose your answer: ");
        char q3 = input.next().charAt(0);

        if (q3 == 'B' || q3 == 'b') {
            System.out.println("Correct!");
            marks++;
        } else {
            System.out.println("Wrong!");
        }
        
        System.out.println("\n4. Which company owns Android?\n");
        System.out.println("A. Google");
        System.out.println("B. Apple");
        System.out.println("C. Nokia");
        System.out.println("D. Samsung");

        System.out.print("Choose your answer: ");
        char q4 = input.next().charAt(0);

        if (q4 == 'A' || q4 == 'a') {
            System.out.println("Correct!");
            marks++;
        } else {
            System.out.println("Wrong!");
        }   
           
System.out.println("\n5. Which package contains Scanner class?");
System.out.println("A. java.io");
System.out.println("B. java.util");
System.out.println("C. java.lang");
System.out.println("D. java.net");

System.out.print("Enter Answer: ");
char q5 = input.next().charAt(0);

if (q5 == 'B' || q5 == 'b') {
    System.out.println("Correct!");
    marks++;
} else {
    System.out.println("Wrong!");
}
  
              System.out.println("\n=================================");
        System.out.println("  QUIZ RESULT ");
        System.out.println("=================================");

        System.out.println("Your Score: " + marks + " / 5");

        if (marks == 5) {
            System.out.println("Excellent Performance!");
        } else if (marks >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Learning!");
        }
        input.close();
    }
}