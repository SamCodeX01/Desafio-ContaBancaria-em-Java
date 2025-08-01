import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, tipoConta;
        int opcao;
        double saldo = 0, valorRecebido = 0, transferencia = 0;

        System.out.println("\n**********!!!BEM VINDO AO SEU BANCO!!!**********");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Tipo da Conta: ");
        tipoConta = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        saldo = sc.nextDouble();

        while (true) {

            System.out.print(""" 
                **************************************************          
                          MENU DE OPÇÕES:  
                              1- Consultar saldos
                              2- Receber valor
                              3- Transferência valor
                              4- Mostrar dados do cliente
                              5- Sair          
                """);

        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();
        System.out.println("\n*****Opção " + opcao + " selecionada!***** ");
        if(opcao == 1){System.out.println("*****Consultar saldos!*****");}
        else if(opcao == 2){System.out.println("*****Receber valor!*****");}
        else if(opcao == 3){System.out.println("*****Transferência valor!*****");}
        else if(opcao == 4){System.out.println("*****Mostrar dados do cliente!*****");}
        else if(opcao == 5){System.out.println("*****Sair!*****");}
        System.out.print("**************************************************\n");

        switch (opcao) {
            case 1:
                //1- Consultar saldos
                System.out.println("O saldo é: " + saldo);
                break;
            case 2:
                //2- Receber valor
                System.out.print("Qual o valor a ser recebido? ");
                valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
                System.out.println("O valor a ser recebido é: " + valorRecebido);
                System.out.println("Saldo total: " + saldo);
                break;
            case 3:
                //3-Transferência valor
                System.out.print("Qual o valor da transferência? ");
                transferencia = sc.nextDouble();

                if(transferencia > saldo){
                    System.out.println("Saldo insuficiente para transferência!");
                }
                else{
                    saldo -= transferencia;
                    System.out.println("Trasnferência realizada: " + transferencia);
                    System.out.println("Saldo atual: " + saldo);
                }
                break;

            case 4:
                System.out.println("NOME: " + nome);
                System.out.println("TIPO DE CONTA: " + tipoConta);
                System.out.println("SALDO ATUAL: " + saldo);
                break;
            case 5:
                System.out.println("Fim da Aplicação! ");
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    }

}


