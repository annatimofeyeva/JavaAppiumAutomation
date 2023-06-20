public class MathHelper
{
       public int simpl_int =7;
       public static int static_int = 7;
       final public int final_int = 9;

       public void changeSimpleInt(){
           this.simpl_int = 8;
       }
       public static void changeSimpleIntByStaticFunction() {
         static_int = 8;
       }
       public int calc(int a, int b, char action) {
        if (action == '+') {
            return this.plus(a, b);
        } else if (action == '-') {
            return this.minus(a, b);
        } else if (action == '*') {
            return this.multiplication(a, b);
        } else if (action == '/') {
            return this.divide(a, b);
        } else {
            return this.typeErrorAndReturnDefaultValue("Wrong action " + action);
        }
    }
    private int typeErrorAndReturnDefaultValue(String error_message) {
        System.out.println(error_message);
        return 0;
    }
    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int divide(int number, int divider) {
        if (divider == 0) {
            //return 0;
            return this.typeErrorAndReturnDefaultValue("Can not divide by zero");
        } else {
            return number / divider;
        }
/*    public int multiply(int number) {
        return number * 2;
    }
    public int multiply(int number, int multiplier) {
        return number * multiplier;
    }*/
    }
}


