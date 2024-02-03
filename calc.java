/**
 * The above class is a simple calculator program that performs addition, subtraction, multiplication,
 * or division based on the given operator.
 */
public class calc extends Area{
    /**
     * The main function performs a basic arithmetic operation based on the given operator and prints
     * the result.
     */
    public static void main(String[] args)
    {
        calc cal = new calc();
        double n1=10,n2=20,result;
        String op="+";
        // The `switch` statement is used to perform different actions based on different conditions.
        // In this case, it is used to perform different arithmetic operations based on the value of
        // the `op` variable.
        switch(op)
        {
            case"+":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"-":result=n1-n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"*":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
            case"/":result=n1+n2;
            System.out.println(n1+""+op+""+n2+" = "+result);
            break;
        }
        double area_triangle=cal.area_0f_triangle(n1, n2);
        System.out.println("Area of triangle: "+area_triangle);

        double area_square=cal.area_of_square(n2);
        System.out.println("Area of square: "+area_square);
    }
}

