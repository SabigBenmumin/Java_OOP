public class M_String {
    public static void main(String[] args){
        String nums = "123456789", my_name = "Sabig", uppername, lowername;
        char num = nums.charAt(3);
        int l = nums.length();
        uppername = my_name.toUpperCase();
        lowername = my_name.toLowerCase();
        System.out.println("print number from nums with index: "+num);
        System.out.println("print length of nums with length method: "+l);
        System.out.println("print my_name: "+my_name);
        System.out.println("print my_name in lower case:"+ lowername);
        System.out.println("print my_name in upper case: "+ uppername);
        /*
         * this file will show me understand with method of String class
         * 
         * String class
         *  |
         *  |-------
         *      |
         *      |--charAt method will get character in string with index
         *      |
         *      |--length method will get len of your string
         *      |
         *      |--toUpperCase method will get your string in upper case
         *      |
         *      |--toLowerCase method will get your string in lower case
         * 
         */
    }
}
