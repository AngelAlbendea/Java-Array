
package princpal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Contacto [] listadoContactos = new Contacto [50];
        Scanner lector = new Scanner (System.in);
        int opcion=0;
        int posicion=0;
    do{    
        do {
            System.out.println("1.- Crear contacto");
            System.out.println("2.- Imprimir lista contactos");
            System.out.println("3.- Salir");
            System.out.println("Indique la opción elegida: ");
            opcion = lector.nextInt();
                     lector.nextLine();
        } while (opcion < 1 || opcion > 3);
        switch (opcion){
            case 1:  {
                if(posicion<50){
                    System.out.println("Indique Nombre");
                    String nombre = lector.nextLine();
                    System.out.println("Indique teléfono");
                    String telefono = lector.nextLine();
                    System.out.println("Indique correo");
                    String correo = lector.nextLine();
                    
                    Contacto contacto = new Contacto(nombre,telefono,correo);
                    listadoContactos[posicion]=contacto;
                    posicion++;
                }else{
                    System.out.println("La lista está llena, pase por caja..");
                } 
                }
                break;
                
                case 2: {
                    if (posicion>0) {
                    for(int i = 0; i<posicion; i++){
                    System.out.println(listadoContactos[i].toString());    
                    }
   
                    }else{
                    System.out.println("No hay contactos");
            }
                
            }
   
        }
      }while(opcion>0 && opcion<3);
         
    }
}
