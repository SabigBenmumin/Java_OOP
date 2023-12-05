public class Shorting {
    public static void main(String[] args){
        int l, s;
        l = 0;
        s = 0;
        l = l + 1;
        s += 1;
        System.out.printf("l = 0 --> l = l + 1 --> l = %s\n", l);
        System.out.printf("s = 0 --> s += 1 --> s = %s\n", s);
        s++;
        System.out.printf("s = 1 --> s++ --> s = %s\n", s);
    }
}
