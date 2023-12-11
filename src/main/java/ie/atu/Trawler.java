package ie.atu;

public class Trawler extends Ship{



    private String shipName2;
    private int cargoCapcity;




    public Trawler(String shipName, String shipBuilt, int shipCrew, String shipName2, int cargoCapcity) {
        super(shipName, shipBuilt, shipCrew);
        this.shipName2 = shipName2;
        this.cargoCapcity = cargoCapcity;
    }

    public String getShipName2() {
        return shipName2;
    }

    public void setShipName2(String shipName2) {
        this.shipName2 = shipName2;
    }

    public int getCargoCapcity() {
        return cargoCapcity;
    }

    public void setCargoCapcity(int cargoCapcity) {
        this.cargoCapcity = cargoCapcity;
    }


    public String vessalDetails2() {
        System.out.println("Trawler of "+super.vessalDeatails()+" name of second ship "+getShipName2()+" Tonnes of cargo "+getCargoCapcity());
        return null;
    }

}
