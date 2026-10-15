package practice;

public class Sub extends Super{
    int num = 3;
    public void display(){
        num+=super.num;
        System.out.println(num);
        System.out.println(super.num);
        System.out.println(id);
    }
}
