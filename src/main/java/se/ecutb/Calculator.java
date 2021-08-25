package se.ecutb;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers and finish with an operation:");
        while(true) {
            label:
            while(true) {
                String temp = in.nextLine();
                switch (temp) {
                    case "+":
                        System.out.println("\n" + "Answer: " + addition(numbers));
                        break label;
                    case "-":
                        System.out.println("\n" + "Answer: " + subtraction(numbers));
                        break label;
                    case "*":
                        System.out.println("\n" + "Answer: " + multiplication(numbers));
                        break label;
                    case "/":
                        if (division(numbers) == 0) {
                            System.out.println("\nUndefined");
                        } else {
                            System.out.println("\n" + "Answer: " + division(numbers));
                        }
                        break label;
                }
                try {
                    numbers.add(Double.parseDouble(temp));
                } catch(NumberFormatException e) {
                    System.out.println("\nNot a number");
                }
            }

            System.out.println("\n" + "Do you want to continue? If no, type Exit!"
                    + " Otherwise, press enter.");
            if(in.nextLine().equalsIgnoreCase("Exit")) {
                System.out.println();
                break;
            }
            else {
                numbers.clear();
                System.out.println("Enter numbers and finish with an operation:");
            }
        }
        System.out.println("Program Ended!");
        in.close();
    }

    public static double addition(ArrayList<Double> calc) {
        double result = 0;
        for (Double aDouble : calc) {
            result += aDouble;
        }
        return result;
    }

    public static double subtraction(ArrayList<Double> calc) {
        double result = calc.get(0);
        for(int i=1; i<calc.size(); i++) {
            result -= calc.get(i);
        }
        return result;
    }

    public static double multiplication(ArrayList<Double> calc) {
        double result = calc.get(0);
        for(int i=1; i<calc.size(); i++) {
            result *= calc.get(i);
        }
        return result;
    }

    public static double division(ArrayList<Double> calc) {
        double result = calc.get(0);
        for(int i=1; i<calc.size(); i++) {
            if(calc.get(i)==0) {
                return 0;
            }
            result /= calc.get(i);
        }
        return result;
    }
}