package quiz;

class A{
    int i=1;
    A(){
        System.out.println("A");
    }

    String getColor(){
        return "Yellow";
    }
}

class B extends A{
    int i=2;
    B(){
        super.i+=3;
        this.i=this.i+super.i;
        System.out.println("B");
    }

    @Override
    String getColor(){
        return "Green";
    }
}

public class BonusQuiz1_InheritanceIssue {

    public static void main(String[] args) {
        System.out.println(5%2);
    }
}