public class Hello{
    public static void main(String[] args){ // this line for build method
    // static เป็นคำสั่งที่ทำให้โปรแกรมสามารถเรียกใช้ method โดยไม่ต้องสร้าง object
    // void เป็นคำสั่งที่บอกว่าหลังจากทำ method นี้แล้วจะไม่มีการ return ค่าออกมา
    // main เป็นคำสั่งที่บ่งบอกว่า method นี้เป็น method หลัก
        
        System.out.println("Hello world 1"); // print and new line for next command
        System.out.print("Hello world 2"); // print but not have newt line
        //print + "\n" == println
        System.out.println("Hello world 3");
        /*System is a class with has out object, out object is a object with has print and println methods
         * System class
         *      |
         *      |----out object
         *      |       |
         *      |       |----print method
         *      |       |
         *      |       |----println mthod
         *      |    
         */
    }
}