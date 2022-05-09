package sample;

import java.util.ArrayList;
import java.util.List;

public class Traductor {

    private String linea;

    public Traductor(String linea){
        this.linea = linea;
    }

    List<String> remplazo = new ArrayList<String>();
    List<String> nuevo= new ArrayList<String>();

    String fina;

    public String Remplazar(){
        remplazo.add("#include <stdio.h>");
        nuevo.add(" ");
        remplazo.add("void main()");
        nuevo.add("'Main'");
        remplazo.add("{");
        nuevo.add("[");
        remplazo.add("}");
        nuevo.add("]");
        remplazo.add("/**");
        nuevo.add("$$$");
        remplazo.add("á");
        nuevo.add("a");
        remplazo.add("é");
        nuevo.add("e");
        remplazo.add("í");
        nuevo.add("i");
        remplazo.add("ó");
        nuevo.add("o");
        remplazo.add("ú");
        nuevo.add("i");
        remplazo.add("ñ");
        nuevo.add("niS");
        remplazo.add("**/");
        nuevo.add("###");
        remplazo.add("while");
        nuevo.add("mientras");
        remplazo.add("printf");
        nuevo.add("imprime");
        remplazo.add("print");
        nuevo.add("imprime");
        remplazo.add("int");
        nuevo.add("entero");
        remplazo.add("float");
        nuevo.add("flotante");
        remplazo.add("if");
        nuevo.add("SI");
        remplazo.add("else");
        nuevo.add("SINO");
        remplazo.add("&&");
        nuevo.add("Y");
        remplazo.add("||");
        nuevo.add("O");
        remplazo.add("==");
        nuevo.add("=");

        for (int i =0; i<remplazo.size();i++){
            fina=linea.replace(remplazo.get(i),nuevo.get(i));
            linea = fina;
        }

        return linea;
    }

}
