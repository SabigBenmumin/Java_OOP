import java.util.Scanner;

public class Zcanner {
    public static void main(String[] args){
        //this program let show you have know about how build scanner line with keybourd
        Scanner keybourd = new Scanner(System.in); 
        String name;
        int height;
        double weight;
        //^บรรทัดนี้จะทำการจองหน่วยความจำให้ตัวแปรโดยใช้คำสั่ง new ตามด้วยชื่อคลาสและใส่ argument
        /*
         * รับข้อมูลจากแป้นพิมพ์ด้วยการสร้างตัวแปร object จากคลาส Scanner
         * sudo code
         * ประกาศชื่อตัวแปร object 
         * ใช้คำสั่ง new จองหน่วยความจำ --> objectname = new Scanner(System.in);
         * นำตัวแปรที่ต้องการเก็บข้อมูลไปรับผ่าน object ที่ประกาศไว้ตามด้วย statment ของ data type นั้นๆ
         */

        //write statment for read input data each data type with call methods next...() ...is data type
        /*
         * method for write statment
         *      |--nextByte() except byte data type
         *      |--nextShort() except short data type
         *      |--nextLong() except long data type
         *      |--nextInt() except int data type
         *      |--nextFloat() except float data type
         *      |--nextDouble() except double data type
         *      |--nextLine() except String data type
         */
        System.out.print("what's your name: ");
        name = keybourd.nextLine();
        System.out.print("how tall are you: ");
        height = keybourd.nextInt();
        System.out.print("how much your weight: ");
        weight = keybourd.nextDouble();

        System.out.println("My name is: "+ name);
        System.out.println("My toll is: "+ height);
        System.out.println("My weight is: "+ weight);
    }
}
