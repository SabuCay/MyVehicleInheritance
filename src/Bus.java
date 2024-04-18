public class Bus extends Vehicle{

    double weight;
    public Bus(String t, String m, String mo, int y, int hp, Double weight){
        super(t, m, mo, y, hp);
        this.weight = weight;
    }

    public String toString(){
        return ("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nhorse power: "+HP+"\nWeight for "+make+" is: "+weight);
    }
    public double hpCharge(){
        double tax = weight * 1.75;
        return Math.round(tax * 100.00)/100.00;
    }
}
