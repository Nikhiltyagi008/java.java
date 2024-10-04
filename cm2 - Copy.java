// public class cm2 {
//     public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         int spaces=2*(n-i);
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         int spaces=2*(n-i);
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }
// }
// public class cm2{
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();
//         }
    // }
// }
// public class cm2{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//            int spaces =2*(n-i);
//            for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//             System.out.print("*");
//            }
//            System.out.println();
//         }
//     }
// }
// factorial code
import java.util.Scanner;
public class cm2{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input:i");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        System.out.println(fact);
    }
}