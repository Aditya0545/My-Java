class A extends Thread {
    public void run() {
        for(int i  = 1; i <= 10; i++) {
            System.out.println("\t from thread A: i= "+i);
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread {
    public void run() {
        for(int j  = 1; j <= 10; j++) {
            System.out.println("\t from thread B: j= "+j);
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread {
    public void run() {
        for(int k  = 1; k <= 10; k++) {
            System.out.println("\t from thread C: k= "+k);
        }
        System.out.println("Exit from thread C");
    }
}

class TestThread1 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.start();
        objB.start();
        objC.start();
    }
}