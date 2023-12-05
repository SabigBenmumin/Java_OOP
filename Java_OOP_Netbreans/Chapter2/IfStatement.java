import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("what you name?: ");
        name = scan.nextLine();
        System.out.print("how old are you?: ");
        age = scan.nextInt();
        if(age >= 20)
            System.out.printf("Hello %s", name);
    }
}
