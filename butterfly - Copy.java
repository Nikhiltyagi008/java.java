// public class butterfly {
//     public static void butterflyies(int n){
//         // upperbound
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
            
//             //spaces
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1 ;j<=i;j++){
//             System.out.print("*");     
//             }
//             System.out.println();
//         }
        
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
            
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//            for(int j=1;j<=i;j++){
//             System.out.print("*");
//            }
//            System.out.println();
//         }

        
//     }
//     public static void main(String[] args) {
//         butterflyies(5);
//     }
    
// }
// public class butterfly {
//     public static void rhombas(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }



// }
// public static void main(String[] args) {
//     rhombas(5);
// }
// }
public class butterfly {
    public static void printpalindrome(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // left side
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // right side
            for(int j=2;j<=i;j++){
                System.out.print(j);

    }
System.out.println();
}
}
public static void main(String[] args) {
    printpalindrome(5);
    
}
}
