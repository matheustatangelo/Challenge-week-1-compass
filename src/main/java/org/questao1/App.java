package org.questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");

        int n = input.nextInt();
        verificarEntradaUsuario(Integer.toString(n), "numFuncionarios");
        Employee[] employees = new Employee[n]; // Array para armazenar objetos de funcionários

        for (int i = 0; i < n; i++) { // Loop para preencher o array de objetos
            System.out.println("\nDigite os dados do funcionário #" + (i+1) + ":");
            System.out.print("Nome: ");
            String name = input.next();
            verificarEntradaUsuario(name, "nome");
            System.out.print("Salário: R$ ");
            double salary = input.nextDouble();
            verificarEntradaUsuario(Double.toString(salary), "salario");
            employees[i] = new Employee(name, salary); // Instanciação de um objeto
            employees[i].calculateBonus(); // Chamada do método para calcular o Bônus e o Desconto
        }

        System.out.println("\nPAGAMENTOS:");
        for (Employee e : employees) { // Loop para exibir os detalhes do salário
            e.displaySalary();
        }

        input.close(); // Fechar o Scanner
    }

    public static void verificarEntradaUsuario(String entrada, String tipo) {
        if (tipo.equals("nome")) {
            if (!entrada.matches("[a-zA-Z ]+")) { // Verificar se o valor digitado contém apenas letras e espaços em branco
                System.out.println("Erro: Digite um nome válido (apenas letras e espaços em branco)!");
                System.exit(1); // Encerrar o programa
            }
        } else if (tipo.equals("numFuncionarios")) {
            try {
                int num = Integer.parseInt(entrada); // Tentar converter a entrada em um número inteiro
                if (num <= 0) { // Verificar se o número é maior que zero
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido (maior que zero)!");
                System.exit(1); // Encerrar o programa
            }
        } else if (tipo.equals("salario")) {
            try {
                double salario = Double.parseDouble(entrada); // Tentar converter a entrada em um número decimal
                if (salario < 0) { // Verificar se o salário é maior ou igual a zero
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor decimal válido (maior ou igual a zero)!");
                System.exit(1); // Encerrar o programa
            }
        }
    }



}