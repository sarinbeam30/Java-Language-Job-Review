package Java_FinalKeyword;

class A {
    static final int data;
    static {
        data = 100;
    }

    public static void main(String[] args) {
//        A.data = 200;
        System.out.println(A.data);
    }
}
