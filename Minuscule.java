import java.util.ArrayList;
import java.util.List;

public class Minuscule {
    public static void main(String[] args) {
        String s1="abcabcdbbac";
        int largest=0;
        String ss="";
        
        for (int i = 0; i <s1.length()-1; i++) {
            List<Character> li= new ArrayList<>();
            li.add(s1.charAt(i));
            for (int j = i+1; j <s1.length(); j++) {
                if(!li.contains(s1.charAt(j)))li.add(s1.charAt(j));
                else break;
            }
            if(largest<li.size()){
            largest=Math.max(li.size(),largest);
            for (Object elem : li) {
                ss=ss+elem;
            }
            }
        }
    System.out.println("length of largest substring:"+largest+" "+ss);}
}
