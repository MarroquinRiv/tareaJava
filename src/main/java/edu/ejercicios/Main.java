package funciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculos calculadora = new calculos();

        System.out.println("Bienvenido a la calculadora de figuras geométricas.");

        int opcion;
        do {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Calcular el área de un triángulo.");
            System.out.println("2. Calcular el volumen de un prisma rectangular.");
            System.out.println("3. Calcular el área de un paralelogramo.");
            System.out.println("4. Calcular el volumen de un cilindro.");
            System.out.println("5. Calcular el área de una esfera.");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingresa la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    calculadora.aTriangulo(baseTriangulo, alturaTriangulo);
                    break;

                case 2:
                    System.out.println("Ingresa el área de la base del prisma:");
                    double areaBasePrisma = scanner.nextDouble();
                    System.out.println("Ingresa la altura del prisma:");
                    double alturaPrisma = scanner.nextDouble();
                    calculadora.vPrismaRectangular(areaBasePrisma, alturaPrisma);
                    break;

                case 3:
                    System.out.println("Ingresa la base del paralelogramo:");
                    double baseParalelogramo = scanner.nextDouble();
                    System.out.println("Ingresa la altura del paralelogramo:");
                    double alturaParalelogramo = scanner.nextDouble();
                    calculadora.aParalelogramo(baseParalelogramo, alturaParalelogramo);
                    break;

                case 4:
                    System.out.println("Ingresa el radio del cilindro:");
                    double radioCilindro = scanner.nextDouble();
                    System.out.println("Ingresa la altura del cilindro:");
                    double alturaCilindro = scanner.nextDouble();
                    calculadora.vCilindro(radioCilindro, alturaCilindro);
                    break;

                case 5:
                    System.out.println("Ingresa el radio de la esfera:");
                    double radioEsfera = scanner.nextDouble();
                    calculadora.aEsfera(radioEsfera);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}