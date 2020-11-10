
public class Test1 {

    public static void main(String []args){
        final Object o=new Object();
        char [] c1="1234567".toCharArray();
        char [] c2="ABCDEFG".toCharArray();

        new Thread(()->{
            synchronized (o){
                for(char c11 : c1){
                    try {
                        System.out.print(c11);
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        },"t1").start();

        new Thread(()->{
            synchronized (o){
                for(char c22 : c2){
                    try {
                        System.out.print(c22);
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        },"t2").start();
    }

    void abc (){
        System.out.println("sdfasdf");
    }
}
