public class MinionInformation {
    private String name;
    private double height;
    private int NumOfEvilDeeds;

    public void setNumOfEvilDeeds(int numOfEvilDeeds) {
        NumOfEvilDeeds = numOfEvilDeeds;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfEvilDeeds() {
        return NumOfEvilDeeds;
    }

    public MinionInformation(String name, double height, int numOfEvilDeeds) {
        this.name = name;
        this.height = height;
        NumOfEvilDeeds = numOfEvilDeeds;
    }

    public void incrementEvilDeeds(){
        setNumOfEvilDeeds(getNumOfEvilDeeds()+1);
    }


    @Override
    public String toString() {
        return "MinionInformation{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", NumOfEvilDeeds=" + NumOfEvilDeeds +
                '}';
    }
}
