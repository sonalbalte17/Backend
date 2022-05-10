package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.List;

public
class createArrayList_From_Collection_Example {
    public static
    void main (String[] args) {
        //How to create arraylist from another collection using the ArrayList(colelction c) constructor.
        List<Integer> first_five_prime_no_list= new ArrayList<> ();
        first_five_prime_no_list.add (1);
        first_five_prime_no_list.add (2);
        first_five_prime_no_list.add (3);
        first_five_prime_no_list.add (5);
        first_five_prime_no_list.add (7);
        //System.out.println (first_five_prime_no_list);

        //passing  collection c as parameter
        List<Integer> first_ten_prime_no_list=new ArrayList<> (first_five_prime_no_list);
        System.out.println (first_ten_prime_no_list);

        //how to  add all the elements from the existing collection to the new arraylist using addAll() method
        List<Integer> next_five_prime_no_list =new ArrayList<> ();
        next_five_prime_no_list.add (11);
        next_five_prime_no_list.add (13);
        next_five_prime_no_list.add (17);
        next_five_prime_no_list.add (19);
        next_five_prime_no_list.add (23);
        System.out.println (next_five_prime_no_list);

        //using add.all method to pass collection c as an argument
        first_ten_prime_no_list.addAll (next_five_prime_no_list);
        System.out.println (first_ten_prime_no_list);
    }
}
