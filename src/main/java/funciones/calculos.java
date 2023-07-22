package funciones;

public class calculos {
    public void aTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public void vPrismaRectangular(double area_base, double altura) {
        double volumen = area_base * altura;
        System.out.println("El volumen del prisma rectangular es: " + volumen);
    }

    public void aParalelogramo(double base, double altura) {
        double area = base * altura;
        System.out.println("El área del paralelogramo es: " + area);
    }

    public void vCilindro(double radio, double altura) {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public void aEsfera (double radio) {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la esfera es: " + area);
    }
}
