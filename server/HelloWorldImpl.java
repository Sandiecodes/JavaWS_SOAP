package server;
import javax.jws.WebService;

@WebService(endpointInterface="server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    public String getHelloWorldString(String name) {
        return "Welcome to JAX-WS " + name;
    }
    
}
