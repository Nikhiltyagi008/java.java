import java.util.*;
public class cal {
    int a;
    int b;
    cal(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
 a=sc.nextInt();
System.out.println("enter the value of b");
 b=sc.nextInt();
}
}
class MAIN{
    public static void main(String[] args) {
        System.out.println("enter 1 for add");
        System.out.println("enter 2  for subtract");
        System.out.println("enter 3 for multiply");
        System.out.println("enter 4 for divide");
        cal caluclator=new cal();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choices");
        int number=sc.nextInt();
        
        switch (number ) {
            case 1: System.out.println((caluclator.a+caluclator.b));
                
                break;
                case 2:System.out.println((caluclator.a-caluclator.b));
                break;
                case 3:System.out.println((caluclator.a*caluclator.b));
                  break;
                  case 4:System.out.println(caluclator.a/caluclator.b);
                  break;

            default:System.out.println("enter a valid number");
                break;
        }
    }
}