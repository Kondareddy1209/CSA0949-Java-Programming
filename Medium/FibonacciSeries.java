class FibonacciSeries implements Runnable {
    private int count;

    FibonacciSeries(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // Printing first two terms

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new FibonacciSeries(5)); // Modify count as needed
        thread.start();
    }
}
