public class Str1 {
    public static void main(String[] args) {
        String s1="DeVamp";
        try {
            System.out.println(s1.charAt(8));
            
        } catch (Exception e) {
           int s=s1.length()-1;
            System.out.println(s1.charAt(s));
        }

        String s3="raja", s2="RAJA";
        System.out.println(s2.equalsIgnoreCase(s3));



    }

}
