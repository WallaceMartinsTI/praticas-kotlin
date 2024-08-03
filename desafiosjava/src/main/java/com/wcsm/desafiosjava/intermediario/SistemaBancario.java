package com.wcsm.desafiosjava.intermediario;

import java.util.Scanner;

class ContaBancaria {

    String conta;

    ContaBancaria(String conta) {
        this.conta = conta;
    }

    private double saldo = 0.0;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double saldo() {
        return saldo;
    }

}

class Usuario {

    String usuario;
    String senha;

    Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
}

class SistemaBancario {

    public static void main(String[] args) {
        // example();

        Scanner scanner = new Scanner(System.in);


        boolean hasUser = false;
        ContaBancaria contaBancaria = null;

        while (true) {
            if(hasUser) {
                if(contaBancaria != null) {
                    System.out.println("==================== SISTEMA ====================");
                    System.out.println("[ 3 ] Ver saldo");
                    System.out.println("[ 4 ] Depositar");
                    System.out.println("[ 5 ] Sacar");
                    System.out.println("[ 0 ] Encerrar");
                    System.out.println("=================================================");
                } else {
                    System.out.println("==================== SISTEMA ====================");
                    System.out.println("[ 2 ] Criar conta");
                    System.out.println("[ 0 ] Sair/Encerrar");
                    System.out.println("=================================================");
                }
            } else {
                System.out.println("==================== SISTEMA ====================");
                System.out.println("[ 1 ] Criar usuário");
                System.out.println("[ 0 ] Sair/Encerrar");
                System.out.println("=================================================");
            }


            System.out.print("Opção: ");
            String input = scanner.nextLine();

            try {
                int option = Integer.parseInt(input);
                if(option == 0) {
                    System.out.println("Encerrando.");
                    System.out.println("Encerrando..");
                    System.out.println("Encerrando....");
                    break;
                }
                switch (option) {
                    case 1:
                        if(hasUser) {
                            System.out.println("Seu usuário já foi criado.");
                            break;
                        }
                        System.out.println("==================== SISTEMA ====================");
                        System.out.println("CRIAR USUÁRIO");
                        System.out.print("Usuario: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Senha: ");
                        String senha = scanner.nextLine();
                        boolean usuarioCriado = criarUsuario(usuario, senha);
                        if(usuarioCriado) {
                            hasUser = true;
                        }
                        System.out.println("Usuário criado com sucesso!");
                        break;
                    case 2:
                        if(contaBancaria != null) {
                            System.out.println("Sua conta bancária já foi criada.");
                            break;
                        }
                        contaBancaria = new ContaBancaria("12123512-9");
                        System.out.println("Conta criada com sucesso!");
                        break;
                    case 3:
                        double saldoAtual = contaBancaria.saldo();
                        System.out.printf("Seu saldo atual é de R$%.2f", saldoAtual);
                        break;
                    case 4:
                        while(true) {
                            System.out.println("==================== SISTEMA ====================");
                            System.out.println("Informe quanto deseja depositar, exemplo: 1252,94");
                            System.out.print("Quantia a depositar: R$");
                            String inputQuantiaDeposito = scanner.nextLine();
                            try {
                                String quantiaFormatada = inputQuantiaDeposito.replace(',', '.');
                                double quantiaDeposito = Double.parseDouble(quantiaFormatada);
                                contaBancaria.depositar(quantiaDeposito);
                                System.out.printf("A quantia de R$%.2f foi adicionada a sua conta!", quantiaDeposito);
                                break;
                            } catch (Exception e) {
                                System.out.println("Valor inválido, siga o exemplo: R$123,45");
                            }
                        }
                        break;
                    case 5:
                        while(true) {
                            System.out.println("==================== SISTEMA ====================");
                            System.out.println("Informe quanto deseja sacar, exemplo: 1252,94");
                            System.out.print("Quantia a sacar: R$");
                            String inputQuantiaSaque = scanner.nextLine();
                            try {
                                String quantiaFormatada = inputQuantiaSaque.replace(',', '.');
                                double quantiaSaque = Double.parseDouble(quantiaFormatada);
                                if(contaBancaria.sacar(quantiaSaque)) {
                                    System.out.printf("A quantia de R$%.2f foi retirada da sua conta!", quantiaSaque);
                                } else {
                                    System.out.printf("Erro ao sacar R$%.2f. Saldo insuficiente.", quantiaSaque);
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Valor inválido, siga o exemplo: R$123,45");
                            }
                        }
                        break;
                }

            } catch (Exception e) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

    }

    private static boolean criarUsuario(String usuario, String senha) {
        Usuario novoUsuario = new Usuario(usuario, senha);
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha: " + senha);
        return true;
    }

    public static void example() {
        ContaBancaria contaPrincipal = new ContaBancaria("12345678-9");
        System.out.println("Saldo: R$" + contaPrincipal.saldo());

        contaPrincipal.depositar(200);
        System.out.println("Saldo: R$" + contaPrincipal.saldo());

        contaPrincipal.sacar(60.50);
        System.out.println("Saldo: R$" + contaPrincipal.saldo());
    }

}
