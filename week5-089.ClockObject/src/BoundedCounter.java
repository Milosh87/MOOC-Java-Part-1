public class BoundedCounter {
    private int value;
    private int upperLimit;
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    public void next() {
        value++;
        if (value == upperLimit) {
            value = 0;
        }
        
       
    }
    public String toString() {
        if (upperLimit == 24) {
            if (value == 0){
        return "00";
    } else if (value<10) return "0" + value;
    else return "" + value;
        }
        if (value <10){
        return "0" + value;
    } else return "" + value;

        
}
    public int getValue() {
        return value;
    }
    public void setValue(int s) {
        if (s >=0 && s <= upperLimit) {
            this.value = s;
        }
    }
    
}
