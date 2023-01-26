package threads;

public class TestThread {
    public static void main(String[] args) {
        RunnableThreadExample R1 = new RunnableThreadExample("Thread-1");
        R1.start();

        RunnableThreadExample R2 = new RunnableThreadExample("Thread-2");
        R2.start();
    }
}
