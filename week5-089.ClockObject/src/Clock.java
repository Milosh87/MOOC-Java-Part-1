public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
      // the counters that represent hours, minutes and seconds are created and
      // set to have the correct initial values
      hours = new BoundedCounter(24);
      hours.setValue(hoursAtBeginning);
      minutes = new BoundedCounter(60);
      minutes.setValue(minutesAtBeginning);
      seconds = new BoundedCounter(60);
      seconds.setValue(secondsAtBeginning);
    }

    public void tick(){
      // Clock advances by one second
      if (seconds.getValue() == 59) {
          minutes.next();
          if(minutes.getValue() == 0) {
              hours.next();
          }
      }
      seconds.next();
      
     
    }

    public String toString() {
        // returns the string representation
        return hours.toString()+":"+minutes.toString()+":"+seconds.toString();
    }
}
