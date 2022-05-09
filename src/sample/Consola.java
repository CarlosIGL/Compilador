package sample;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.OutputStream;

public class Consola extends OutputStream{

    private TextArea textArea;

    public Consola(TextArea textArea){
        this.textArea=textArea;
    }
    public void adjuntarTexto (String caracteres){
        Platform.runLater(() ->
                textArea.appendText(caracteres));
    }
    public void write (int b) throws IOException {
        adjuntarTexto(String.valueOf((char) b));
    }
}
