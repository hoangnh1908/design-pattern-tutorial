public class Main extends Thread{
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> Singleton.getUniqueInstance().SaysHi());
        Thread thread2 = new Thread(() -> Singleton.getUniqueInstance().SaysHi());

        thread1.start();
        thread2.start();
    }
}
