package ie.atu;

public class Ferry extends Ship{

    public Ferry() {
    }

    private String ferryName;
    private int maxCapacity;


    public Ferry(String shipName, String shipBuilt, int shipCrew, String ferryName, int maxCapacity) {
        super(shipName, shipBuilt, shipCrew);
        this.ferryName = ferryName;
        this.maxCapacity = maxCapacity;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public String vesselDetails() {
        return "Ferry and " + super.vessalDeatails()+
                "ferryName='" + ferryName + '\'' +
                ", maxCapacity=" + maxCapacity +
                '.';
    }
}
