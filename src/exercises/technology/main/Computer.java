package exercises.technology.main;

public class Computer {
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;

    public Computer(int screenWidth, int screenHeight, String manufactureYear){
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;

    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int processTwoPlusTwo(){
        return 2 + 2;
    }

    public void tellMeJoke(){
        System.out.println("why did computer show up late at work? It had a hard drive!");
    }


}
