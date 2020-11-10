package JUC;

import java.util.concurrent.Callable;

/**
 * @Author: fanxiaolong
 * @Date: 2020-11-09 12:50
 * @Description: JUC
 * Version: 1.0
 */
public class TestReentrantLock {
    public static void main(String[] args) {
        System.out.println("hello world2");
        try {
            System.out.println("sssssssss");
        } finally {
            System.out.println("ssssss7411s");
        }
        System.out.println("hello world1");
        try {
            System.out.println("hello world3");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            Thread.currentThread().sleep(500);
        }


        for (int i = 0; i < ; i++) {
            
        }


    }
    String name;
    String abc;



}

