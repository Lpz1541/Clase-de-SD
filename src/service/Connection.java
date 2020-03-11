
package service;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {
  private final int PORT= 4000;
  private final String HOST = "localhost";
  
  protected ServerSocket ss;
  protected Socket s;
  
  protected DataOutputStream outputServer, outputClient;
  protected String message;

    public Connection(String type) throws IOException {
        if(type.equalsIgnoreCase("server")){
            ss = new ServerSocket(PORT);
            s = new Socket();
              }
        else{
            s = new Socket (HOST, PORT);
        }
}
}

   