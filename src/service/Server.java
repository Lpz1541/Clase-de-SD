/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Diego
 */
public class Server extends Connection {
    
    public Server()throws IOException{
        super("server");
    }

public void onServer(){
    System.out.println("Server runing ...");
    try {s = ss.accept();
    System.out.println("Client online ...");
    
    outputClient = new DataOutputStream(s.getOutputStream());
    outputClient.writeUTF("Petiton Recevied");
    
    BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
    while((message = input.readLine())!=null){
        System.out.println("message");
    }
     System.out.println("Client offline...");
     ss.close();
     System.out.println("Server stop...");
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
        
        
    }
    
    
}


 
    }
    

