package proyecto_java_ii;

/**
 *
 * @author Joel Corona
 */
public class estudiantes {
    //Atributos de estudiante
    private String nombre;
    private String apellido;
    private int edad;
    private float[] notas;
  //Constructor por defecto de estudiante
/**
 * @param nombre: Nombre del estudiante 
 * @param apellido: Apellido del estudiante
 * @param edad: Edad del estudiante
 * @param notas: Es un vector tipo float que contiene las tres (3) notas de los estudiantes
 ***/
public estudiantes(){
    nombre="";
    apellido="";
    edad=0;
    for(int i=0; i< 3; i++){
  	notas[i]=0;
    }
}

public estudiantes(String nombre, String apellido, int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    
}
/**Métodos obtener
 ** @method getNombre: <b>FUNCION</b> Devuelve el nombre del estudiante
 ** @method getApellido: <b>FUNCION</b> Devuelve el apellido del estudiante
 ** @method getEdad: <b>FUNCION</b> Devuelve la edad del estudiante
 ** @method getNotas: <b>PROCEDIMIENTO</b> Muestra por pantalla las notas
 */ 
public String getNombre(){
return (nombre);}
public String getApellido(){
return (apellido);}
public int getEdad(){
return (edad);
}
public void getNotas(){
for(int i=0; i<3; i++){
    System.out.println("Calificación del lapso "+(i+1)+": "+notas[i]);}
}
/**Metodos de set
 ** @method setNombre: modifica el nombre del estudiante 
 ** @method setApellido: modifica el apellido del estudiante 
 ** @method setEdad: modifica la edad del estudiante
 ** @method setNotas: modifica las notas del estudiante 
 ** @method setNotas: modifica cada nota del estudiante por sus respectivos parametros
 ** @param nota1, nota2, nota3.
 */
    public void setNombre(String nombre){
        this.nombre=nombre;}
    public void setApellido(String apellido){
        this.apellido=apellido;}
    public void setEdad(int edad){
        this.edad=edad;}
    public void setNotas(int nota1, int nota2, int nota3){
  	notas[0]=nota1;
        notas[1]=nota2;
  	notas[2]=nota3;
  	}
    public void setNotas(float[] c){
        notas= new float[3];
  	for(int i=0; i<3; i++){
  	  notas[i]=c[i];
  		}
  	}



}