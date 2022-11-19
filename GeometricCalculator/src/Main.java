import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника: ");
        int width = scanner.nextInt() ; //ширина прямоугольника

        System.out.println("Введите длину прямоугольника: ");
        int length = scanner.nextInt() ; //длина прямоугольника

        int sRectangle = width * length ; //умножить длину на ширину
        System.out.println("Площадь прямоугольника = " + sRectangle ); //вывести площадь прямоугольника

        System.out.println("Введите ширину параллелограмма: ");
        int widthParallelogram = scanner.nextInt() ;

        System.out.println("Введите высоту параллелограмма: ");
        int height = scanner.nextInt() ; // высота параллелограмма

        Parallelogram parallelogram = new Parallelogram(height,widthParallelogram);

        int sParallelogram = parallelogram.getArea(); //умножить ширину на высоту

        System.out.println("Площадь параллелограмма = " + sParallelogram ); // вывести площадь параллелограмма
    }
}