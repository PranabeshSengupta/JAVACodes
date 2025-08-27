public class MyThread1 extends  Thread{
    private  Counter counter;

    public  MyThread1(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            counter.increment();
        }
    }
}
