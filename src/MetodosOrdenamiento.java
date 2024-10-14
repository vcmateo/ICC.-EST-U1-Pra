import java.util.Arrays;

public class MetodosOrdenamiento {
    public int[] burbujaNormal(int[] arreglo, boolean ascendente, boolean logs) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    if (logs) {
                        System.out.println("Iteración " + (i + 1) + ": " + Arrays.toString(arreglo));
                    }
                }
            }
        }
        return arreglo;
    }

    public int[] seleccion(int[] arreglo, boolean ascendente, boolean logs) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascendente && arreglo[j] < arreglo[indice]) || (!ascendente && arreglo[j] > arreglo[indice])) {
                    indice = j;
                }
            }
            int temp = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = temp;
            if (logs) {
                System.out.println("Iteración " + (i + 1) + ": " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }

    public int[] insercion(int[] arreglo, boolean ascendente, boolean logs) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && arreglo[j] > actual) || (!ascendente && arreglo[j] < actual))) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
            if (logs) {
                System.out.println("Iteración " + i + ": " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }

    public int[] burbujaConAjuste(int[] arreglo, boolean ascendente, boolean logs) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                    if (logs) {
                        System.out.println("Iteración " + (i + 1) + ": " + Arrays.toString(arreglo));
                    }
                }
            }
            if (!intercambio) break; 
        }
        return arreglo;
    }
}
