class ThreaDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
        });

        t1.start();

        t1.join();

        System.out.println("Main thread continues");
    }
}