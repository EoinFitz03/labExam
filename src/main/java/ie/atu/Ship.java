package ie.atu;

public class Ship {
    private String shipName;
    private String shipBuilt;
    private int shipCrew;

    public Ship() {
        this.shipName = "";
        this.shipBuilt = "";
        this.shipCrew = 0;
    }

    public Ship(String shipName, String shipBuilt, int shipCrew) {
        this.shipName = shipName;
        this.shipBuilt = shipBuilt;
        this.shipCrew = shipCrew;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipBuilt() {
        return shipBuilt;
    }

    public void setShipBuilt(String shipBuilt) {
        this.shipBuilt = shipBuilt;
    }

    public int getShipCrew() {
        return shipCrew;
    }

    public void setShipCrew(int shipCrew) {
        this.shipCrew = shipCrew;
    }



    public String vessalDeatails() {
        return "Ship: \n" +
                "shipName='" + shipName + '\'' +
                ", shipBuilt='" + shipBuilt + '\'' +
                ", shipCrew=" + shipCrew +
                ',';
    }
}
