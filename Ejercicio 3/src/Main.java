public class Main {

        //Primera parte del ejercicio 3
       public static void main(String[] args) {
           suma(15, 12, -35 );
           Coche miCoche = new Coche ();
           miCoche.IncrementarPuerta();
           miCoche.IncrementarPuerta();
           miCoche.IncrementarPuerta();
           miCoche.IncrementarPuerta();

           System.out.print(miCoche.Puertas);
       }
       public static void suma(int a, int b, int c) {
           int resultado;
           resultado = a+b+c;
           System.out.println (resultado);
       }
}

class Coche {
    public int Puertas =2;
    public void IncrementarPuerta(){
        this.Puertas ++;
    }
}