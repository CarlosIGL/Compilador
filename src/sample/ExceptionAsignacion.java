package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionAsignacion extends RuntimeException{

        public ExceptionAsignacion(String s) {
            System.out.println(s);
        }
    }
