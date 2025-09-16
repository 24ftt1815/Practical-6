import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock(0), paper (1), scissor(2)");
        double choice = input.nextDouble();

        
        int randomGen = (int) (Math.random()*100);

        int randomGenNum = randomGen % 3;

        if (randomGenNum == 0 && choice == 0){
            System.out.println("The computer is rock. You are rock. It is a draw.");
        }
        if (randomGenNum == 0 && choice == 1){
            System.out.println("The computer is rock. You are paper. You Win.");
        }
        if (randomGenNum == 0 && choice == 2){
            System.out.println("The computer is rock. You are scissor. You Lose.");
        }
// 
        if (randomGenNum == 1 && choice == 0){
            System.out.println("The computer is paper. You are rock. You Lose.");
        }
        if (randomGenNum == 1 && choice == 1){
            System.out.println("The computer is paper. You are paper. It is a draw.");
        }
        if (randomGenNum == 1 && choice == 2){
            System.out.println("The computer is paper. You are scissor. You Win.");
        }
// 
        if (randomGenNum == 2 && choice == 0){
            System.out.println("The computer is scissor. You are rock. You Win.");
        }
        if (randomGenNum == 2 && choice == 1){
            System.out.println("The computer is scissor. You are paper. You Lose.");
        }
        if (randomGenNum == 2 && choice == 2){
            System.out.println("The computer is scissor. You are scissor. It is a draw.");
        }

    }
}
