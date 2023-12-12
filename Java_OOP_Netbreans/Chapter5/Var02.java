import java.util.Scanner;

public class Var02 {
    public static void main(String[] args){
        String employee[] = new String[3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3;i++){
            System.out.print("What your name? :"); 
            employee[i] = scan.nextLine();
        }
        for(int l = 0; l < employee.length;l++){
            System.out.printf("employee ID:[%d] = %s\n",l,employee[l]);
        }
    }
}
