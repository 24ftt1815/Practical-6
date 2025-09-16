import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomGen1 = (int) (Math.random()*100);
        int randomGen2 = (int) (Math.random()*100);
        int randomGen3 = (int) (Math.random()*100);
        int randomGen4 = (int) (Math.random()*100);

        int totalNum = randomGen1 + randomGen2 + randomGen3 + randomGen4;

        System.out.println("What is "+ randomGen1+ " + "+ randomGen2+ " + "+ randomGen3+ " + "+ randomGen4+ "?");
        int ans = input.nextInt();

        if (totalNum == ans){
            System.out.println("Well done, you are correct!");
        }
        else {
            System.out.println("Nice try, the sum should be "+ totalNum);
        }

    }
}
