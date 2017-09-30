
package proyecto_java_ii;
import java.util.Scanner;

/**
 *
 * @author Joel Corona
 */
public class Proyecto_Java_II {

   static float promedio(float[] array){
		float s=0, promedio;
		for(int i=0; i< 3; i++){
			s=s+array[i];
		}
		promedio=s/3;
		return promedio;
	} 
    public static void main(String[] args) {    
        
   
        //Programa principal
        Scanner sc = new Scanner(System.in);
        estudiantes[] lista = new estudiantes[3];
        float[] c = new float[3];
        
        for(int i=0; i<3; i++){
            System.out.println("Ingrese nombre, apellido y edad: ");
            lista[i]= new estudiantes(sc.next(),sc.next(),sc.nextInt());
           
            
            for(int j=0; j<3;j++){
                System.out.println("Ingrese la calificación del lapso "+(j+1)+": ");
                c[j]= sc.nextFloat();
            }
            lista[i].setNotas(c); 
            System.out.println("El promedio es: "+promedio(c));
        }
        
        
        
        
    }
     
}
