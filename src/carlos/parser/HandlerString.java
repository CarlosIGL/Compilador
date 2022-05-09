package carlos.parser;

public class HandlerString {


    private String cadena; 

    public HandlerString (String cadena){
        this.cadena = cadena;
    }

    public String quitarComillas(){
        char temp [] = cadena.toCharArray(); //**Convertir la cadena en un array */
        String resultado = "";
        for(int i = 1; i < cadena.length()-1 ; i++){
            resultado = resultado + String.valueOf(temp[i]);
        }
        return resultado;
    }
}