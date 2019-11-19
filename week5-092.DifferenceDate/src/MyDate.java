public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public int getYear(){
        return year;
    }
      public int getMonth(){
        return month;
    }
      public int getDay(){
          return day;
      }
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    public int differenceInYears(MyDate comparedDate) {
        if (year >= comparedDate.getYear()) {
            if (month >= comparedDate.getMonth()) {
                if (day >= comparedDate.getDay()){
                    return year - comparedDate.getYear();
                } else return year - comparedDate.getYear()-1;
            } else return year - comparedDate.getYear()-1;
        }  else {
            if (year <= comparedDate.getYear()) {
                if (month <= comparedDate.getMonth()){
                    if (day <= comparedDate.getDay()){
                        return comparedDate.getYear()-year;
                    } else return comparedDate.getYear()-year-1;
                } else return comparedDate.getYear()-year-1;
            } return comparedDate.getYear()-year-1;
        }
        
    }

}
