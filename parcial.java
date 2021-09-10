import java.util.regex.Matcher;
import java.util.regex.Pattern;


class parcial {

    
    public static void main(String[] args) {
        String patron = ("(<li>|<ul>|<a)|(</li>|</ul>|/a>)|(\"[^\"]*\")|(>.*?<)|([a-z,A-Z,0-9]+)|([>|<|=]+)");
        
        String Texto= "<ul> <li> <a href = \"page1.html\" >other page</a> </li> <li> <a href = \"page2.html\">One More</a> </li> <li> <a href = \"page3.html\">About me</a> </li> </ul>";
        
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(Texto);
        
        System.out.println("Ejercicio 2 de Parcial1");
        while (matcher.find())
        {
            String tokenTipo1 = matcher.group(1);
            if(tokenTipo1 != null)
            {
                System.out.println("Etiqueta de apertura: "+tokenTipo1);
            }
            
            String tokenTipo2 = matcher.group(2);
            if(tokenTipo2 != null)
            {
                System.out.println("Etiqueta de cierre: "+tokenTipo2);
            } 

            String tokenTipo3 = matcher.group(3);
            if(tokenTipo3 != null)
            {
                System.out.println("Referencia: "+tokenTipo3);
            }

            String tokenTipo4 = matcher.group(4);
            if(tokenTipo4 != null)
            {
                System.out.println("Cadena de texto: "+tokenTipo4);
            }

            String tokenTipo5 = matcher.group(5);
            if(tokenTipo5 != null)
            {
                System.out.println("Variable: "+tokenTipo5);
            }
            

            String tokenTipo6 = matcher.group(6);
            if(tokenTipo6 != null)
            {
                System.out.println("Operador: "+tokenTipo6);
            }
            
        }
        
    }
    
}
