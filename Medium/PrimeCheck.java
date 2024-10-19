class PrimeCheck implements Runnable {
    private int number;

    PrimeCheck(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new PrimeCheck(5)); // Change number as needed
        thread.start();
    }
}
