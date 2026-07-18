import java.util.HashSet;

public class FindDuplicatesofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        HashSet<Integer> duplicatesSet = new HashSet<>();
        HashSet<Integer> uniqueSet = new HashSet<>();
        // for (int num : arr) {
        //     if (!uniqueSet.add(num)) {
        //         duplicatesSet.add(num);
        //     }
        for(int i=0; i<arr.length; i++) //1, 2, 3, 4, 5, 1, 2, 3
        {
            if(uniqueSet.add(arr[i]) )
            {
                // System.out.println("-------------");
              
            }
            else
            {
                duplicatesSet.add(arr[i]);
               
            }
        
        
    }
      System.out.println("-------------");
      System.out.println("Unique elements: " + uniqueSet);
       // System.out.println("-------------");
    System.out.println("Duplicate elements: " + duplicatesSet );
      System.out.println("-------------");
}
    }

