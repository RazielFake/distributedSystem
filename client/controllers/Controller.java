package controllers;


import controllers.Threads.ClockThread;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author Raziel
 */
public class Controller {
    private ClockThread CK1;
    
    private JLabel Clock1;
    
    public Controller(JLabel c1){
        this.Clock1 = c1;
    }
    
    public void iniciar(){
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        LocalDateTime locaDate = LocalDateTime.now();
        CK1 = new ClockThread(Clock1, locaDate.getHour(), locaDate.getMinute(), locaDate.getSecond());
        CK1.start();
    }
    
    
    public void modify(boolean modif, int... hour){
                if(modif){
                    CK1.pause();
                }else{
                    CK1.setHoras(hour[0]);
                    CK1.setMinutos(hour[1]);
                    CK1.setSegundos(hour[2]);
                    CK1.restart();
                }
    }
    
    @Override
    public String toString(){
        return CK1.toString();
    }
    
}
