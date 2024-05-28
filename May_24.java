import java.util.Scanner;

public class May_24 {
public static void main(String[] args) {
    Swap_Numbers();
    Simple_Interest();
    Integer_Binary();
    Factorial();
    Complex_number();
}
     
 public static void Swap_Numbers(){
    int a = 30;
    int b = 24;
    System.out.println("Before Swapping");
    System.out.println(a);
    System.out.println(b);
    int tem = a;
    a = b;
    b = tem;
     System.out.println("After Swapping");
     System.out.println(a);
     System.out.println(b);
 }
 public static void Simple_Interest(){
    try (Scanner s = new Scanner(System.in)) {
    System.out.print("Enter Principal amount :: ");
    float p = s.nextFloat();

    System.out.print("Enter Rate of Interest in percentage :: ");
    float r = s.nextFloat();

     System.out.print("Enter Time in Years :: ");
     float t = s.nextFloat();

    float SI = (p * r * t) / 100;

     System.out.println("Simple Interest is :: " + SI);
}
}

  public static void Integer_Binary(){
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter any number: ");
    int num = s.nextInt();

    String b = Integer.toBinaryString(num);
    System.out.println("Convert Integer to Binary: " + num + " -> " + b);
  
  

  s.close();

}

    public static void Factorial(){
     try (Scanner s = new Scanner(System.in)) {
    System.out.print("Enter a number: ");
    int num = s.nextInt();

     long fact = 1;

    for (int i = 1; i <= num; i++) {
    fact *= i;
}

      
            
     System.out.println(fact);
}
}
public static void Complex_number(){

    int a=19;
    int b =28;
    int c=8;
    int d=9;
    String e = a + " + " + b + "i";
    String f = c + " + " + d+ "i";

    int real = a + c;
    int img = b + d;  
    String sum = real + " + " + img + "i";
    
    System.out.println("Complex number e: " + e);
    System.out.println("Complex number f: " + f);
    System.out.println("Sum of e and f: " + sum); 
}
}
    

