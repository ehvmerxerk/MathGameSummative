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
public class MathGameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
       
       int[] highscores = new int[10];
       int choice = 0;
       while (choice !=5){
           System.out.println("Please select the following options with 1-5"); 
           System.out.println("1. Start new game");
           System.out.println("2. Highest and lowest scores");
           System.out.println("3. Scores sorted from highest to lowest");
           System.out.println("4. Scores sorted from lowest to highest");
           System.out.println("5. Quit");
           choice = scanner.nextInt();
           if (choice == 1){
               NewGame.newGame();
           }else if(choice == 2){
               
           }else if (choice == 3){
               
           }else if (choice ==4){
               
           }else if (choice == 5){
               
           }else{
               
           }
       }
    }
    
}
