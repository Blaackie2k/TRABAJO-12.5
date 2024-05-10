import java.util.Scanner;

public class Casas {
    String poblacion;
    String direccion;
    String codigo;
    int id = 0;
    int numHabitacion;
    int precio;
    boolean esAlta = false;

    Scanner scanner = new Scanner(System.in);
        //Constructor
        public Casas(String poblacion, String direccion, String codigo, int numHabitacion, int precio){
            this.poblacion = poblacion;
            this.direccion = direccion;
            this.codigo = codigo;
            this.numHabitacion = numHabitacion;
            this.precio = precio;
        }

        public void cargar(){
            System.out.println("Ingrese el codigo de la casa (5 Caracteres[A modo de prueba yo uso 1])");
            codigo = scanner.nextLine();
            System.out.println("Ingrese la poblacion de la casa");
            poblacion = scanner.nextLine();
            System.out.println("Ingrese la direccion de la casa");
            direccion = scanner.nextLine();
            System.out.println("Ingrese el numero de la habitacion");
            numHabitacion = scanner.nextInt();
            System.out.println("Ingrese el precio de la casa");
            precio = scanner.nextInt();
            esAlta = true;
            id = id + 1;
        }

        public String elcodigo(){
            return codigo;
        }

        public void mostrar(){
            System.out.println("Codigo de la casa: " + codigo);
            System.out.println("Poblacion: " + poblacion);
            System.out.println("Direccion: " + direccion);
            System.out.println("Numero de la habitacion" + numHabitacion);
            System.out.println("Precio:"+ precio);
            System.out.println("ID:"+ id);
            System.out.println("Estado : "+ esAlta);
        }

        public void eliminar (String codigo){
            if (this.codigo == codigo){
            this.esAlta = false;
            }else {
              System.out.println("no se encontro la casa");
            }
          }
        }
