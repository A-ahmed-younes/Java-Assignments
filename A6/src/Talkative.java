public class Talkative implements Runnable {
    private int n;


    public Talkative(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(n);
        }
    }
}
