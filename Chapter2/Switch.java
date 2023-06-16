public class Switch {
    public static void main(String[] args){
        int n;
        double d;
        d = 2.5;
        System.out.printf("d = %s\n",d);
        n = (int) d;
        /*
         * บรรนทัดด้านบนทำการใช้ cast operators
         * โดยการแปลงประเภทข้อมูลที่ใหญ่กว่าเป็นข้อมูลที่เล็กกว่า
         * เพราะจากข้อมูลประเภท int ไม่สามารถรับข้อมูลต่อจาก double ได้
         * เนื่องจากตัวแปรประเภท int ไม่สามารถเก็บค่าทศนิยมได้
         */
        System.out.printf("n = %s\n",n);
        System.out.printf("d = %s\n",d);
    }

}
