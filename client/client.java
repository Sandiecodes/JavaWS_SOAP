package client;
import client.HelloWorld;
import client.HelloWorldImplService;
 
public class client {
 

    public static void main(String[] args) {
       
        HelloWorldImplService helloWorldService = new HelloWorldImplService();
        HelloWorld getHelloWorldString = helloWorldService.getHelloWorldImplPort();
        System.out.println(getHelloWorldString.getHelloWorldString("Sandra"));
    }
}
