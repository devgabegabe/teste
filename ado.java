/**
 * ado
 */
import java.util.Random;
import java.util.Scanner;
public class ado {
   
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
           //ex1(50, 9500);
            //ex2();
          
           /*  System.out.print("Digite o termo até a sequência desejada: ");
           int termo = in.nextInt();
           int resultado = calcularSomaSequencia(termo);
           System.out.println("A soma dos termos da sequência até " + termo + " é: " + resultado); 
          
          /*System.out.print("Digite o primeiro termo da sequência: ");
          int primeiroTermo = in.nextInt();
          System.out.print("Digite o último termo da sequência: ");
          int ultimoTermo = in.nextInt();
          int resultado = calcularSomaSequencia(primeiroTermo, ultimoTermo);
          System.out.println("A soma dos 15 primeiros termos da sequência é: " + resultado); */

         /*int anoAtual = 2023; 
        double salarioInicial = 1000.0;
        double salarioAtual = calcularSalarioAtual(anoAtual, salarioInicial);
        System.out.printf("O salário atual do funcionário em " + anoAtual + " é: R$ " + salarioAtual);*/

          System.out.print("Digite o salário de Carlos: ");
        double salarioCarlos = in.nextDouble();
        double salarioJoao = calcularSalarioJoao(salarioCarlos);
        int meses = igualdade(salarioCarlos, salarioJoao);
        System.out.println("vai levar " + meses + " meses para o salário de João igualar/utrapassar carlos."); 

        // exerc9();
        //exerc10();
        //exerc11();

        //System.out.print("Digite o número de termos: ");
        //int numeroTermos = in.nextInt();
        //exerc13(nTermos);
        //exerc14(10);
       
       // int numeroTimes = 5;
      //  int numeroJogadoresPorTime = 15;
       // int totalJogadores = numeroTimes * numeroJogadoresPorTime;

//int jogadoresMenor18 = contarJogadoresMenor18(totalJogadores);
       // double mediaAlturas = calcularMediaAlturas(totalJogadores);
     //   double percentualMais80Kg = calcularPercentualMais80Kg(totalJogadores);

