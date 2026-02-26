public class FactoryDemo {
    static void main(String[] args) {

        Robot r1 = new Robot("Megatron", 90, "Active");
        Robot r2 = new Robot("Bumblebee", 50, "Active");
        r1.displayRobotInfo();
        r2.displayRobotInfo();


        Task t1 = new Task("Walk", 20);
        System.out.println(r1.isBatteryEnough(t1.getEnergyCost()));

    }
}
