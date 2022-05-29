import java.util.concurrent.ThreadLocalRandom;

public class Singleton {

    private static volatile Singleton uniqueInstance;
    private static Object lockObject = new Object();
    private Integer index;

    private Singleton(Integer index) {
        this.index = index;
    }

    //    Getter
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (lockObject) {
                if (uniqueInstance == null) {
                    Integer random = ThreadLocalRandom.current().nextInt(1, 6);
                    uniqueInstance = new Singleton(random);
                }
            }
        }
        return uniqueInstance;
    }

    public void SaysHi() {
        System.out.println("Hello everyone, I am ... " + index);
    }

}
