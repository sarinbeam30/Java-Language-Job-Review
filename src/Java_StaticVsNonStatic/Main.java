package Java_StaticVsNonStatic;

class GFG {
    //non-static method
    public int sum(int a, int b)
    {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        int n=3, m=6;
        GFG g = new GFG();

        //call the non-static method
        int s = g.sum(n, m);
        System.out.print("sum is = " + s);
    }
}
