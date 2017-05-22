/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code1;

import java.util.Scanner;

/**
 *
 * @author 010561
 */
public class Code1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
      // System.out.println(Math.random()*1000 + " is a number");   
   /*   System.out.println("Welcome to the change code, i'm addicted to Math.random()");
        String No;
       No = "Yes";
       int number;
       double number2;
       boolean Maybe;
       boolean MaybeNot;
     Maybe = ((int) (1+(Math.random()*5))) == ((int) (1+(Math.random()*5)));
     MaybeNot = (true != Maybe);
     number = 13;
     number2 = ((int) (1+(Math.random()*5)) + 0.1*((int) ((Math.random()*10))));
     System.out.println(No + "| " + number + " | " + Maybe + " or might be " + MaybeNot + "  " + number2);
    int newNumber = random(number);
    System.out.println(newNumber);
    if(newNumber == number){
        System.out.println("Lucky you");
    } else{
        System.out.println("Tough luck");
    }
    if(newNumber == number && Maybe == true) {
        System.out.println("Damn son");
    }
    
    NewCode greeting = new NewCode("Grt0");
     greeting.activateCode();
     greeting.defineCode();
     
    StartCode start = new StartCode ("Strt0");
     start.defineCode();
    }
    
    */
        
        
        Scanner input = new Scanner(System.in);
        String command = input.next();
       int task = Integer.parseInt(command);
        System.out.println(task);
        
        welcomeNote();
        System.out.println("Enter task");
        startTask();
        
        System.out.println();
     
       /* int[] newArray = new int[10];
        for (int i=0; i<10; i++) {
            newArray[i]=3;
            System.out.print("Location "+i+" value "+newArray[i]+", ");
            if (i==9) {  System.out.println("done!");  }
        } */
         
        
     /*   int i=fac(4);
        System.out.println(i); */
   }
    private static int random(int input){
        int rand = (int) (1+(Math.random()*13));
        return rand*input;}
    public static void welcomeNote() {
    Scanner input = new Scanner(System.in);   
        System.out.println("Enter name:");
        String name = input.next();
        System.out.println("Greetings " + name + ". How can i help you?");
    }
    public static void startTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tasks:");
        System.out.println("1: count to 10;");
        System.out.println("2: Have a random number");
        System.out.println("0: Do nothing");
         String command = input.next();
       int task = Integer.parseInt(command);
        if (task==1||task==2||task==0){
            if (task==1) {
            for (int i=1;i<11;i++){
            System.out.print(i + ", ");}
        }
        if (task==2) {
            int rand = (int) (Math.random()*100);
             if (rand==13) { System.out.print("Lucky number ");}
            System.out.println(rand);
        }
        System.out.println("done!");
        } else {System.out.println("Error! Invalid input");}
        System.out.println();
        newTask();
    }
    public static void loopTest(){
        System.out.println("Activating loopTest");
        int count = 1;
        while (count < 11) {
            System.out.print("Count is: " + count + ". ");
            count++;
        }
        
        
        for (int i=1;i<11;i++){
            System.out.print("Count is: " + i + ". ");
        }
    }
    private static int fac(int facul) {
         if (facul==1) {return 1;
         }
         return facul*fac(facul-1);
    }
    public static void newTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Another task? y/n");
        String ans = input.next();
          char answer = ans.charAt(0);
         int yn = (int) answer;
         if (yn==121||yn==89) {
             System.out.println("Understood, rebooting startTask");
             startTask();
         }
         if (yn==110||yn==78) {
           System.out.println("Okey... :(");
       }
         if (yn!=110&&yn!=78&&yn!=121&&yn!=89) {
             System.out.println("Yes or no, no other input!");
             newTask();
         }
    }
}

    