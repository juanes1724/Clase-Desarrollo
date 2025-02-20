package Taller;
public class Calculadora{
   
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    
    System.out.println("Suma: " + sumar(num1, num2));
    System.out.println("Resta: " + restar(num1, num2));
    System.out.println("Multiplicación: " + multiplicar(num1, num2));
    if (num2 == 0) {
        System.out.println("Error: División por 0");
    } else {
        System.out.println("División: " + dividir(num1, num2));
    }

 }
}