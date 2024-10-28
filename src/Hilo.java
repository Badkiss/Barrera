public class Hilo extends Thread {
    private int id;
    Barrera barrera;

    public Hilo(int id, Barrera barrera) {
        this.id = id;
        this.barrera = barrera;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(id * 1000);

                System.out.println(id);
                synchronized (barrera) {
                    barrera.contador++;
                   if(!barrera.notificar()){
                       barrera.wait();
                   }else{
                       barrera.conteo();
                   }


                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }


}
