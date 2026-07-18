import java.util.HashSet;

public class RemoveDuplicatesofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
      //  HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> removeDuplicateSet = new HashSet<>();
        for (int i=0 ; i< arr.length; i++)
        {
        
            removeDuplicateSet.add(arr[i]);
        }
       
        System.out.println("Elements after removing duplicates: " + removeDuplicateSet);
    }
}