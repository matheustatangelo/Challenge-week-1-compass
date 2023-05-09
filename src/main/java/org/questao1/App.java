package org.questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int n = input.nextInt();
        Employee[] employees = new Employee[n]; // Array para armazenar objetos de funcionários

        for (int i = 0; i < n; i++) { // Loop para preencher o array de objetos
            System.out.println("\nDigite os dados do funcionário #" + (i+1) + ":");
            System.out.print("Nome: ");
            String name = input.next();
            System.out.print("Salário: R$ ");
            double salary = input.nextDouble();

            employees[i] = new Employee(name, salary); // Instanciação de um objeto
            employees[i].calculateBonus(); // Chamada do método para calcular o Bônus e o Desconto
        }

        System.out.println("\nPAGAMENTOS:");
        for (Employee e : employees) { // Loop para exibir os detalhes do salário
            e.displaySalary();
        }

        input.close(); // Fechar o Scanner
    }
}