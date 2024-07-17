package CollectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Comparator <Integer> comparator = new Comparator<>(){
            public int compare(Integer o1, Integer o2) {
                    if(o1%10 > o2%10) 
                    return 1;
                    else
                    return -1;
            };
    };

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(61);
        nums.add(22);
        nums.add(54);
        nums.add(43);
        nums.add(35);
    
        System.out.println("List");
        System.out.println(nums);
        System.out.println();
        
        System.out.println("List After Sort");
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println();
        System.out.println("List After Sorting by Last Digit");
        Collections.sort(nums,comparator);
        System.out.println(nums);
        
    
    }



}