/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author adriantang
 */
public class Methods {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    
    public static int[] createQuestionNumbers(){
        int num1 = (rand.nextInt(101))-50;
        int num2 = (rand.nextInt(101))-50;
        int[] numbers = new int[] {num1,num2};
        return numbers;
    }
    public static void createAddSubQuestion(int[] numbers, boolean add){
        if(add){
            System.out.println(numbers[0]+" + "+numbers[1]);
        }else{
            System.out.println(numbers[0]+" - "+numbers[1]);
        }
    }
    public static void createMulDivQuestion(int[] numbers, boolean mul){
        if(mul){
            System.out.println(numbers[0]+" X "+numbers[1]);
        }else{ 
            System.out.println(numbers[0]+" / "+numbers[1]);
        }
    }
    public static void AddSubAnswer(int[] numbers, boolean add, int points){
        int userAnswer = scanner.nextInt();
        if(add){
            int correctAnswer = numbers[0]+numbers[1];
            if (userAnswer == correctAnswer){
                System.out.println("Correct");
                points += 1;
            }else{
                System.out.println("Incorrect, the correct answer is "+correctAnswer);
                points -= 1;
            }
        }else{
            int correctAnswer = numbers[0]-numbers[1];
            if (userAnswer == correctAnswer){
                System.out.println("Correct");
                points += 2;
            }else{
                System.out.println("Incorrect, the correct answer is "+correctAnswer);
                points -= 1;
            }
        }
    }
    public static void MulDivAnswer(int[]numbers, boolean mul, int points){
        int userAnswer = scanner.nextInt();
        if(mul){
            int correctAnswer = numbers[0]*numbers[1];
            if (userAnswer == correctAnswer){
                System.out.println("Correct");
                points += 3;
            }else{
                System.out.println("Incorrect, the correct answer is "+correctAnswer);
                points -= 1;
            }
        }else{
            int correctAnswer = numbers[0]/numbers[1];
            if (userAnswer == correctAnswer){
                System.out.println("Correct");
                points += 4;
            }else{
                System.out.println("Incorrect, the correct answer is "+correctAnswer);
                points -= 1;
            }
        }
    }
}
