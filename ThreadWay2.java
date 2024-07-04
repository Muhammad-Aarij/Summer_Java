public class ThreadWay2 {
    public static void main(String[] args) {
        
    

    ThreadClass1 threadClass=new ThreadClass1();
    ThreadClass2 threadClass2=new ThreadClass2();

    Thread t1=new Thread(threadClass);
    Thread t2=new Thread(threadClass2);

    t1.start();
    t2.start();
    
}
}
