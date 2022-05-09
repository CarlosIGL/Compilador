package sample;

import java.util.ArrayList;
import java.util.List;

public class TraductoraC {
    private String linea;

    public TraductoraC(String linea){
        this.linea = linea;
    }

    List<String> remplazo = new ArrayList<String>();
    List<String> nuevo= new ArrayList<String>();

    String fina;

    public String Remplazar(){
        remplazo.add(",");
        nuevo.add(".");
        remplazo.add("void main()");
        nuevo.add("'Main'");
        remplazo.add("{");
        nuevo.add("[");
        remplazo.add("}");
        nuevo.add("]");
        remplazo.add("while");
        nuevo.add("mientras");
        remplazo.add("printf");
        nuevo.add("imprime");
        remplazo.add("print");
        nuevo.add("imprime");
        remplazo.add("else");
        nuevo.add("SINO");
        remplazo.add("int");
        nuevo.add("entero");
        remplazo.add("float");
        nuevo.add("flotante");
        remplazo.add("if");
        nuevo.add("SI");
        remplazo.add("&&");
        nuevo.add("Y");
        remplazo.add("||");
        nuevo.add("O");
        remplazo.add("==");
        nuevo.add("=");

        for (int i =0; i<remplazo.size();i++){
            fina=linea.replace(nuevo.get(i),remplazo.get(i));
            linea = fina;
        }

        return linea;
    }
}
