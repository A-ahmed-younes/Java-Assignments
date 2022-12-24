import java.net.MalformedURLException;
import java.net.URL;


public class Application {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Talkative(4));
        Thread thread2 = new Thread(new Talkative(11));
        Thread thread3 = new Thread(new Talkative(40));
        Thread thread4 = new Thread(new Talkative(48));
        Thread thread5 = new Thread(new Talkative(24));
        Thread thread6 = new Thread(new Talkative(102));
        Thread thread7 = new Thread(new Talkative(165));
        Thread thread8 = new Thread(new Talkative(89));
        Thread thread9 = new Thread(new Talkative(11));
        Thread thread10 = new Thread(new Talkative(9));

        try {
            URL url = new URL("https://cdn.kernel.org/pub/linux/kernel/v6.x/linux-6.1.tar.xz");
            String File = url.getPath();
            System.out.println(File);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }



        /*thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();*/
    }
}
//solution :

/*thread.start();
        thread.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread4.start();
        thread4.join();
        thread5.start();*/