package mutithreadingConcurrency;


class MyThread extends Thread{
    @Override
    public void run() {

    }
    public void print(int a){
        System.out.println(a);
    }
}


public class Practice {
    public static volatile int val = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();




    }


}
