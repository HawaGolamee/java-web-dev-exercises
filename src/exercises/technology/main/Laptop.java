package exercises.technology.main;

public class Laptop extends Computer{
    private boolean isIntelliJOpened;

    public Laptop (int screenWidth, int screenHeight, String manufactureYear){
        super(screenWidth, screenHeight, manufactureYear);

                this.isIntelliJOpened = false;
    }

    public Laptop (int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpened){
        super(screenWidth, screenHeight, manufactureYear);

        this.isIntelliJOpened = isIntelliJOpened;
    }


    public boolean getIsIntelliJOpened() { return this.isIntelliJOpened; }

    public void setIntelliJOpened(boolean intelliJOpened) {
        isIntelliJOpened = intelliJOpened;
    }

    public void openIntelliJ(){
        this.isIntelliJOpened = true;
        System.out.println("intelliJ is open now");
    }
}
