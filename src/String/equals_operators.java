package String;

public
class equals_operators {
    public static
    void main (String[] args) {
        //string object
        String s1=new String ("Sonal");
        String s2=new String ("Sonal");
        System.out.println (s1==s2);
        System.out.println (s1.equals (s2));

        //stringbuffer object
        StringBuffer sb1=new StringBuffer ("Sonal");
        StringBuffer sb2=new StringBuffer ("Sonal");
        System.out.println (sb1==sb2);
        System.out.println (sb1.equals (sb2));

    }
}
