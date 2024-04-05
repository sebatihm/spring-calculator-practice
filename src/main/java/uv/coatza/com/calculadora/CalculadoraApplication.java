package uv.coatza.com.calculadora;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uv.coatza.com.calculadora.model.Calculator;

@SpringBootApplication
// Incluir en clase principal: … implements CommandLineRuner y sobreescribir el método run()
public class CalculadoraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@Override
	public void run(String... args){
		// Ingresar nuestra primera instrucción, enviar mensaje:
		System.out.println("Hola");

		Scanner scan = new Scanner(System.in);

		System.out.println("================== Basic Operations ==================");
		System.out.println("1) Sum");
		System.out.println("2) Subs");
		System.out.println("3) Multi");
		System.out.print("Choice: ");
		int choice = scan.nextInt();

		System.out.println("Processing ........");
		System.out.print("Input the first number: ");
		int number1 = scan.nextInt();
		System.out.print("Input the second number: ");
		int number2 = scan.nextInt();
		
		System.out.print("The result of the operation is: ");
		switch (choice) {
			case 1:
				System.out.println(Calculator.Sum(number1,number2));
				break;
			case 2:
				System.out.println(Calculator.Subs(number1,number2));
				break;

			case 3:
				System.out.println(Calculator.Multi(number1,number2));
				break;
		
			default:
				System.out.println("¡ The program has stopped inexpectedly !\nYou have put an invalid option");
				break;
		}

		scan.close();

		
		
	}

}
