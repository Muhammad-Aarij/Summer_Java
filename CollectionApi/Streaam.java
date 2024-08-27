package CollectionApi;

import java.util.*;
import java.util.stream.*;

public class Streaam {
    public static void main(String[] args) {

        var lst=new ArrayList<>();
        lst.add(1);
        System.out.println("LIST 1");

    

        List<Integer> num =new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 6)) ;
        num.add(8);
        System.out.println();
        Stream<Integer> s=num.stream();
        Stream<Integer> s1=s.filter(n->n>4);
        Stream<Integer> s2=s1.map(n->n*n);
        Stream<Integer> s3=s2.sorted();
        
        s3.forEach(n->System.out.println(n));
        
        int result =num.stream()
                            .filter(n->n>4)
                            .map(n->n*n)
                            .reduce(0, (c,e)->c+e);        
        System.out.println("result"+result);
    }

}
