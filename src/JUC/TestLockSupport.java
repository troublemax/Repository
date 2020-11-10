package JUC;

import java.util.concurrent.locks.LockSupport;

public class TestLockSupport {

    static Thread t1=null , t2 =null;

    public static void main(String [] rags){

        char [] c1="1234567".toCharArray();
        char [] c2="ABCDEFG".toCharArray();

        t1=new Thread(()->{
            for(char c11 : c1){
                System.out.print(c11);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        },"t1");

        t2=new Thread(()->{
            for(char c22 : c2){
                LockSupport.park();
                System.out.print(c22);
                LockSupport.unpark(t1);
            }
        },"t2");


        t2.start();
        t1.start();
    }
}
