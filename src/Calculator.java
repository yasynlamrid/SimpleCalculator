


public class Calculator {

    private Calculator() {}

    public static double add (double a, double b)
    {
        return a+b;
    }

    public static double subtract (double a,double b)
    {
        return a-b;
    }

    public static double multiply (double a,double b)
    {
        return a*b;
    }

    public static double divide (double a, double b)
    {
        if(b==0)
        {
            System.out.println("Division by zero is not allowed");
            return 0;

        }
        else
        {
            return  a/b;
        }
    }
}
