public import java.util.regex.Matcher;
import java.util.regex.Pattern;


class parcial {

    
    public static void main(String[] args) {
        String patron = ("(<li>|<ul>|<a)|([a-zA-Z]+)|([>|<|=]+)|([0-9]+)|([(|)]+)|([{|}]+)|([(.html)]+)|((html)+)|([>a-zA-Z<]+)|(;)");
        
        String Texto= "<ul> <li> <a  href = page1 .html> ";
        
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(Texto);
        
        System.out.println("Guia 2 Compiladores");
        while (matcher.find())
        {
            String tokenTipo1 = matcher.group(1);
            if(tokenTipo1 != null)
            {
                System.out.println("Etiqueta de apertura: "+tokenTipo1);
            }
            
            String tokenTipo8 = matcher.group(8);
            if(tokenTipo8 != null)
            {
                System.out.println("Extension: "+tokenTipo8);
            }

            String tokenTipo2 = matcher.group(2);
            if(tokenTipo2 != null)
            {
                System.out.println("Variables: "+tokenTipo2);
            }
            
            String tokenTipo3 = matcher.group(3);
            if(tokenTipo3 != null)
            {
                System.out.println("Operador: "+tokenTipo3);
            }
            
            String tokenTipo4 = matcher.group(4);
            if(tokenTipo4 != null)
            {
                System.out.println("Numeros: "+tokenTipo4);
            }
            
            String tokenTipo5 = matcher.group(5);
            if(tokenTipo5 != null)
            {
                System.out.println("Parentesis: "+tokenTipo5);
            }
            
            String tokenTipo6 = matcher.group(6);
            if(tokenTipo6 != null)
            {
                System.out.println("Llaves: "+tokenTipo6);
            }
            
            String tokenTipo7 = matcher.group(7);
            if(tokenTipo7 != null)
            {
                System.out.println("Punto: "+tokenTipo7);
            }
            
            String tokenTipo9 = matcher.group(9);
            if(tokenTipo9 != null)
            {
                System.out.println("Extension: "+tokenTipo9);
            } 

            String tokenTipo10 = matcher.group(10);
            if(tokenTipo10 != null)
            {
                System.out.println("Punto y coma: "+tokenTipo10);
            }
             
        }
        
    }
    
}
