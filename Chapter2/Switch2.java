public class Switch2 {
    public static void main(String[] args){
        int n;
        double d;
        n = 30;
        System.out.printf("n = %s\n",n);
        d = n;
        /*
         * ในบรรนทัดบนจะทำการนำค่าที่เป็น int มาใส่ในค่า double
         * ซึ่งขั้นตอนดังกล่าวสามารถทำได้เนื่องจาก
         * ตัวแปรที่เป็นค่า double สามารถรับตัวแปรที่เป็น int ได้โดยการเติมจุดทศนิยม
         */
        System.out.println("d รับค่ามาจากตัวแปรมาจาก n");
        System.out.printf("d = %s\n",d);
    }
}
