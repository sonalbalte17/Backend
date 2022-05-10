package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public
class IdentityHashMapDemo {

    public static
    void main (String[] args) {
        IdentityHashMap m= new IdentityHashMap ();
        //In HashMap,JVM will use .equals to identify the duplicate keys which is meant for content comparison
        //IdentityHashMap,JVM will use == operator to identify the duplicate keys which is meant for
        // reference /address comparison

        Integer I1= new Integer (10);//I1--->10
        Integer I2= new Integer (10);//I2--->10
        System.out.println (I1==I2);//== operator used for reference or address comparison
        System.out.println (I1.equals (I2));//.equals method is used to compare the contents
        m.put (I1,"s");
        m.put (I2,"a");
        System.out.println (m);

    }}
