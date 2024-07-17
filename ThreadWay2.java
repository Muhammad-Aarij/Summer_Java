public class ThreadWay2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    

    ThreadClass1 threadClass=new ThreadClass1();
    ThreadClass2 threadClass2=new ThreadClass2();

    Thread t1=new Thread(threadClass);
    Thread t2=new Thread(threadClass2);

    t1.start();
    try {
        Thread.sleep(5);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    t2.start();
        
}
}
