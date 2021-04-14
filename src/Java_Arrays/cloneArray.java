package Java_Arrays;



class cloneArray {
    public static void main(String[] args) {
        int oriArray[][] = {{1,2,3}, {4,5,6}};
        int cloneArray[][] = oriArray.clone();

        System.out.println(oriArray==cloneArray);
        System.out.println(oriArray[0] + " " + cloneArray[0]);
    }

}
