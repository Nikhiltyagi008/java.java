import java .util.Scanner;
public class coditional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
//         if(age>=18&&age<=60){
//             System.out.println("yes you can drive");
//         }
//         else if(age>100){
//             System.out.println("enter the valid age");
//         }
   
// else{
//     System.out.println("you can't drive");
// }
switch  (age) {
    case 18:System.out.println("you are adult");
    break;
case 21:System.out.println("you are join indian army as lieutinant");
case 23:System.out.println("you are completed training and become lieutinant ");
break;
case 25:System.out.println("you are married to a most loyal and beautiful girl");
break;
case 32:System.out.println("you are become major");
break;
    default:System.out.println("everyone is happy in your family and you are enjoy your life with brother and succes and parents");
        break;
}
sc.close();    
}

}
    
  
