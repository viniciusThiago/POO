import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figuras = "A1 = Area Circulo \n"
                + "A2 = Volume Circulo \n"
                + "B1 = Area Retangulo \n"
                + "B2 = Volume Retangulo \n"
                + "C1 = Area Quadrado \n"
                + "C1 = Base Quadrado \n"
                + "Escolhar uma figura geométrica para cálculo: \n";

        System.out.print(figuras);
        String opcaoEscolhida = sc.next();

        switch (opcaoEscolhida.toUpperCase()) {
            case "A1":
                System.out.println("Area Circulo");
                System.out.println("Insira o raio do circulo: ");
                areaCirculo(sc);
                break;
            case "A2":
                System.out.println("Volume Circulo");
                System.out.println("Insira o raio do circulo: ");
                int raioCirculo = sc.nextInt();
                System.out.println("Insira a altura do circulo: ");
                int alturaCirculo = sc.nextInt();
                volumeCirculo(raioCirculo, alturaCirculo);
                break;
            case "B1":
                System.out.println("Area Retangulo");
                System.out.println("Insira a base do retangulo: ");
                int baseRetanguloArea = sc.nextInt();
                System.out.println("Insira a altura do retangulo: ");
                int alturaRetanguloArea = sc.nextInt();
                areaRetangulo(baseRetanguloArea, alturaRetanguloArea);
                break;
            case "B2":
                System.out.println("Volume Retangulo");
                System.out.println("Insira a base do retangulo: ");
                int baseRetanguloVolume = sc.nextInt();
                System.out.println("Insira a altura do retangulo: ");
                int alturaRetanguloVolume = sc.nextInt();
                areaRetangulo(baseRetanguloVolume, alturaRetanguloVolume);
                break;
            case "C1":
                System.out.println("Area Quadrado");
                System.out.println("Insira a medida do lado do quadrado: ");
                int ladoQuadradoArea = sc.nextInt();
                areaQuadrado(ladoQuadradoArea);
                break;
            case "C2":
                System.out.println("Volume Quadrado");
                System.out.println("Insira a medida do lado do quadrado: ");
                int ladoQuadradoVolume = sc.nextInt();
                volumeQuadrado(ladoQuadradoVolume);
                break;
        }

    }

    private static void volumeQuadrado(int lado) {
        int volume = (int) Math.pow(lado, 4);
        System.out.println("O volume do quadrado é: " + volume + "cm²");
    }

    private static void areaQuadrado(int lado) {
        int area = (int) Math.pow(lado, 2);
        System.out.println("A area do quadrado é: " + area + "cm²");
    }

    private static void areaCirculo(Scanner sc) {
        double raioCirculo = sc.nextDouble();
        double area = Math.PI* (raioCirculo * raioCirculo);
        double areaCirculo = Math.PI * (raioCirculo * raioCirculo);
        System.out.println("A area do circulo é: " + area + "cm²");
    }

    private static void volumeCirculo(int raio, int altura) {
        float volume = (raio * raio) * altura;
        System.out.println("A volume do circulo é: " + volume + "cm²");
    }

    private static void areaRetangulo (int base, int altura){
        float area = (Math.multiplyExact(base, altura));
        System.out.println("A area do retangulo é: " + area + "cm²");
    }

    private static void volumeRetangulo (int base, int altura){
        float area = (2*(Math.addExact(base,altura)));
        System.out.println("A area do retangulo é: " + area + "cm²");
    }
}
