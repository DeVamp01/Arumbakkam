
import java.util.Arrays;

class  m1{
    public static void main(String[] args) {
        int[] a= {0,3,1};
        int c=0;
        Arrays.sort(a);
        for (int i: a) {
            if(i!=c++){
                
                System.out.println(--c);
            }
        }
    }
}