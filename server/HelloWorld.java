package server;

// Create an interface for Endpoint (server)

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    @WebMethod public String getHelloWorldString (String name);
}




