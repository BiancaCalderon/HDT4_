package UI;

import Controller.Calculadora;
import Controller.InfixToPostfix;
import Controller.ReadFromFile;
import Model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto de fábrica de pilas usando el patrón Factory
        StackFactory Factory = new StackFactory();
        Calculadora calculadora = Calculadora.getInstance();

        // Pedir al usuario que seleccione el tipo de pila a utilizar
        System.out.println("Seleccione el tipo de pila a utilizar: ");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");

        AbstractStack<Integer> stack = null;
        String op = scanner.nextLine();
        switch(op){
            case "1":
                Factory.createStack("ARRAY_LIST");
                break;
            case "2":
                Factory.createStack("VECTOR");
                break;

            case "3":
                System.out.println("Seleccione la implementación de lista a utilizar: ");
                System.out.println("1. Simplemente encadenada");
                System.out.println("2. Doblemente encadenada");

                int opcionLista = scanner.nextInt();
                // Crear una lista utilizando la opción del usuario
                List<Integer> lista = null;
                if (opcionLista == 1) {
                    stack = Factory.createStack("SINGLE_LIST");
                } else if (opcionLista == 2) {
                    stack = Factory.createStack("DOUBLE_LIST");
                }

        // Leer la expresión infix del archivo de texto "datos.txt"
        String expresionInfix =  ReadFromFile.read();


        // Convertir la expresión infix a postfix utilizando la calculadora
        String expresionPostfix = InfixToPostfix.infixToPostfix(expresionInfix);

        // Evaluar la expresión postfix utilizando la calculadora
        int resultado = calculadora.solve(expresionPostfix, stack);

        // Imprimir el resultado
        System.out.println("El resultado de la expresión es: " + resultado);
    }
    }
    }
