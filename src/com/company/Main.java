package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        // ex 1

        Scanner keyPad  = new Scanner(System.in);
        float cost, shipping = 0.0f, profit;// inicializa cost
        int distributionCenter;
        System.out.println("Informe o número do centro de distribuição (1, 2, 3 ou qualquer outro número para sair): ");
        distributionCenter = keyPad.nextInt();// preco de venda = preco de custo + porcentagem do valor do frete custo
        while (distributionCenter > 0 && distributionCenter < 4){
            System.out.println("Informe o valor de custo: ");
            cost = keyPad.nextFloat();
            if (distributionCenter == 1){
                shipping = cost*1.07f;
            }else if (distributionCenter == 2){
                shipping = cost*1.15f;
            }else if (distributionCenter == 3){
                shipping = cost*1.22f;
            }
            profit = shipping*1.25f;
            System.out.println("O Preço de venda é $ "+profit);
            System.out.println("Informe o número do centro de distribuição (1, 2, 3 ou qualquer outro número para sair): ");
            distributionCenter = keyPad.nextInt();// preco de venda = preco de custo + porcentagem do valor do frete custo
        }
        System.out.println("Sistema finalizado");
    }*/

/*        // ex 2

        Scanner keyPad = new Scanner(System.in);
        double salario, salario1;// inicializa cost
        int percentual;
        System.out.println("Iniciando consulta de atualização de salário");
        System.out.println("Informe o salário do funcionário (Caso deseje encerrar a consulta, digite 0 ou um valor negativo): ");
        salario = keyPad.nextInt();
        while (salario > 0d) {
            if (salario <= 20000d) {
                percentual = 20;
                salario1 = 1.2 * salario;
            } else if (salario > 20000d && salario <= 45000d) {
                percentual = 10;
                salario1 = 1.1 * salario;
            } else {
                percentual = 5;
                salario1 = 1.05 * salario;
            }
            System.out.println("O funcionário terá um percentual de aumento de " + percentual + "% sendo o novo salário de: S " + salario1);
            System.out.println("Informe o salário do funcionário (Caso deseje encerrar a consulta, digite 0): ");
            salario = keyPad.nextInt();
        }
    }*/

/*
        // ex 3

        Scanner keyPad = new Scanner(System.in);
        double serviceValue, cameras = 1500d, patrulha = 700d;
        int servico, i;
        for (i = 1; i < 8; ++i) {
            System.out.println("Selecione o serviço desejado (1 ou 2) para o cliente "+i+": ");
            servico = keyPad.nextInt();
            if (servico == 1) {
                serviceValue = cameras;
                System.out.println("Serviço 1 selecionado: Segurança com câmeras - Preço fixo de US $ 1.500 por mês");
            } else {
                serviceValue = cameras + patrulha;
                System.out.println("Serviço 2 selecionado: Câmera de segurança + patrulha - Preço de $ 1500 + $ 700 para serviço de patrulha");
            }
            System.out.println("O valor final da fatura para o cliente "+i+" é de: " + serviceValue);
        }
        System.out.println("Leitura finalizada");
    }
}*/

        Scanner keyPad = new Scanner(System.in);
        int i, j = 0, k = 0, l = 0, m = 0, n = 0;
        String da, db, dc;
        for (i = 0; i < 4; ++i) {
            System.out.println("Vc é assinante do Diário A? (y) para Sim, (n) para não");
            da = keyPad.next();
            System.out.println("Vc é assinante do Diário B? (y) para Sim, (n) para não");
            db = keyPad.next();
            System.out.println("Vc é assinante do Diário C? (y) para Sim, (n) para não");
            dc = keyPad.next();
            if (da.equals("y") && db.equals("y") && dc.equals("y")) {
                ++j;
            } else if (da.equals("y") && db.equals("n") && dc.equals("y")) {
                ++k;
            } else if (da.equals("y") && db.equals("y") && dc.equals("n")) {
                ++l;
            } else if (da.equals("n") && db.equals("y") && dc.equals("y")) {
                ++m;
            } else if (da.equals("y") && db.equals("n") && dc.equals("n")) {
                ++n;
            }
        }
        System.out.println("Assinantes dos 3 jornais: " + j + "\nAssinantes do Diário A e Diário C: " + k + "\nAssinantes do Diário A e Diário B: " + l + "\nAssinantes do Diário B e Diário C: " + m + "\nAssinantes d Diário A: " + n);
    }
}
