

public class Pattern1 {
//359 640 578 275 166
 public static void main(String[] args) throws Exception {
    int i=0,j=0,n=9;
    
     for(i=0;i<n;i++){
         System.out.print("  ");
         for(j=0;j<n;j++){
             //if (i+j==n-1||i==0||i==n/2||j==n-1||j==0||i==n-1||i==j){ 
             if(i==n-1||j==n-1||i+j==n-1||i+j==n||i+j==n+1||i+j==n+2||i+j==n+3 ){
             System.out.print("* ");
             Thread.sleep(50);
         }
             else{
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
 }}
