/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author adriantang
 */
public class NewGame {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int points = 0;
    public static void newGame(){
        System.out.println("Welcome to a new game");
        for (int i = 0; i < MathGameMain.playerDatabase.length; i++){
            if(MathGameMain.playerDatabase[i].getPlayerName().equals("-")){
                System.out.print("Please enter your name here: ");
                String name = scanner.nextLine();
                MathGameMain.playerDatabase[i].setPlayerName(name);
                System.out.println("The math game will begin now");
                int addSubQues = 0;
                while (addSubQues < 6) {
                    boolean add = rand.nextBoolean();
                    int[] numbers = Methods.createQuestionNumbers();
                    Methods.createAddSubQuestion(numbers, add);
                    Methods.AddSubAnswer(numbers, add, points);
                    addSubQues++;
                }
                int mulDivQues = 0;
                while (mulDivQues < 6) {
                    boolean mul = rand.nextBoolean();
                    int[] numbers = Methods.createQuestionNumbers();
                    if (!mul) {
                        
                        while (numbers[0] % numbers[1] != 0 || numbers[1] == 0) {
                            numbers = Methods.createQuestionNumbers();
                        }
                        Methods.createMulDivQuestion(numbers, mul);
                        Methods.MulDivAnswer(numbers, mul, points);
                        mulDivQues++;
                    } else {
                        Methods.createMulDivQuestion(numbers, mul);
                        Methods.MulDivAnswer(numbers, mul, points);
                        mulDivQues++;
                    }
                }
                System.out.println("You got " + points + " points");
                MathGameMain.playerDatabase[i].setPlayerScore(points);
                break;
            }else{
                System.out.println("Sorry, the game has reached a max number of players");
            }
        }
    }
    
}
