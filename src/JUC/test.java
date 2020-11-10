package JUC;

import java.util.List;
import java.util.ArrayList;

public class test {

    List<Object> objs=new ArrayList<>();

    public void add(Object obj){
        objs.add(obj);
    }

    public int size(){
        return objs.size();
    }

    public static void main(String[] args) {

        test test = new test();
        Thread thread = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    test.objs.add(new Object());
                }
            }
        };

        Thread thread1 = new Thread(){
            public void run(){
                while(true){
                    if(test.objs.size()==5){
                        System.out.println("==="+test.objs.size());
                        break;
                    }
                }
            }
        };

        thread.start();
        thread1.start();
    }

}