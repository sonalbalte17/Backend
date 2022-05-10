package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.List;

public
class ArrayListClassExample {
    public static
    void main (String[] args) {
        List fruits=new ArrayList (11);
        fruits.add ("banana");
        fruits.add ("mango");
        fruits.add ("orange");
        fruits.add ("grapes");
        System.out.println (fruits.size ());
        fruits.set (2,"strawberry");
        System.out.println (fruits);
    }
}
