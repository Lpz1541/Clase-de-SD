
package service;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Client extends Connection {
    public Client() throws IOException{
        super("Client");
    }
public void OnCliente (String Client){
    System.out.println(Client+" runing....");
    try {
        outputServer = new DataOutputStream(s.getOutputStream());
       System.out.println("Client> sending data to server ");
      for (int i = 0; i < 5; i++) {
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
