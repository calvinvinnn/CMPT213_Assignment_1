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


    @Override
    public String toString() {
        return "MinionInformation{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", NumOfEvilDeeds=" + NumOfEvilDeeds +
                '}';
    }
}