       // System.out.println("Quantidade menores de 18: " + jogadoresMenor18);
       // System.out.println("Média altura campeonato: " + mediaAlturas);
      //  System.out.println("percentual 80kg: %.2f " + percentualMais80Kg + "%");
      
    }
        public static void ex1(int inicio, int fim) {
            System.out.println("divisíveis por 3 entre " + inicio + " e " + fim + ":");
            
            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        public static void ex2() {
            for (int i = 1; i <= 250; i++) {
                System.out.println(i);
                
                if (i % 10 == 0) {
                    System.out.println("Múltiplo de 10");
                }

    }
}
        public static int calcularSomaSequencia(int termo) {
         int soma = 0;

        for (int i = 1; i <= termo; i++) {
        soma += i;
        }

    return soma;
}
        public static int calcularSomaSequencia(int primeiroTermo, int ultimoTermo) {
        int soma = 0;

        for (int i = primeiroTermo; i <= primeiroTermo + 14 * (ultimoTermo - primeiroTermo); i += ultimoTermo - primeiroTermo) {
        soma += i;
        }

         return soma;
}
        public static double calcularSalarioAtual(int anoAtual, double salarioInicial) {
        double percentualAumento = 0.015; 

        for (int ano = 2011; ano <= anoAtual; ano++) {
        salarioInicial += salarioInicial * percentualAumento;
        percentualAumento *= 2;
     }

    return salarioInicial;
}
        public static double calcularSalarioJoao(double salarioCarlos) {
        return salarioCarlos / 3.0;
        }
        public static int igualdade(double salarioCarlos, double salarioJoao) {
            double taxaRendimentoCarlos = 0.02; 
            double taxaRendimentoJoao = 0.05;   

            int meses = 0;

        while (salarioJoao <= salarioCarlos) {
        salarioCarlos += salarioCarlos * taxaRendimentoCarlos;
        salarioJoao += salarioJoao * taxaRendimentoJoao;
        meses++;
    }

    return meses;
}
        public static void exerc9() {
            Scanner in = new Scanner(System.in);
    
        int numero;
        int somaPositivos = 0;
        int qtdNegativos = 0;

        do {
        System.out.print("Digite um número: ");
        numero = in.nextInt();

        if (numero > 0) {
            somaPositivos += numero;
        } else if (numero < 0) {
            qtdNegativos++;
        }

    } while (numero != 0);

    System.out.println("A soma dos números positivos é: " + somaPositivos);
    System.out.println("A quantidade de números negativos é: " + qtdNegativos);
}
        public static void exerc10() {
    Scanner scanner = new Scanner(System.in);

    double nota;

    do {
        System.out.print("Digite a nota: ");
        nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Por favor, digite novamente.");
        }

    } while (nota < 0 || nota > 10);

    if (nota >= 6) {
        System.out.println("Aluno aprovado!");
    } else if (nota >= 5) {
        System.out.println("Aluno em recuperação.");
    } else {
        System.out.println("Aluno reprovado.");
    }
}
        public static void exerc11() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de referência: ");
    double valorReferencia = scanner.nextDouble();

    double faturamentoGeral = 0;
    int quantidadeConsumidores = 0;

    while (true) {
        System.out.print("Digite a quantidade de kw consumidos: ");
        int quantidadeKW = scanner.nextInt();

        if (quantidadeKW == 0) {
            break;
        }

        System.out.print("Digite o tipo de consumidor: ");
        int tipoConsumidor = scanner.nextInt();

        double valorKW = valorReferencia / 10.0;
        double valorFinal;

        switch (tipoConsumidor) {
            case 1:
                valorFinal = quantidadeKW * valorKW * 1.05; 
                break;
            case 2:
                valorFinal = quantidadeKW * valorKW * 1.10; 
                break;
            case 3:
                valorFinal = quantidadeKW * valorKW * 1.15; 
                break;
            default:
                System.out.println("Tipo de consumidor inválido. Tente novamente.");
                continue;
        }

        faturamentoGeral += valorFinal;

        System.out.println("Valor de cada kw: R$ " + valorKW);
        System.out.println("Valor a ser pago pelo consumidor: R$ " + valorFinal);

        if (valorFinal >= 500 && valorFinal <= 1000) {
            quantidadeConsumidores++;
        }
    }

    System.out.println("Faturamento geral da empresa: R$ " + faturamentoGeral);
    System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + quantidadeConsumidores);
} 
        public static void exerc12(int nTermos) {
        int valor = 2;
        int multiplicador = 3;

        for (int i = 0; i < nTermos; i++) {
        System.out.print(valor + " ");

        if (i % 2 == 0) {
            valor *= multiplicador;
        } else {
            valor *= 4;
        }
}
}
        public static void exerc14(int num){
            for(int i = 1; i <= 10; i++){
            System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
    }
}
        public static int contarJogadoresMenor18(int totalJogadores) {
        int jogadoresMenor18 = 0;
        Random random = new Random();

        for (int i = 0; i < totalJogadores; i++) {
            int idade = random.nextInt(21);
            System.out.println("Idade do jogador " + (i + 1) + ": " + idade);

            if (idade < 18) {
                jogadoresMenor18++;
            }
        }

        return jogadoresMenor18;
    }

    public static double calcularMediaAlturas(int totalJogadores) {
        double somaAlturas = 0;
        Random random = new Random();

        for (int i = 0; i < totalJogadores; i++) {
            double altura = 1.5 + random.nextDouble() * 0.5; 
            System.out.println("Altura do jogador " + (i + 1) + ": " + altura);

            somaAlturas += altura;
        }

        return somaAlturas / totalJogadores;
    }

    public static double calcularPercentualMais80Kg(int totalJogadores) {
        int jogadoresMais80Kg = 0;
        Random random = new Random();

        for (int i = 0; i < totalJogadores; i++) {
            double peso = 60 + random.nextDouble() * 40; 
            System.out.println("Peso do jogador " + (i + 1) + ": " + peso);

            if (peso > 80) {
                jogadoresMais80Kg++;
            }
        }

        return (double) jogadoresMais80Kg / totalJogadores * 100;
    }
}







    
