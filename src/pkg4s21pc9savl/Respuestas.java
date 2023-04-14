
package pkg4s21pc9savl;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "Buenos Aires","Ciudad de México","Lima","Quito","TESOEM"
    };
    
    String[] radioR = {
        "Buenos Aires,Ciudad de México,Lima,Quito",
        "Buenos Aires,Ciudad de México,Lima,Quito",
        "Buenos Aires,Ciudad de México,Lima,Quito",
        "Buenos Aires,Ciudad de México,Lima,Quito",
        "TEcM,TESSI,TESCHI,TESOEM"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
