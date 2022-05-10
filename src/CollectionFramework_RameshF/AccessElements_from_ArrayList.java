package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.List;

public
class AccessElements_from_ArrayList {
    public static
    void main (String[] args) {
        List fruits=new ArrayList (  );
        fruits.add ("banana");
        fruits.add ("mango");
        fruits.add ("orange");
        fruits.add ("grapes");
       System.out.println (fruits.isEmpty ());
       System.out.println (fruits.size () + " size");

        fruits.set (2,"strawberry");
        System.out.println (fruits.get (1));
        System.out.println (fruits);
    }
}
