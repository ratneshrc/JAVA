class Student {
    int roll_no;

    void getRoll(int r) {
        roll_no = r;
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int a, int b) {
        sub1 = a;
        sub2 = b;
    }
}

class Result extends Test {
    void display() {
        int total = sub1 + sub2;
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + sub1 + ", " + sub2);
        System.out.println("Total: " + total);
    }
}

public class P4 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getRoll(57);
        r.getMarks(50, 90);
        r.display();
    }
}