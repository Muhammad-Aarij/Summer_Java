public class A extends Thread{
    public void run(){
        for(int i=0; i<100;i++){
            System.out.println(" Hi " );
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


