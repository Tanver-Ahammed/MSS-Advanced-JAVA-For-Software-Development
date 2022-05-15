package polymorphism;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            TvSerial serial = getTvSerial();
            System.out.println(serial.getPlot());
            System.out.println();
        }
    }

    public static TvSerial getTvSerial() {
        int randomNumber = new Random().nextInt(5);
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 0:
                return new BreakingBad();

            case 1:
                return new WalkingDead();

            case 2:
                return new Dark();

            case 3:
                return new GameOfThrones();

            default:
                return new Dexter();
        }
    }
}
