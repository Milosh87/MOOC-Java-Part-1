
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
   public int getSquareMeters() {
       return squareMeters;
   }
    public boolean larger(Apartment x) {
        if (this.getSquareMeters() > x.squareMeters) {
            return true;
        }
        else return false;
    }
     public int getPricePerSquareMeter() {
       return pricePerSquareMeter;
   }
    public int priceDifference(Apartment x) {
       return Math.abs((this.pricePerSquareMeter*this.squareMeters) - (x.pricePerSquareMeter*x.squareMeters));
    }
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if(this.pricePerSquareMeter*this.squareMeters > otherApartment.pricePerSquareMeter*otherApartment.getSquareMeters()) {
            return true;
        } else return false;
    }
}
