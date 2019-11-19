
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    public static int smallest(int[] array) {
    int min = array[0];
        for (int i=0; i<array.length;i++) {
        if (min > array[i]){
            min = array[i];
        }
    }
        return min;
}
    public static int indexOfTheSmallest(int[] array) {
    // code goes here
    int index = 0;
    int min = array[0];
    for (int i=0; i<array.length;i++) {
        if (min > array[i]){
            min = array[i];
            index = i;
        }
}
 return index;
 

}
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int indext = index;
    int min = array[index];
     for (int i=index; i<array.length;i++) {
        if (min > array[i]){
            min = array[i];
            indext = i;
        }
}
 return indext;
}
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int zamena;
    zamena = array[index1];
    array[index1] = array[index2];
    array[index2] = zamena;
}
 public static void sort(int[] array) {
     for(int i=0; i<array.length-1; i++){
     swap(array, i, indexOfTheSmallestStartingFrom(array, i));
     }
}
 
}
