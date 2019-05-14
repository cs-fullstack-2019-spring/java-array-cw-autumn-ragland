import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2(createArray2());
//        ex3();
//        ex4();
//        min(createArray5());
//        max(createArray5());
//        ex6();
        ex7();
    }

//    ex1 Ask the user to enter four names in an array. Print the array
    private static void ex1(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter four names!");
        String name1 = read.next();
        String name2 = read.next();
        String name3 = read.next();
        String name4 = read.next();
        ArrayList<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        for(String name:names){
            System.out.println(name);
        }
    }

//    ex2 Create the array [5,3,7, 4]. Pass the array to a new function to do the following:
        //Print the array.
        //Print the 3rd index of the numberList.
        //Delete the second index.
        //Print the 3rd index again.
    private static ArrayList<Integer> createArray2(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        return numbers;
    }

    private static void ex2(ArrayList<Integer> numberArray){
        System.out.println("Full Array");
        for(int numbers : numberArray){
            System.out.println(numbers);
        }
        System.out.println("Third Element");
        System.out.println(numberArray.get(2));
        numberArray.remove(2);
        System.out.println("Third Element Update");
        System.out.println(numberArray.get(2));
    }

//    ex3 Create the array ["Bob", "John", "Kenn", "Kevin"].
        //Remove “Kenn” from the array.
        //Print the array.
        //Print the size of the array.
        //Check to see if the array contains “Kevin”. If so, get the index of “Kevin” to print.
    private static void ex3(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("John");
        names.add("Kenn");
        names.add("Kevin");
        System.out.println("Full Array");
        for(String name : names){
            System.out.println(name);
        }
        names.remove("Kenn");
        System.out.println("Full Array Update");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("Array size " + names.size());
        if(names.contains("Kevin")){
            System.out.println("The index position of Kevin is " + names.indexOf("Kevin"));
        }
        else{
            System.out.println("Kevin is not on the list");
        }
    }

//    ex4 Ask the user to enter 5 numbers. Put them in an array and print the sum.
    private static void ex4(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter five numbers!");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int num3 = read.nextInt();
        int num4 = read.nextInt();
        int num5 = read.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        int sum = 0;
        for(int number : numbers){
            sum = number + sum;
        }
        System.out.println("The sum is " + sum);
    }

//    ex5 Create an array in the main function.
//    Create two functions, min and max, to find the minimum and maximum values.
//    Do not use a min/max function.
    private static ArrayList<Integer> createArray5(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        return numbers;
    }
    private static void min(ArrayList<Integer> numberArray){
        int count = 10;
        for(int number : numberArray){
            if(number < count ){
                count = number;
            }
        }
        System.out.println("Min:" + count);
    }
    private static void max(ArrayList<Integer> numberArray){
        int count = 0;
        for(int number : numberArray){
            if(number > count ){
                count = number;
            }
        }
        System.out.println("Max:" + count);
    }

//    ex6 Create a program that will add all numbers given to a program until the number 0 is pressed.
//    Then return the total of all numbers.
    private static void ex6(){
        Scanner read = new Scanner(System.in);
        int userInput;
        ArrayList<Integer> numbers = new ArrayList<>();
        do{
            System.out.println("Enter 0 for the sum");
            userInput = read.nextInt();
            numbers.add(userInput);
        }while(userInput != 0);

        int sum = 0;
        for(int number : numbers){
            sum = number + sum;
        }
        System.out.println("The sum is " + sum);
    }

//    ex7 Allow a user enter as many strings as they want to until they enter the character 'q'.
//    Check to see if the strings are similar to a palindrome.
    private static void ex7(){
        Scanner read = new Scanner(System.in);
        String userInput;
        ArrayList<String> palindrome = new ArrayList<>();

        do{
            System.out.println("Enter anything!");
            userInput = read.nextLine();
//
//            for(int i=userInput.length(); i>0; i--){
//                palindrome.add(userInput.split("")[i]);
//            }
//
//            if(palindrome = Collection.reverse(palindrome)){
//                System.out.println("PALINDROME");
//            }
        }while(!userInput.equals("q"));
    }
}
