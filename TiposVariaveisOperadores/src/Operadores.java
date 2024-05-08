public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);
    
         // Exemplo 1: Soma de dois números
        int a = 10;
        int b = 5;
        int soma = a + b;
         System.out.println("A soma de " + a + " e " + b + " é: " + soma);

         // Exemplo 2: Divisão de dois números
        double c = 10.0;
        double d = 3.0;
        double divisao = c / d;
        System.out.println("A divisão de " + c + " por " + d + " é: " + divisao);

         // Exemplo 1: Verificar se dois números são iguais
        int num1 = 5;
        int num2 = 7;
        if (num1 == num2) {
        System.out.println("Os números são iguais");
        } else {
        System.out.println("Os números são diferentes");
        }

         // Exemplo 2: Verificar se um número é maior que outro
        double x = 10.5;
        double y = 7.2;
        if (x > y) {
        System.out.println(x + " é maior que " + y);
        } else {
        System.out.println(y + " é maior que " + x);
        }

         // Exemplo 1: Verificar se um número está dentro de um intervalo
        int numero = 15;
        if (numero >= 10 && numero <= 20) {
        System.out.println(numero + " está no intervalo de 10 a 20");
        } else {
        System.out.println(numero + " não está no intervalo de 10 a 20");
        }

         // Exemplo 2: Verificar se um número é par e positivo
        int num = 6;
        if (num > 0 && num % 2 == 0) {
        System.out.println(num + " é um número par e positivo");
        } else {
        System.out.println(num + " não é um número par e positivo"); 
        }

         // Exemplo 1: Incremento
        int contador = 0;
        contador += 1; // Equivalente a contador = contador + 1;
        System.out.println("O contador é: " + contador);

         // Exemplo 2: Operador de atribuição condicional
        int idade = 20;
        String status = (idade >= 18) ? "Adulto" : "Menor de idade";
        System.out.println("A pessoa é: " + status);



    }
}
