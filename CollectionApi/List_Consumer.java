package CollectionApi;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;

public class List_Consumer {

    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(1,2,3,4  ,5,6);
        // Consumer <Integer> com=new Consumer<Integer>(){

        //     @Override
        //     public void accept(Integer t) {
        //         // TODO Auto-generated method stub
        //         System.out.println(t);
        //     }

        // };
        Consumer <Integer> com=(Integer t) ->
                System.out.println(t);
            ;

        

        num.forEach(com); //Using forEach method to iterate over the list and print each element.
        
    }
    
}
