import org.junit.Test;

public class MainTest extends CoreTestCase
{
    int a = 5;
    int b = 11;
    MathHelper mathHelper = new MathHelper();

    @Test
    public void myFirstTest() {
        System.out.println("Hi, QA engineers");
        int number = 10 + 15;
        double number1 = 20 / 5;
        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("This is never happened");
        } else {
            System.out.println("This is what will happen");
        }
        System.out.println(number);
        System.out.println(number1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);
        this.typeString();
        int s = this.giveMeInt();
        if (a > 10) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

/*        int d = MathHelper.multiply(5);
        if (d == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(d);
        int c = MathHelper.multiply(10, 15);
        System.out.println(c);

        int d = this.multiply(5);
        if (d == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(d);
        int c = this.multiply(10, 15);
        System.out.println(c);
    }*/
    }
        @Test
        public void mySecondTest () {
            System.out.println("Second test: Before changing static_int" + mathHelper.simpl_int);
            System.out.println("Second test: after changing static_int" + MathHelper.static_int);
        }
        public void typeString () {
            System.out.println("Typing String");
        }
        public int giveMeInt () {
            return 5;
        }
}

