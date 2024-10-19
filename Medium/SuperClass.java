class SuperClass {
    int a;
    
    SuperClass(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("SuperClass a: " + a);
    }
}

class SubClass extends SuperClass {
    int a;
    
    SubClass(int a, int superA) {
        super(superA);
        this.a = a;
    }

    void display() {
        System.out.println("SubClass a: " + a);
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}
