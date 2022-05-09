package sample;

import carlos.parser.SaludosLexer;
import carlos.parser.SaludosParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;

public class Controller {

    @FXML
    private TextArea textArea_1;

    @FXML
    private TextArea textArea_2;

    @FXML
    private Button boton_1;

    @FXML
    private MenuItem menu_item;

    @FXML
    private Button btnLimpiar;

    private PrintStream flujo;


    @FXML
    private Button btnTraducir;

    @FXML
    private Button btnTraducirC;

    @FXML
    void display_3(ActionEvent event) {
        textArea_2.setText(" ");
        textArea_1.setText("");
    }
    public void initialize(){
        flujo = new PrintStream(new Consola(textArea_2));
    }

    @FXML
    void display(ActionEvent event) throws Exception {
        textArea_2.setText(" ");
        System.setOut(flujo);
        String text = textArea_1.getText();
        CharStream input = CharStreams.fromString(text);
        SaludosLexer lexico = new SaludosLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        SaludosParser sintactico = new SaludosParser(tokens);
        ParseTree arbol = sintactico.imprimir();
        MyVisitor visita= new MyVisitor();
        visita.visit(arbol);
    }
    static String nombre_archivo;
    static String texto = "";


    @FXML
    void display_2(ActionEvent event) {
        FileChooser abrir = new FileChooser();
        abrir.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("txtfile", "*.txt")

        );
        textArea_1.setText(" ");
        textArea_2.setText(" ");
        abrir.setTitle("Abrir Archivo");

        nombre_archivo = abrir.showOpenDialog(new Stage()).getPath();
        try{
            FileReader f = new FileReader(nombre_archivo);
            BufferedReader b = new BufferedReader(f);
            String linea;
            ArrayList<String> lista = new ArrayList<String>();
            while( (linea = b.readLine()) != null){
                lista.add(linea);
            }
            for (String a : lista){
                textArea_1.appendText(a+"\n");
            }
        }catch(IOException e){
            System.err.println("Error");
            e.printStackTrace();
        }
    }

    @FXML
    void display_4(ActionEvent event) {
        try {
            try {
                PrintWriter bw = new PrintWriter(new FileWriter("C:\\HOLA\\traductor.txt"));
                bw.write("");
                bw.close();
            }
            catch (IOException e){
                System.out.println("ERROR");
            }
            String text = textArea_1.getText();
            CharStream input = CharStreams.fromString(text);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\HOLA\\traductor.txt",true));
            bw.write(input.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch (IOException e){
            System.out.println("ERROR");
        }
        textArea_1.setText(" ");
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\HOLA\\traductor.txt"));
            String linea;

            ArrayList <String> lista = new ArrayList<String>();
            while( (linea = br.readLine()) != null){
                Traductor hola = new Traductor(linea);
                linea = hola.Remplazar();
                lista.add(linea);
            }
            for (String a : lista){
                textArea_1.appendText(a+ "\n");
            }
        }
        catch (IOException e){
            System.out.println("ERROR");
        }
    }

    @FXML
    void display_5(ActionEvent event) {
        try {
            try {
                PrintWriter bw = new PrintWriter(new FileWriter("C:\\HOLA\\traductorC.txt"));
                bw.write("");
                bw.close();
            }
            catch (IOException e){
                System.out.println("ERROR");
            }
            String text = textArea_1.getText();
            CharStream input = CharStreams.fromString(text);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\HOLA\\traductorC.txt",true));
            bw.write(input.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch (IOException e){
            System.out.println("ERROR");
        }
        textArea_1.setText(" ");
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\HOLA\\traductorC.txt"));
            String linea;

            ArrayList <String> lista = new ArrayList<String>();
            lista.add("#include <stdio.h>");
            while( (linea = br.readLine()) != null){
                TraductoraC hola = new TraductoraC(linea);
                linea = hola.Remplazar();
                lista.add(linea);
            }
            for (String a : lista){
                textArea_1.appendText(a+ "\n");
            }
        }
        catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
