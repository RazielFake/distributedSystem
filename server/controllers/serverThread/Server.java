package controllers.serverThread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Raziel
 */
public class Server extends Thread{
    
    private Socket service = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;
    private JTextArea textArea;
    private ArrayList<Integer> list;
    
    public Server(Socket service,DataInputStream dis,DataOutputStream dos, JTextArea jTa){  
		this.service = service;
		this.dis = dis;
		this.dos = dos;
                this.textArea = jTa;
	}
    
    @Override
    public void run(){
        
        //PRINT THE IP ON THE TEXTAREA
        textArea.append("\nNew connection accepted from "+service.getInetAddress());
        try {
            ObjectInputStream ois = new ObjectInputStream(service.getInputStream());
            //RECIEVE THE LIST WITH THE NUMBERS
            list = (ArrayList) ois.readObject();
            //RECIBIMOS LA HORA
            String hour = dis.readUTF();
            
            //SENDING ACK
            dos.writeUTF("ACK");
            
            textArea.append("\nHour: "+hour+". Sum: "+Sum());
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int Sum(){
            int R=0;
            for(int n=0;n<list.size();n++){
                R+=list.get(n);
            }
            return R;
    }
}
