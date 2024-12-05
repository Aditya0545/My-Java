class throwTest {
    public static void demoproc() {
        try {
            NullPointerException obj = new NullPointerException("demo");
            throw obj;
        } catch(NullPointerException e) {
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException a) {
            System.out.println("Recaught" +a);
        }
    }
}