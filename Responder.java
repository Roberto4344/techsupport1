import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

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
    HashMap <String, String> contestacion;
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
        contestacion = new HashMap<>();
        contestacion.put("hola","Hola , buenas cuentanos tu problema");
        contestacion.put("lento","El sistema requiere de 8Gb de memoria ram y un pz ,si cumple estos requrocesador de 3.5Ghisitos escriba cumplo");
        contestacion.put("cumplo","Siendo este el caso pruebe a reiniciar, una vez realizado si su problema persiste pongase en contacto de nuevo y comente reinicio");
        contestacion.put("reinicio","Puesto que su problema persiste es debido a que algun resgisto se ha perdido por el camino , para ello entre en opciones y ejecute el depurador de direcciones si su problema persiste ejecute su antivirus");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {        
        String answer;
        if(contestacion.containsKey(userInput)==true){
            answer = contestacion.get(userInput);
        }
        else{
            int num = r.nextInt(respuesta.size());
           answer = respuesta.get(num);
        }

        return answer;
    }
}
