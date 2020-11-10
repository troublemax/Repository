public class Test {
    /**
     * sdfasdfasdf
     * @param args
     */
    public static void main(String [] args){
        String abc="\nab cde9(_+";
        char value[]=abc.toCharArray();
            int len = value.length;
            int st = 0;
            char[] val = value;    /* avoid getfield opcode */
        for(char c : val){
            if(c<= ' '){
                System.out.println("<>"+c);
            }
        }
            while ((st < len) && (val[st] <= ' ')) {
                System.out.println(val[st]);
                st++;
            }
            while ((st < len) && (val[len - 1] <= ' ')) {
                System.out.println(val[len-1]);
                len--;
            }
//        System.out.println(((st > 0) || (len < value.length)) ? abc.substring(st, len) : abc);
        System.out.println(abc.trim());
            char c='好';
        System.out.println((int)c);

        System.out.println(String.valueOf(1234567));
    }
}
