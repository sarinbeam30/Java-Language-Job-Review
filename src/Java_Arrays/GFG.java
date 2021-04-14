package Java_Arrays;

// Arrays of Objects

class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class GFG {
    public static void main(String[] args) {
        // declares an Array of integer and allocate memory for 5 objects of type student
        Student[] arr = new Student[5];

        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");

        for(int i=0; i<3; i++)
        {
            System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
        }


    }
}
