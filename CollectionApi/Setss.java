package CollectionApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Setss {
     public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();

        num.add(1);
        num.add(10);
        num.add(12);
        num.add(12);
        num.add(121);


        // System.out.println("At given [1]"+nums.get(1));
        for (int i : num) {
            System.out.println(i);
        }

    }

}
