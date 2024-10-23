import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entites.Account;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int id = 0;
        List<Account> contas = new ArrayList<>();
    
        do {
            System.out.println("-----Sistema Bancário------");
            System.out.println("1 - Abra uma conta");
            System.out.println("2 - Saldo da conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();
    
            switch (opcao) {
                case 1:
                    id++;
                    System.out.println("Nome do usuário:");
                    String nome = teclado.nextLine();
                    Account conta = new Account(nome, id);
                    contas.add(conta);
                    System.out.println("Conta criada com sucesso! ID: " + id);
                    break;
    
                case 2: // Saldo da conta
                    System.out.println("Digite o ID da conta que deseja ver o saldo:");
                    int idVerific = teclado.nextInt();
                    boolean contaEncontrada = false;
    
                    for (Account c : contas) {
                        if (c.getId() == idVerific) {
                            System.out.println("O saldo da sua conta é: R$" + c.getSaldo());
                            contaEncontrada = true;
                            break;  // Encerra o loop ao encontrar a conta
                        }
                    }
    
                    if (!contaEncontrada) {
                        System.out.println("ID inválido, tente novamente!");
                    }
                    break;
    
                case 3: // Depositar
                    System.out.println("Digite o ID da conta que deseja depositar:");
                    idVerific = teclado.nextInt();
                    contaEncontrada = false;
    
                    for (Account c : contas) {
                        if (c.getId() == idVerific) {
                            System.out.println("Quanto deseja depositar?");
                            double depositValue = teclado.nextDouble();
                            c.deposit(depositValue);
                            System.out.println("Depósito realizado com sucesso! O saldo da sua conta é: R$" + c.getSaldo());
                            contaEncontrada = true;
                            break;
                        }
                    }
    
                    if (!contaEncontrada) {
                        System.out.println("ID inválido, tente novamente!");
                    }
                    break;
    
                case 4: // Sacar
                    System.out.println("Digite o ID da conta que deseja sacar:");
                    idVerific = teclado.nextInt();
                    contaEncontrada = false;
    
                    for (Account c : contas) {
                        if (c.getId() == idVerific) {
                            System.out.println("Quanto deseja sacar?");
                            double withdrawValue = teclado.nextDouble();
                            c.withdraw(withdrawValue);
                            System.out.println("Saque realizado com sucesso! O saldo da sua conta é: R$" + c.getSaldo());
                            contaEncontrada = true;
                            break;
                        }
                    }
    
                    if (!contaEncontrada) {
                        System.out.println("ID inválido, tente novamente!");
                    }
                    break;
    
                case 5:
                    System.out.println("Obrigado por usar o nosso sistema!");
                    break;
    
                default:
                    System.out.println("!!Digite um número válido!!");
                    break;
            }
        } while (opcao != 5);
    }
    }
    

