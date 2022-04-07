import java.io.*;
import org.antlr.v4.runtime.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Ejemplo1 lexer = 
                    new Ejemplo1(CharStreams.fromFileName("pruebaejemplo1.txt"));
            
            CommonToken token = (CommonToken)lexer.nextToken();
            System.out.printf("Lexema: %s, Token:  %d\n", 
                    token.getText(), token.getType());
            
            while (token.getType() != Token.EOF)
            {
                token = (CommonToken)lexer.nextToken();
                System.out.printf("Lexema: %s, Token:  %d\n", 
                        token.getText(), token.getType());
            }

            System.out.println("\nAnalisis lexico terminado!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado! " 
                    + e.getMessage().toString());            
        }
    }
}
