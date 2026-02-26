import java.util.Scanner;

public class FactoryDemo {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Robot r1 = new Robot("Megatron", 90, "Active");
        Robot r2 = new Robot("Bumblebee", 50, "Active");
        r1.displayRobotInfo();
        r2.displayRobotInfo();

        System.out.println("Type in the amount of battery to consume");
        r1.consumeBattery(sc.nextInt());
        r1.displayRobotInfo();
    }
}
