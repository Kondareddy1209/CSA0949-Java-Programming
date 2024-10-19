class MultiplicationTable implements Runnable {
    private int number;

    MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread table5 = new Thread(new MultiplicationTable(5));
        Thread table10 = new Thread(new MultiplicationTable(10));

        System.out.println("Starting table for 5");
        table5.start(); 
        table5.join(); 

        System.out.println("Starting table for 10");
        table10.start();
    }
}
