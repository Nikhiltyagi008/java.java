// public class digitcount{
//     public static int countno(int n){
        
//         int count=0;
//         if(n==0){
//             return 1;
//         }
//         while(n>0){
        
//             n=n/10;
//             count++;
//         }
//         return count;
//         }
// public static void main(String[] args) {
//    int n=12355;
//     int no=countno(n );
//     System.out.println(no);
// }
//     }
import java .util.*;
public class digitcount{
    public static void binarytodecimal(int binary){
        int myno=binary;
        int decimal=0;
        int power=0;
        
        while(binary>0){
            int ld=binary%10;
            decimal=decimal+(ld*(int)Math.pow(2,power));
            binary=binary/10;
            power++;
            
        }
        System.out.println("decimal of"+myno+"="+decimal );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary value");
        int binary=sc.nextInt();
        binarytodecimal(binary);
        sc.close();
    }
}