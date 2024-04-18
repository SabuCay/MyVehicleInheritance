public class Vehicle {
    String make;
    String model;
    int year;
    int HP;

    public Vehicle(String t, String m, String mo, int y, int hp ){
        make = m;
        model = mo;
        year = y;
        HP = hp;
    }

    public Vehicle() {

    }

    public String toString(){
        return ("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nhorse power: "+HP);
    }
    public double hpCharge(){
        return HP * 1.25;
    }
}
