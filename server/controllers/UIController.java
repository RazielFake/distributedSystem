package controllers;

import controllers.serverThread.Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Raziel
 */
public class UIController extends Thread{
    
    private JTextArea textArea;
    private int PORT = 5555;
    
    public UIController(JTextArea textArea){
        this.textArea = textArea;
    }
    
    @Override
    public void run(){
        Socket service = null;
        try {
            ServerSocket server = new ServerSocket(PORT);
            textArea.append("Waiting inputs on port " + PORT);
            while(true){
                //WHEN THE CONNECTION IS ACCEPTED... 
		service = server.accept();
                //AN OBJECT IS CREATED TO RECIEVE USER MSG
		DataInputStream dis = new DataInputStream(service.getInputStream()); 
                //OBJECT TO SEND ANSWERS TO CLIENT
		OutputStream os = service.getOutputStream(); 
		DataOutputStream dos = new DataOutputStream(os); 
                   
                //WE INITIATE THE SERVER THREAD
		Server srv = new Server(service ,dis ,dos, textArea);  
                srv.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(UIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
