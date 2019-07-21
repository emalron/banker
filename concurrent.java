public class concurrent implements Runnable{
    private int res = 0;
    
    @Override
    public void run() {
        synchronized(this) {
            for(int i=0; i<10000; i++) {
                res++;
            }
        }
    }
}