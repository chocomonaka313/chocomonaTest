public class Main{
    public static void main(String[] args){
        Thread t1 = new ThreadSample();
        Thread t2 = new ThreadSample();
        Thread t3 = new ThreadSample();
        t1.start();
        t2.start();
        t3.start();
    }
}