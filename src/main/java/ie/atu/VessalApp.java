package ie.atu;

public class VessalApp {
    public static void main(String[] args) {

        Ship myship = new Ship("Ted","2003",14);
        System.out.println(myship.vessalDeatails());

        Ferry myferry = new Ferry("james","2010",20,"jimmy",300);
        System.out.println(myferry.vesselDetails());

       Trawler mytrawler = new Trawler("Cruiser","2020",50,"Eoin",20000);
        System.out.println(mytrawler.vessalDetails2());





    }
}