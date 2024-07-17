package CollectionApi;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Streaam {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> s=num.stream();
        Stream<Integer> s1=s.filter(n->n>4);
        Stream<Integer> s2=s1.map(n->n*n);
        
        s2.forEach(n->System.out.println(n));
        
        int result =num.stream()
                            .filter(n->n>4)
                            .map(n->n*n)
                            .reduce(0, (c,e)->c+e);        
        System.out.println("result"+result);
    }

}
