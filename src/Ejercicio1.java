import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        List<Hilo> hilos=new ArrayList<>();
        Barrera barrera=new Barrera();
        hilos.add(new Hilo(1,barrera));
        hilos.add(new Hilo(2,barrera));
        hilos.add(new Hilo(3,barrera));
        hilos.add(new Hilo(4,barrera));
        for (Hilo hilo : hilos) {
            hilo.start();
        }
        for (Hilo hilo : hilos) {
            hilo.join();
        }

    }

}
