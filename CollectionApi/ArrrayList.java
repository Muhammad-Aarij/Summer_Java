package CollectionApi;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class ArrrayList {

    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        num.add(1);
        num.add(10);
        num.add(12);
        num.add(121);

        nums.addAll(num);


        System.out.println("At given [1]"+nums.get(1));
        for (int i : num) {
            System.out.println(i);
        }

    }

}
