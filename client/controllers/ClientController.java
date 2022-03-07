package controllers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Raziel
 */
public class ClientController extends Thread{
    
    private ArrayList<Integer> list;
    private String IP = "127.0.0.1";
    private int PORT= 5555;
    private String hour;
    private boolean exe;

    
    @Override
    public void run(){
	Socket conect = null;
        try {
            conect = new Socket(IP, PORT);
            while(true){
                sleep(2000);
                if(exe){
                    ObjectOutputStream objectOutput = new ObjectOutputStream(conect.getOutputStream());
                    //SEND THE LIST
                    objectOutput.writeObject(list);
                    //SEND THE HOUR
                    System.out.println(hour);
                    DataOutputStream dos = new DataOutputStream(conect.getOutputStream());
                    dos.writeUTF(hour);
                    DataInputStream dis = new DataInputStream(conect.getInputStream());//
                }
                exe = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean isExe() {
        return exe;
    }

    public void setExe(boolean exe) {
        this.exe = exe;
    }
    
    
    
    
}
