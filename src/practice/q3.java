package practice;
class A{
    static int i=0;
    A() {
        i++;
        System.out.print("A");
    }
}
class B extends A{
    static int i=0;
    B() {
        super.i++;
        System.out.print("B");
    }
}
public class q3 {
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.i);
        A b= new B();
        System.out.println( a.i );
        System.out.println( b.i );
    }

}