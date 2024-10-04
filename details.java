class wap {
    int rollno;
    String status;
    public void details(){
        System.out.println("ROllNO"+rollno);
        System.out.println("STAUS"+status);
    }
    
}
public class details{
    public static void main(String argss[]){
        System.out.println("this is details class");
        wap tyagi=new wap();
        wap mukul=new wap();
        wap prikshit=new wap();
        tyagi.rollno=83;
        tyagi.status="pass";
        mukul.rollno=73;
        mukul.status="pass";
        prikshit.rollno=91;
        prikshit.status="pass";
        tyagi.details();
        mukul.details();
        prikshit.details();


    }
}