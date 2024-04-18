import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> listen = new ArrayList<>();

        Car opel = new Car("Car","Opel", "Mantra", 1989, 750);
        listen.add(opel);
        Car fiat = new Car("Car","Fiat", "127", 1980, 500);
        listen.add(fiat);
        Car ford = new Car("Car","Ford", "Capri", 1981, 909);
        listen.add(ford);



        Bus bedford = new Bus("Bus","Bedford", "RLE", 1966, 110, 2020.0);
        listen.add(bedford);
        Bus mercedes = new Bus("Bus","Mercedes", "1213", 1986, 310, 4987.0);
        listen.add(mercedes);
        Bus scania = new Bus("Bus","Scania", "300", 2001, 510, 6666.0);
        listen.add(scania);

        printMyList(listen);

        //System.out.println(ford.hpCharge());
        //System.out.println(scania.hpCharge());

        for (Vehicle v:listen) {
            System.out.println("HP charge for vehicle: "+v.model+" "+v.hpCharge()+" kr.");
        }


    }
    public static void printMyList(ArrayList<Vehicle> list){
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i)+"\n******************");
        }
    }
}