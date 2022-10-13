package variable;

public class VariableManipulation {
    public static void  main(String[] args){
        int number1 = 33;
        int reminder = number1/10;
        System.out.println("Reminder is equal to : " + reminder);

        int i = 0 ;
        i++;
        System.out.println("value of i is : " +i);

        int j = 5;
        j--;
        System.out.println("Value of j is:" +j);

        int a = 7;
        int b = 3;

        int sum =  a+b;
        System.out.println("Sum is :" +sum);

        int sub =  a-b;
        System.out.println("subtraction is :" +sub);

        int mul =  a*b;
        System.out.println("Multiplication is :" +mul);

        double div = (double ) a/b;  // typecasting
        System.out.println("Division is :" +div);

    }
}
