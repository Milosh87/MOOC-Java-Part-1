
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    public Money plus(Money added){
        return new Money(added.euros() + euros, added.cents() + cents);
    }
    public boolean less(Money compared) {
        if (euros < compared.euros()){
            return true;
        } else if (euros == compared.euros()) {
            if(cents < compared.cents()){
                return true;
            } else return false;
        }
        return false;
    } 
    public Money minus(Money decreased) {
       int centsMinus=0;
       int eurosMinus=0;
       boolean nula = false;
       if (decreased.euros() > this.euros){
            nula = true;
           eurosMinus = 0;
           centsMinus=0;
       } else eurosMinus = this.euros - decreased.euros();
       if (decreased.cents() > cents) {
           eurosMinus--;
           centsMinus = 100 - decreased.cents() - cents;
       } else centsMinus = cents - decreased.cents();
       if (nula){
           eurosMinus = 0;
           centsMinus = 0;
       }
       return new Money(eurosMinus,centsMinus);
       
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
