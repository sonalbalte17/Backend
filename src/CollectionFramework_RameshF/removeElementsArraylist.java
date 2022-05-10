package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.List;

public
class removeElementsArraylist {
    public static
    void main (String[] args) {
        List fruits=new ArrayList (  );
        fruits.add ("banana");
        fruits.add ("mango");
        fruits.add ("orange");
        fruits.add ("grapes");
        fruits.add ("watermelon");
        System.out.println (fruits);
        fruits.remove ("banana");//removing object
        fruits.remove (2);//removing element at given index
        System.out.println (fruits);
        List subfruits=new ArrayList ();
        subfruits.add ("mango");
        subfruits.add ("orange");
        System.out.println (subfruits);
        fruits.removeAll (subfruits);
        System.out.println (fruits);
        fruits.clear ();
        System.out.println (fruits);

    }
}
