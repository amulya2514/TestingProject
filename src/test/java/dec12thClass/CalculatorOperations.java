package dec12thClass;

import java.util.Scanner;

public class CalculatorOperations {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation: +,-,*,/,%,^");
        char operator = scanner.next().charAt(0);

        int result=0;
        boolean validOperation = true;

        if(operator=='+'){
            result = num1+num2;
        } else if(operator=='-'){
            result=num1-num2;
        }else if(operator=='*'){
            result=num1*num2;
        }else if(operator=='/'){
            if(num2!=0) {
                result = num1 / num2;
            }else{
                System.out.println("Error:Division by zero is not allowed");
                validOperation=false;
            }
        }else if(operator=='%'){
            if(num2!=0){
                result=num1%num2;
            }else {
                System.out.println("Error:Division by zero is not allowed");
                validOperation=false;
            }
        }else if (operator=='^'){
            result=num1^num2;
        }

        if(validOperation){

            System.out.println("The result is: " +result);
        }

        scanner.close();


    }

    //CalculatorOperations cal = new CalculatorOperations();

   }

