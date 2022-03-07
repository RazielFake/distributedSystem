package controllers.Threads;
import static java.lang.Thread.sleep;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raziel
 */
public class ClockThread extends Thread{
    
    private int horas;
    private int minutos;
    private int segundos;
    private boolean execute = true;
    private int speed = 1000;
    
    private javax.swing.JLabel tiempo;
    public ClockThread(javax.swing.JLabel tiempo, int horas, int minutos, int segundos){
        this.tiempo = tiempo;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public void run() {
        while(true){
            if(this.execute){
                actualizar();
                this.tiempo.setText(toString());
                try{
                    sleep(speed);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try{
                    sleep(speed);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void actualizar(){
        if(segundos < 59){
            segundos++;
        }else{
            minutos++;
            segundos = 0;
            if(minutos>59){
                minutos = 0;
                horas++;
                    if(horas>23){
                        horas = 0;
                    }
            }
        }
    }
    
    
    public void pause(){
        this.execute = false;
    }
    
    public void restart(){
        this.execute = true;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void setSpeed(int speed){
        this.speed+=speed;
    }
    
    
    @Override
    public String toString(){
        return horas+":"+minutos+":"+segundos;
    }
    
}
