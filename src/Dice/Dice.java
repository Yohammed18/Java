package Dice;

/**
 * @author malli
 * @version 1.0.0
 * @implNote displaying the use Math.random() and the power of the While loop. Dice game. Role 6 before exiting the while-loop
 */
public class Dice {


    public static void main(String[] args) {
        int diceRoll = 0;
        int counter = 0;

        while(diceRoll != 6){
            diceRoll = randomDice();
            System.out.println("Dice number: "+diceRoll);
            counter++;
        }

        System.out.println("You rolled the dice "+counter+" before getting "+diceRoll+".\nGood Game!!");
    }

    //method used to generate a random number between 0-6
    public static int randomDice(){
        return (int)(Math.random()*6)+1;
    }
}
