
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class prueba {
    public static void main(String[] args) {
       
        String patron = ("(while|if|else|static|void|int|for)|(.length +)|([a-z,A-Z]+)|([-|>|<|=|+++]+)|([0-9]+)|([(|)]+)|([{|}]+)|([\\[|\\]]+)|(;)"); 
        String Texto= "static void burbuja (int arreglo[]) { for(int i = 0; i < arreglo.length - 1; i++) { for(int j = 0; j < arreglo.length - 1; j++) { if (arreglo[j] < arreglo[j + 1]) {int tmp = arreglo[j+1]; arreglo[j+1] = arreglo[j];arreglo[j] = tmp; } } }";
        
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(Texto);
        
        System.out.println("Ejercicio1 de parcial1");
        while (matcher.find())
        {
            String tokenTipo1 = matcher.group(1);
            if(tokenTipo1 != null)
            {
                System.out.println("Palabra reservada: "+tokenTipo1);
            }
            
            String tokenTipo2 = matcher.group(2);
            if(tokenTipo2 != null)
            {
                System.out.println("Propiedad: "+tokenTipo2);
            }
            
            String tokenTipo3 = matcher.group(3);
            if(tokenTipo3 != null)
            {
                System.out.println("Variables: "+tokenTipo3);
            }
            
            String tokenTipo4 = matcher.group(4);
            if(tokenTipo4 != null)
            {
                System.out.println("Operador: "+tokenTipo4);
            }
            
            String tokenTipo5 = matcher.group(5);
            if(tokenTipo5 != null)
            {
                System.out.println("Numeros: "+tokenTipo5);
            }
            
            String tokenTipo6 = matcher.group(6);
            if(tokenTipo6 != null)
            {
                System.out.println("Parentesis: "+ tokenTipo6);
            }
            
            String tokenTipo7 = matcher.group(7);
            if(tokenTipo7 != null)
            {
                System.out.println("Llaves: "+tokenTipo7);
            }
            
            String tokenTipo8 = matcher.group(8);
            if(tokenTipo8 != null)
            {
                System.out.println("Corchete: "+tokenTipo8);
            }  
                 
            String tokenTipo9 = matcher.group(9);
            if(tokenTipo9 != null)
            {
                System.out.println("Punto y coma: "+tokenTipo9);
            }       
            
             
        }
        
    }
    
}
