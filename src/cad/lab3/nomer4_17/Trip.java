package cad.lab3.nomer4_17;

public class Trip {
    private int miles;
    private int gallons;

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        if (miles > 0) {
            this.miles = miles;
        }
    }

    public int getGallons() {
        return gallons;
    }

    public void setGallons(int gallons) {
        if (gallons > 0) {
            this.gallons = gallons;
        }
    }

    public void addGallons(int gallons) {
        if (gallons > 0) {
            this.gallons = this.gallons + gallons;
        }
    }

    public void addMiles(int miles) {
        if (miles > 0) {
            this.miles = this.miles + miles;
        }
    }

    public double getMilesPerGallon() {
        return (double) miles / gallons;
    }
}
