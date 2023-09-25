package py.edu.ucom;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/jhony")
    public HashMap<String, Object> test() {

        return data();
    }

    public String obtenerNombre() {
        return "Jhony";
    }

    public HashMap<String, Object> data() {
        HashMap<String, Object> data = new HashMap<>();
        String[] inicial = "jhony benitez jhony alfredo benitez martinez".split("\\s+");
        System.out.println(inicial + ": \n");

        for (int i = 0; i < inicial.length; i++) {
            String elemento = inicial[i];
            if (!data.containsKey(elemento)) {
                data.put(elemento, 1);
            } else {
                Integer cantidadActual = (Integer) data.get(elemento);
                data.put(elemento, cantidadActual + 1);
            }
        }

        for (Map.Entry<String, Object> entrada : data.entrySet()) {
            String clave = entrada.getKey();
            Integer valor = (Integer) entrada.getValue();
            LOG.info(clave + ": " + valor);
        }
        return data;
    }
}
