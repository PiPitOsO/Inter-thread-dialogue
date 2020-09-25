public class Main {
    public static void main(String[] args) {
        System.out.println("Создаю потоки...");

        ThreadGroup group = new ThreadGroup("group");

        MyThread thread1 = new MyThread(group, "поток 1");
        MyThread thread2 = new MyThread(group, "поток 2");
        MyThread thread3 = new MyThread(group, "поток 3");
        MyThread thread4 = new MyThread(group, "поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
            group.interrupt();
        } catch (InterruptedException err) {

        } finally {
            System.out.println("Завершаю все потоки.");
        }
    }
}