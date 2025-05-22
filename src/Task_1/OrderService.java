package Task_1;

public class OrderService {

    int orderCount = 0;

    public synchronized void increaseOrderCount(){
        this.orderCount += 1;
    }

    public static void main(String[] args) throws InterruptedException{

        OrderService orderService = new OrderService();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) orderService.increaseOrderCount();
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) orderService.increaseOrderCount();
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Counter: " + orderService.orderCount);
    }
}
