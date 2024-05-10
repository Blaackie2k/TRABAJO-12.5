public class Tablin {
        int numElementos;
        int tam = 3;
        double factorCarga;
        Casas[] tabla;

        public Tablin(){ //Inicializa
            tabla = new Casas[tam];
                for(int i=0; i<tam; i++){
                    tabla[i] = null;
                    numElementos = 0;
                    factorCarga = 0;
                }
        }

         public int ubicacion(String codigo){
            int i = 0 , p;
            long d;
            d = Integer.parseInt(codigo);
            p = (int) (d % tam);
                while(tabla[p] != null && i<tam){
                    i++;
                    p = p + i*i;
                    p = p % tam;
        }
        return p;
    }

       public void insertar(Casas r){
            int posicion;
            posicion = ubicacion(r.elcodigo());
            tabla[posicion] = r;
            numElementos++;
            factorCarga = (double)(numElementos)/tam;
            if(factorCarga > 0.5){
                System.out.println("El factor de carga supero el 50%");
            }
       }

}




