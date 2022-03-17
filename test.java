package explore_java;

import java.util.Scanner;

public class Calculator {
    static void displayWelcomMessage(){
        String message = "Welcome to calc \n enter your equationo below in the format \n Value1 operation value2";
        System.out.println(message);
    }
    public static void main(String[] args){

        String decision = "f";
        do{

        
        displayWelcomMessage();
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        char op =  scanner.next().charAt(0);
        int value2 = scanner.nextInt();

        float ans= 0;
        boolean flag = true;

        switch(op){
           case '+' :  ans = value1 + value2; break;
           case '-' : ans = value1 - value2; break;
           case '*' : ans = value1 * value2; break;
           case '/' : ans = value1 / value2; break;
           default : invalidOp(); flag = false; break;
        }

        if(flag){
            System.out.println("answer is "+ans);
        }
        System.out.println("Wanna do another calc ?" );
        decision = scanner.next();

    }while(decision.toLowerCase().equals("y"));



    }
    private static void invalidOp() {
        System.out.println("Invalid operation provided ");
    }
}
