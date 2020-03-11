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

public void onServer() throws ClassNotFoundException, IOException{
   System.out.println("Server> runing ...");
   s = ss.accept();
    try
    { System.out.println(" Server >Waiting ...");
        s = ss.accept();
    System.out.println("Server > online ...");
    
    // outputClient = new DataOutputStream(s.getOutputStream());
    //outputClient.writeUTF("Petiton Recevied");
    
    BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
    while((message = input.readLine())!=null){
        System.out.println("Client >"+message);
    }
     System.out.println("Server > Client offline...");
     
        
    } catch (IOException e) {
        ss.close();
        System.out.println("Server >"+e.getMessage());
        
        
       }
}
}