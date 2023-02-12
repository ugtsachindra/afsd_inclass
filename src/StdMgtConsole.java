import java.util.Scanner;
public class StdMgtConsole {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("-------Student Management System---------");

        Student[] students = new Student[10];

        for (int i = 1; i<=10; i++)
        {
            Student student = new Student();
            System.out.print("Enter Student "+ i +" Name : ");
            student.name = scan.nextLine();

            System.out.print("Enter Student "+ i +" Age : ");
            student.age = scan.nextInt();

            scan.nextLine();
            System.out.print("Enter Student "+ i +" Address : ");
            student.address = scan.nextLine();

            System.out.print("Enter Student "+ i +" Mark : ");
            student.mark = scan.nextInt();
            scan.nextLine();

            students[i-1] = student;

        }

        for (Student std:students) {
            System.out.println("[ name : "+std.name+", age:"+std.age+", address:"+std.address+", mark:"+std.mark+"]");
        }
    }
}
