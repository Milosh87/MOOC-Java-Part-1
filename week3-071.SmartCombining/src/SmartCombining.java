import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void smartCombine(ArrayList<Integer> list, ArrayList<Integer> list2) {
        int number = 0;
        list.addAll(list2);
        list2.addAll(list);
        for (int i=0; i<list.size()-1; i++) {
            for (int j =i+1; j<list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        for (int i=0; i<list2.size()-1; i++) {
            for (int j =i+1; j<list2.size(); j++) {
                if (list2.get(i) == list2.get(j)) {
                    list2.remove(j);
                }
            }
        }
    }
}
