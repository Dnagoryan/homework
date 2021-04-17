package ru.homeworklvltwo.lesson5;

import java.util.Arrays;

public class MainApp {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;



    public static void main(String[] args) {
        MainApp e1 = new MainApp();
        System.out.println("погнали");

        e1.method1();
        e1.method2();

    }

        public float[] calculation(float[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
            System.out.println("вернул массив");
            return arr;
        }


            public void method1() {
            float[] arr = new float[SIZE];
            Arrays.fill(arr, 1.0f);
            long a = System.currentTimeMillis();
            calculation(arr);
            System.out.println("Первая нить кончилась :" + (System.currentTimeMillis() - a));
        }


        public void method2 () {
            float[] arr = new float[SIZE];
            float[] arr1 = new float[HALF];
            float[] arr2 = new float[HALF];
            Arrays.fill(arr, 1.0f);
            long a = System.currentTimeMillis();
            System.arraycopy(arr, 0, arr1, 0, HALF);
            System.arraycopy(arr, HALF, arr2, 0, HALF);
          Thread thread1=  new Thread(){
                public void run(){calculation(arr1);}
          };

          Thread thread2= new Thread(){
                public void run(){calculation(arr2);}
          };

            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }



            System.arraycopy(arr1,0,arr,0,HALF);
            System.arraycopy(arr2,0,arr,HALF,HALF);
            System.out.println("Две нити заканчиваются:" + (System.currentTimeMillis() - a));


        }

    }




