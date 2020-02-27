/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.io.DataOutputStream;
import java.io.IOException;


public class Client extends Connection {
    public Client() throws IOException{
        super("client");
    }
public void OnCliente (){
    try {
        outputServer = new DataOutputStream(s.getOutputStream());
       System.out.println("Client> sending data to server ");
        for (int i = 0; i < 2; i++) {
        outputServer.writeUTF("Este es el mensaje del cliente Juan diego numero "+(i+1)+"\n");
        }
          System.out.println("Client> Data sent... ");
         
        s.close();
         System.out.println("Client> Stop... ");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    
    }
}
   
}
