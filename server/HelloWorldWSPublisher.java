package server;

import javax.xml.ws.Endpoint;
public class HelloWorldWSPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/WS/HelloWorld",new HelloWorldImpl());
        System.err.println("Server is up");

    }
    
}
