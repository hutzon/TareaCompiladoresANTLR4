import java.io.FileNotFoundException;
// import java.io.IOException;
import org.antlr.v4.runtime.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Ejemplo2 lexer = 
                    new Ejemplo2(CharStreams.fromFileName("pruebaejemplo2.txt"));
            
            /* manipulacion de errores */
            lexer.removeErrorListeners();
            lexer.addErrorListener(
                    DescriptiveErrorListener.INSTANCE);
            
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
