package explore_java;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String flag = "n";
            do {
                // x operator y -> ans

                float x = scanner.nextFloat();
                char operator = scanner.next().charAt(0);
                float y = scanner.nextFloat();

                float ans = 0;

                switch (operator) {
                    case '*':
                        ans = x + y;
                        break;
                    case '+':
                        ans = x + y;
                        break;
                    case '-':
                        ans = x - y;
                        break;
                    case '/':
                        ans = x / y;
                        break;
                    default:
                        System.out.println("operator is invalid");
                }

                System.out.println("value is " + ans);

                System.out.println("Wanna continue... ? y/n");
                flag = scanner.next();

            } while ("y".equals(flag.toLowerCase()));

        } catch (Exception e) {
            System.out.println("Error occurred while processing");
        }

    }
}