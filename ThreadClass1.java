public class ThreadClass1 implements Runnable {
    
    public void run() {
        for (int i = 0; i <50; i++) {

            System.out.println("Thread 1 is runn0ing");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
