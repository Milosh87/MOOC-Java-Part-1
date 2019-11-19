import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for (int num : list){
            sum += num;
        }
        return sum;
    } 
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / (list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        double difference = 0;
        double variance = 0;
        double average = average(list);
        for (int num : list) {
            difference = average - num;
            variance += Math.pow(difference, 2);
        }
         return  variance/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);

        System.out.println(list.size());
        System.out.println(average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
