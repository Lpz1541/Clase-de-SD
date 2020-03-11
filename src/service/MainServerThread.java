/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Juan Diego
 */
public class MainServerThread {

    public static void main(String[] args)throws  IOException{
        
       System.out.println("server Runing ..");
       ServerSocket ss = new ServerSocket(1234);
       int idClient = 0;
        while (true) {
           System.out.println("server waiting ..");
           Socket s= new Socket ();
           
            s= ss.accept();
            ServerThread ServerThread = new ServerThread(s, idClient);
            ServerThread.start();
            idClient ++;
        }
    }
    
}
