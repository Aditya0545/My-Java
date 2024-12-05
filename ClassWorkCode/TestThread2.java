class X implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even no from thread\t" + i);
            }
        }
        System.out.println("Exit from thread");
    }
}

class TestThread2 {
    public static void main(String[] args) {
        X test = new X(); // Correct class name is used here
        Thread threadX = new Thread(test);
        threadX.start();
        System.out.println("Exit from main thread");
    }
}
