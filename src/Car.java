public class Car extends Vehicle{
    /*String make;
    String model;
    int year;
    int HP;*/

    public Car(String t, String m, String mo, int y, int hp ){
        /*make = m;
        model = mo;
        year = y;
        HP = hp;*/
        super(t, m, mo, y, hp);
    }

    public Car() {

    }

    public double hpCharge(){
        double tax = 0;
        if (HP > 250){
            tax = 250 * 1.25;
            tax += (HP -250) * 2.2;
        }
        return Math.round(tax * 100.00) / 100.00;
    }

    /*public String toString(){
        return ("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nhorse power: "+HP);
    }*/

}
