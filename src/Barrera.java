public class Barrera {
    Integer contador;

    Barrera(){
        contador=0;
    }

    public void conteo() {
            synchronized (this){
                if(contador==4){
                    System.out.println("Barrera");
                    this.notifyAll();
                    contador=0;
                }
            }

        }
   synchronized boolean notificar(){
        if(contador==4){
            return true;
        }else{
            return false;
        }

    }
}
