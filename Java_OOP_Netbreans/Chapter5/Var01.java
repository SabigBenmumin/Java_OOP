/*this file has show how build array variable
 *to way for variable definition
    1 data_type [] var_name;
    2 data_type var_name[];
 */
/*
 * and then we must set that array size
 * example0
 *  data_type [] var_name = new data_type [size];
 * or 
 *  data_type var_name[] = new data_type [size];
 */
public class Var01 {
    public static void main(String[] args){
        int nums[] = new int [9];
        int total = 0;
        for(int i = 0; i < 8;i++){
            nums[i] = i*2;
        }
        for(int i = 0; i < 8;i++){
        System.out.println(nums[i]);
        }
    }
}