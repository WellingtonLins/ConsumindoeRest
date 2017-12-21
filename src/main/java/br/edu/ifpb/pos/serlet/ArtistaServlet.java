package br.edu.ifpb.pos.serlet;

import br.edu.ifpb.pos.model.Artista;
import br.edu.ifpb.pos.model.Art;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ArtistaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//    https://api.vagalume.com.br/rank.php&type=art&radio=coca-cola-fm&apikey=660a4395f992ff67786584e238f501aa  
        String uri = "https://api.vagalume.com.br";
        Client client = ClientBuilder.newClient();
        WebTarget root = client.target(uri).path("rank.php");

        WebTarget comments = root.queryParam("type", "art")
                .queryParam("radio", "coca-cola-fm")
                .queryParam("apikey", "660a4395f992ff67786584e238f501aa");
        Response resp = comments.request().get();
        String json = resp.readEntity(String.class);
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Art> lista = mapper.readValue(json, new TypeReference<List<Art>>(){
        });
        lista.forEach(c -> System.out.println(c.name()));


        
 
			System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>API</title>");
            out.println("</head>");
            out.println("<body>");
            for (Art art : lista) {
            out.println("<h3> " + art.name() + "   rank = "  +  art.rank() + "</h3>");            
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}
