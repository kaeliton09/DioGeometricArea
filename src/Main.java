import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int option = 0;
        boolean isRunning = true;
        do{
            System.out.println("escolha a forma que deseja calcular a area ");
            System.out.println("1 - quadrado ");
            System.out.println("2 - retangulo");
            System.out.println("3 - circulo");
            System.out.println("4 - sair do programa");
            option = scanner.nextInt();
            switch (option){
                case 1 ->{
                    double side;
                    do {
                        System.out.print("digite o tamanho do lado do quadrado (o lado tem que ser positivo): ");
                        side = scanner.nextDouble();
                    } while(side < 0);
                    var square = new Square(side);
                    System.out.printf("area do quadrado com lado %s eh: %s\n", side, square.getArea());
                }
                case 2 ->{
                    double height;
                    double base;
                    do {
                        System.out.print("digite o tamanho da altura do retangulo (a altura tem que ser positiva): ");
                        height = scanner.nextDouble();
                    } while(height < 0);
                    do {
                        System.out.print("digite o tamanho da base do retangulo (a altura tem que ser positiva): ");
                        base = scanner.nextDouble();
                    } while(base < 0);
                    var rectangle = new Rectangle(height, base);
                    System.out.printf("area do retangulo com altura %s e com base %s eh: %S\n", rectangle.height(), rectangle.base(), rectangle.getArea());
                }
                case 3 ->{
                    double radius;
                    do{
                        System.out.print("digite o tamanho do raio do circulo (o raio tem que ser positivo): ");
                        radius = scanner.nextDouble();
                    } while (radius < 0);
                    var circle = new Circle(radius);
                    System.out.printf("a area do circulo com raio %s eh: %s\n", circle.radius(), circle.getArea());
                }
                case 4 ->{
                    isRunning = false;
                    break;
                }
                default -> {
                    System.out.println("opcao invalida digite uma opcao valida!");
                    break;
                }
            }
        } while (isRunning);
    }
}