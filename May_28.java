import java.util.Scanner;

public class May_28 {
public static void main(String[] args) {
    // Person_Data();
    //Rectangle();
    // Circle();
    Calculater();
}
// public static void Person_Data(){
// java.util.Scanner Data = new java.util.Scanner(System.in);
// System.out.println("Please Enter your Name");
// String Name = Data.nextLine();
// System.out.println("Please Enter your Age");
// int Age = Data.nextInt();
// System.out.println("Hello Mr." + Name + " Nice to meet you. i got to know that you are "+ Age + " Years old.");
// }
// public static void Rectangle(){
//     java.util.Scanner Rect = new java.util.Scanner(System.in);
//     System.out.println("Please Enter lenght : ");
//     int length = Rect.nextInt();
//     System.out.println("Please Enter width : ");
//     int width = Rect.nextInt();
//     System.out.println("Area of Rectangle is " + (length*width));
// } 

//  public static void Circle(){
//     java.util.Scanner Circle = new java.util.Scanner(System.in);
//     System.out.println(" Area of Radius : " );
//     Double Radius = Circle.nextDouble();
//     Double Area_Of_Circle = (22.0/7.0)*(Radius*Radius);
//     System.out.println("Area of Circle : " + Area_Of_Circle);
//}

public static void Calculater(){
 Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        if (operator == '+')           {
            result = num1 + num2;
}       else if (operator == '-')  {
            result = num1 - num2;
}       else if (operator == '*') {
            result = num1 * num2;
}       else if (operator == '/')  {
        if (num2 != 0) {
                result = num1 / num2;
}       else {
            System.out.println("Error: Division by zero is not allowed.");
                return;
}
}           else {
            System.out.println("Error: Invalid operator.");
            return;
}

            System.out.println("Result: " + result);
}
}