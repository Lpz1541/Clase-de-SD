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
        outputServer.writeUTF("This is message the server a client");
        s.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    
    }
}
   
}
