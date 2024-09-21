
import myfirstpackage.*;
public class MyFirstClass{
    public static void main(String[] s){
        MySecondClass o = new MySecondClass(3, 7);
        System.out.println(o.operations());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.operations());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}