package String;

public
class String_vs_StringBuffer {
    public static
    void main (String[] args) {
        String s= new String ("sonal");
        System.out.println (s);
        s.concat ("balte");
        System.out.println (s);
        StringBuffer sb=new StringBuffer ("sonal");
        System.out.println (sb);
        sb.append ("balte");
        System.out.println (sb);
    }
}
