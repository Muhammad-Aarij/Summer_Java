public class ThreadClass2 implements Runnable {
    
    public void run() {
        // System.out.println("Thread 2 is running");

        for (int i = 0; i <50; i++) {

            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
