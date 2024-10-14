import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        
        System.out.println("Ingrese el tamaño de su arreglo:");
        int tamano = scanner.nextInt();
        int[] arreglo = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor para la posición " + (i + 1) + ":");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.println("Escoja un método de ordenamiento:");
        System.out.println("1. Burbuja Normal");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("4. Burbuja con Ajuste");
        int metodo = scanner.nextInt();
        System.out.println("Escoja si quiere ordenar ascendente 1 o descendente 2:");
        int orden = scanner.nextInt();
        boolean ascendente = orden == 1;
        System.out.println("Quiere ver cada paso? 1.Sí 2.No:");
        int verLogs = scanner.nextInt();
        boolean mostrarPasos = verLogs == 1;
        switch(metodo) {
            case 1:
                arreglo = metodos.burbujaNormal(arreglo, ascendente, mostrarPasos);
                break;
            case 2:
                arreglo = metodos.seleccion(arreglo, ascendente, mostrarPasos);
                break;
            case 3:
                arreglo = metodos.insercion(arreglo, ascendente, mostrarPasos);
                break;
            case 4:
                arreglo = metodos.burbujaConAjuste(arreglo, ascendente, mostrarPasos);
                break;
            default:
                System.out.println("Método inválido.");
        }
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
        scanner.close();
    }
}