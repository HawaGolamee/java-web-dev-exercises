package exercises.technology.main;

public class SmartPhone extends Computer {
    private boolean isConnected5G;


    public SmartPhone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnected5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnected5G = isConnected5G;
    }

    public boolean isConnected5G() {
        return isConnected5G;
    }

    public void makePhoneCall(String number){
        System.out.println("Calling: " + number);
    }


}