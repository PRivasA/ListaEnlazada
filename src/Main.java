import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        while (true) {
            System.out.println("\nLista enlazada");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Borrar un elemento");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar al inicio: ");
                    int inicio = scanner.nextInt();
                    lista.insertarInicio(inicio);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a insertar al final: ");
                    int fin = scanner.nextInt();
                    lista.insertarFinal(fin);
                    break;
                case 3:
                    System.out.print("La lista es: ");
                    lista.mostrarLista();
                    break;
                case 4:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int buscar = scanner.nextInt();
                    if (lista.encontrar(buscar) != null) {
                        System.out.println("El elemento " + buscar + " está en la lista.");
                    } else {
                        System.out.println("El elemento " + buscar + " no está en la lista.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el elemento a borrar: ");
                    int borrar = scanner.nextInt();
                    if (lista.eliminar(borrar)) {
                        System.out.println("El elemento " + borrar + " ha sido borrado.");
                    } else {
                        System.out.println("El elemento " + borrar + " no se encontró en la lista.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
