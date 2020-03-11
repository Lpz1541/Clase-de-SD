/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


/**
 *
 * @author Juan Diego
 */
public class ServerThread extends Thread {
    private String message;
    private Socket s;
    private  int idCliente;
      
    
    
    public ServerThread(Socket s, int idClient){
    this.s= this.s;
    this.idCliente = idClient;
    }
    @Override
         public void run(){
             try {
                 BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                 int suma = 0 ;
                 if(idCliente ==3){
                     for(int i=0; i<10000000; i++){
                         suma ++;
                     }
                 }
                 while ((message = input.readLine()) !=null){
                      System.out.println("Client >"+message);
                 }
                 s.close();
                     
                    } catch (IOException e) {
        System.out.println("Server >"+e.getMessage());
             
             
             
         }
    }
}

