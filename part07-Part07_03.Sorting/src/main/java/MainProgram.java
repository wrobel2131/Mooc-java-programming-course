

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        if(array.length == 0) {
            throw new RuntimeException("Empty array");
        }
        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        if(array.length == 0) {
            throw new RuntimeException("Empty array");
        }
        int smallest = array[0];
        int smallestIndex = 0;
        for(int i = 1; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if(array.length == 0) {
            throw new RuntimeException("Empty array");
        }
        if(startIndex >= array.length) {
            throw new RuntimeException("Index out of bound");
        }
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        for(int i = startIndex; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        if(array.length == 0) {
            throw new RuntimeException("Empty array");
        }
        if(index1 >= array.length || index2 >= array.length) {
            throw new RuntimeException("Index out of bound");
        }
        int tempIndex1Val = array[index1];
        array[index1] = array[index2];
        array[index2] = tempIndex1Val;
    }
    
    public  static void sort(int[] array) {
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
            System.out.println(array);
        }
    }
    
    
}
