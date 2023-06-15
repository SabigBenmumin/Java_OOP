public class Pragard {
    public static void main(String[] args){
        int height; //ประกาศตัวแปรที่เก็บข้อมูลความสูงไว้ใน height ในรูปแบบของจน.เต็ม
        double weight; //ประกาศตัวแปรที่เก็บข้อมูลน้ำหนักเป็นตัวเลขที่มีจุดทศนิยม
        boolean isman; //ประกาศตัวแปรที่เก็บข้อมูลว่าเป็นผู้ชายจริงหรือไม่(True or False)
        char sex; //ประกาศตัวแปรที่เก็บข้อมูลตัวอักษรจะเก็บข้อมูลได้ไม่เกิน 1 ตัวอักษร
        height = 175;
        weight = 67.25;
        isman = true;
        sex = 'M';
        System.out.println("my name is Sabig Benmumin");
        System.out.printf("I'm toll %s cm\n", height);
        System.out.printf("my weight is %s kg\n", weight);
        System.out.printf("is %s I'm is men\n", isman);
        System.out.printf("my sex is %s", sex);

        /*
         * Data type
         *  |
         *  |--Logical data type
         *  |   |
         *  |   |--call boolean for build variable has contain true or false data
         *  |
         *  |--Textual data type
         *  |   |
         *  |   |--call char keyword for build variable has contain text character data
         *  |
         *  |--Integer data type
         *  |   |
         *  |   |--call some keyword for contain integer data (byte, short, int, long)
         *  |       |
         *  |       |--byte contain integer with 8 bit storege
         *  |       |
         *  |       |--short contain integer with 16 bit or 2 byte storege
         *  |       |
         *  |       |--int contain integer with 32 bit or 4 byte storege
         *  |       |
         *  |       |--long contain integer with 64 bit or 8 byte storege
         *  |
         *  |--Float data type
         *  |   |
         *  |   |--call some keyword for contain float data (float, double)
         *  |       |
         *  |       |--float contain float data with 32 bit or 4 byte storege
         *  |       |
         *  |       |--double contain float darta with 64 or 8 byte storege range
         *  |
         */
    }
}
