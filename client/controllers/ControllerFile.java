package controllers;

import controllers.Threads.ClockThread;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raziel
 */
public class ControllerFile {
    
    String route;
    ArrayList<Integer> list;
    
    
    public void readFile(){
        File file = new File(route);
        list = new ArrayList<Integer>();
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr); 
            
            String line = null;
            while((line = br.readLine())!=null){
            list.add(Integer.parseInt(line));
            }
            br.close();
        }catch(Exception ex){
            Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    
    
    
}
