public class Main {
    public static void main(String[] args) {
        System.out.println("Создаю потоки...");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();

        thread1.setName("поток 1");
        thread2.setName("поток 2");
        thread3.setName("поток 3");
        thread4.setName("поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
                Thread.sleep(15000);
            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();
            thread4.interrupt();
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("Завершаю все потоки.");
        }
    }
}