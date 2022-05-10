package Collection_framework;

import java.util.*;

public
class SetExample {
    public static
    void main (String[] args) {
        Set set=new HashSet ();
        set.add ("sonal");
        set.add ("anup");
        set.add ("sonal");// duplicate not allowed,order is not preserved
        set.add (null);//only one null is allowed as set allows only unique objects
        set.add (null);
        System.out.println ("Set::: "+set);
        System.out.println (set.size ());
        //set.hashCode ();
        System.out.println (set.contains ("sonal"));
         List l=new ArrayList<> ();
         l.add ("s5");
         l.add ("s3");
         Collections.sort (l);//sorted array

        System.out.println (l);
     //   Collections.reverseOrder (l);
     //   System.out.println (l);

        set.addAll (l);
        System.out.println ("Updated Set::: "+set);

    }
}
