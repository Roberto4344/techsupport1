import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> respuesta;
    private int index;
    Random r = new Random();
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuesta=new ArrayList<String>();
        respuesta.add("si");
        respuesta.add("no");
        respuesta.add("tal vez");
        respuesta.add("ni idea");
        respuesta.add("exactamente");
        respuesta.add("tiralo ganas dinero");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int num= r.nextInt(respuesta.size());
        String answer = respuesta.get(num);
        return answer;
    }
}
