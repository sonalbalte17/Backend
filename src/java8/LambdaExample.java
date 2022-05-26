package java8;

import java.util.ArrayList;
import java.util.List;

public
class LambdaExample {
    public static
    void main (String[] args) {
        List<Integer> list = new ArrayList<Integer> ();
        list.add (100);
        list.add (200);
        list.add (300);
        list.add (400);
        for (Integer i : list
        ) {
            System.out.println ("List without Lambda  " + i);
        }
        //(argument-list)->{body}//Lambda expression syntax

        list.forEach ((num)->{
            System.out.println ("list-with lambda::::"+ num);
        });
        list.forEach ((Integer num)->{
            System.out.println ("list-with lambda parameter type:::::"+num);
        });
        list.forEach (( num)->
            System.out.println ("list-with lambda without curly braces:::::"+num) );
    }
}
