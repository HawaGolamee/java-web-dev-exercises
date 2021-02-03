package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(1500, 500, "2021", true);
       // mySmartPhone.makePhoneCall("3143269556");
        int result1 = mySmartPhone.processTwoPlusTwo();
        //System.out.println("This result is " + result);

        Laptop myLaptop = new Laptop(2500, 2000, "2021" );
        //myLaptop.openIntelliJ();
        int result = myLaptop.processTwoPlusTwo();
        System.out.println("Laptop result is " + result);

        Computer myComputer = new Computer(3000, 2500, "2021");
       int computerResult =  myComputer.processTwoPlusTwo();
        System.out.println("Computer result is " + computerResult);

    }
}
