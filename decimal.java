import java.util.*;
public class decimal{
    public static void decimaltobinary(int n){
        int binary=0;
        int power=0;
        while(n>0){
            int remainder=n%2;
            binary=binary+remainder*(int)Math.pow(10,power);
            n=n/2;
            power++;
}
System.out.println(binary);
    } 
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
decimaltobinary(n);
sc.close();
}
}