public class operator {
    public static void main(String[]args)    {
        Arithematic_operator();
        unary_operator();
        assignment_operator();
       

}
               //ARITHEMATIC OPERATOR

    public static void Arithematic_operator(){
        int num1 = 10, num2 = 20, sum = 0;
 
        // Displaying num1 and num2``
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
}
               //UnaryOperator

    public static void unary_operator(){
       int n1 = 30;
       System.out.println(n1); 
       n1 = -n1;
       System.out.println("Result ="+n1);
}
             //ASSIGNMENT OPERATOR
    public static void assignment_operator(){
        int f = 8 ;
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f += 1: " + (f += 1));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 5: " + (f /= 5));
        System.out.println("f %= 2: " + (f %= 2));

    }

}
