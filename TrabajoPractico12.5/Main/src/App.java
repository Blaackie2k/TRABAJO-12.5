import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int op = 0;
        String codigo;
        Scanner scanner = new Scanner(System.in);
         Casas CasaRural = new Casas(null, null, null, 0, 0);
         Tablin tablahash = new Tablin();
    
        System.out.println("Bienvenido al sistema Casas Rurales La alcarria");
            do{
            System.out.println("1. Ingresar datos de la casa");
            System.out.println("2. Eliminar datos");
            System.out.println("3. Mostrar datos de la casa");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            op = Integer.parseInt(System.console().readLine());
            switch(op){
                case 1:
                    System.out.println("Ingresar Datos");
                    CasaRural.cargar();
                    //tablahash.insertar(CasaRural);
                    
                break;
                case 2:
                    System.out.println("Eliminar datos");
                    System.out.println("INGRESE EL CODIGO DE LA CASA");
                    codigo = scanner.nextLine();
                    CasaRural.eliminar(codigo);
                break;
                case 3:
                    System.out.println("Mostrar datos de la casa");
                    CasaRural.mostrar();

                break;
                case 4:
                System.out.println("Saliendo del sistema");
                
                break;
                default:
                System.out.println("Opcion invalida, ingrese un valor entre 1 y 5");
                break;
            }
            } while (op <4);
    
}

}

