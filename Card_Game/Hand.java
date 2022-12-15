import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hand {

    int hand[] = new int[5];
    int enemy[] = new int[5];
    int to_beat = 0;
    int points = 0;
    int choice;
    int roundCounter = 0;

    Random random;

    public Hand() {
        // initializing with values
        for(int i=0; i<5; i++){
            if (random == null) random = new Random();
            hand[i] = random.nextInt(10, 99);

            if (random == null) random = new Random();
            enemy[i] = random.nextInt(10, 99);
        }

        if(random == null) random = new Random();
        to_beat = random.nextInt(10,99);
    }

    @Override
    public String toString() {

        // Enemy hand part:
        System.out.println("###########################");
        System.out.println("|    | |    | |    | |    |");
        System.out.println("|____| |____| |____| |____|");
        System.out.println();

        // Card to beat part:
        System.out.println("          ____");
        System.out.println("         |" + to_beat + "  |");
        System.out.println("         |____|");
        System.out.println();

        // Your hand part:
        System.out.println(" ____   ____   ____   ____");
        System.out.println("|"+ hand[0] + "  |" + " |"+ hand[1] + "  |" + " |"+ hand[2] + "  |" + " |"+ hand[3] + "  |" );
        System.out.println("|    | |    | |    | |    |");
        System.out.println("###########################");
        System.out.println(" [1]    [2]    [3]    [4]");
        System.out.println();
        System.out.println("Your points: " + points);
        return "";
    }

    public void quitThanks(){
        System.out.println("         Thanks for playing!");
    }

    public void nextRound(int choice){
        switch (choice){
            case 1:
                if(hand[0] > to_beat){
                    points += hand[0] - to_beat;
                } else{
                    points -= to_beat - hand[0];
                }
                to_beat = hand[0];
                hand[0] = random.nextInt(10,99);
                break;
            case 2:
                if(hand[1] > to_beat){
                    points += hand[1] - to_beat;
                } else{
                    points -= to_beat - hand[1];
                }
                to_beat = hand[1];
                hand[1] = random.nextInt(10,99);
                break;

            case 3:
                if(hand[2] > to_beat){
                    points += hand[2] - to_beat;
                } else{
                    points -= to_beat - hand[2];
                }
                to_beat = hand[2];
                hand[2] = random.nextInt(10,99);
                break;

            case 4:
                if(hand[3] > to_beat){
                    points += hand[3] - to_beat;
                } else{
                    points -= to_beat - hand[3];
                }
                to_beat = hand[3];
                hand[3] = random.nextInt(10,99);
                break;

            case 0:
                points = Integer.MAX_VALUE;
                quitThanks();
                break;
        }
    }

    public void game(){
        while(points < 1000) {
            System.out.println(this.toString());

            System.out.print("Your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            for(int i=0; i<15; i++) {
                System.out.println();
            }
            nextRound(choice);
            roundCounter++;
        }

        if(points < Integer.MAX_VALUE){
            System.out.println("         You won!");
            System.out.println("         Thanks for playing!");
            System.out.println("         Rounds played: " + roundCounter);
        }
    }

    public int[] getHand() {
        return hand;
    }

    public void setHand(int[] hand) {
        this.hand = hand;
    }
}
