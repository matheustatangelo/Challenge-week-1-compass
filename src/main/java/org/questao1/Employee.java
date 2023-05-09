package org.questao1;

public class Employee {
    private String employeeName; // Declaração de variável privada
    private double employeeSalary;
    private double employeeBonus;
    private double liquidSalary;

    public Employee(String employeeName, double employeeSalary) { // Construtor com parâmetros "nome" e "salario"
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void calculateBonus() { // Método para calcular o Bônus e o Desconto
        if (employeeSalary <= 1000) { // Condição para calcular o Bônus e o Desconto
            employeeBonus = employeeSalary * 0.2;
        } else if (employeeSalary > 1000 && employeeSalary <= 2000) {
            employeeBonus = employeeSalary * 0.1;
        } else {
            employeeBonus = -employeeSalary * 0.1;
        }
        liquidSalary = employeeSalary + employeeBonus;
    }

    public void displaySalary() { // Método para exibir os detalhes do salário
        System.out.println("Funcionário: " + getName());
        System.out.printf("Salário: R$ %.2f%n", getSalary());
        if (getBonus() > 0) {
            System.out.printf("Bônus: R$ %.2f%n", getBonus());
        } else {
            System.out.printf("Desconto: R$ %.2f%n", -getBonus());
        }
        System.out.printf("Salário líquido: R$ %.2f%n%n", GetLiquidSalary());
    }

    // Métodos Getters e Setters
    public String getName() {
        return employeeName;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return employeeSalary;
    }

    public void setSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getBonus() {
        return employeeBonus;
    }

    public void setBonus(double employeeBonus) {
        this.employeeBonus = employeeBonus;
    }

    public double GetLiquidSalary() {
        return liquidSalary;
    }

    public void GetLiquidSalary(double liquidSalary) {
        this.liquidSalary = liquidSalary;
    }
}
