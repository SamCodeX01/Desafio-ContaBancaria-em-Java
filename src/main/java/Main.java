import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, tipoConta;
        int opcao;
        double saldoInicial, valorRecebido = 0, transferencia = 0, saldoTotalAtualizado;

        System.out.println("\n**********!!!BEM VINDO AO SEU BANCO!!!**********");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Tipo da Conta: ");
        tipoConta = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        saldoInicial = sc.nextDouble();

        while (true) {

            System.out.print(""" 
                **************************************************          
                          MENU DE OPÇÕES:  
                              1- Consultar saldos
                              2- Receber valor
                              3- Transferência valor
                              4- Sair          
                """);

        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();
        System.out.println("*****Opção " + opcao + " selecionada!***** ");
        System.out.print("**************************************************\n");

        switch (opcao) {
            case 1:
                //1- Consultar saldos
                consultarSaldo(saldoInicial, valorRecebido);
                System.out.println("Saldo total é: " + consultarSaldo(saldoInicial, valorRecebido));
                break;
            case 2:
                //2- Receber valor
                System.out.print("Qual o valor a ser recebido? ");
                valorRecebido = sc.nextDouble();
                saldoTotalAtualizado = saldoInicial + valorRecebido;
                System.out.println("O valor a ser recebido é: " + valorRecebido);
                System.out.println("Saldo total: " + saldoTotalAtualizado);
                break;
            case 3:
                //3-Transferência valor
                System.out.println("Qual o valor da transferência ser recebido? ");
                transferencia = sc.nextDouble();
                // double saldoInicial, valorRecebido = 0, transferencia = 0;
                break;
            case 4:
                System.out.println("Saindo da Aplicação! ");
                break;
        }
    }

    }

    //saldoInicial + valorRecebido - transferencia
        public static double consultarSaldo(double saldoInicial, double valorRecebido){
            return  (saldoInicial + valorRecebido);
        }

//        public static double valorRecebido(double valorRecebido, double saldoInicial){
//            return (saldoInicial += valorRecebido);
//        }

      /*  public static double valorTRansferencia(double saldoInicial, double valorRecebido, double transferencia){
            return ((saldoInicial + valorRecebido) - transferencia);

        // double saldoInicial, valorRecebido = 0, transferencia = 0;
         */



}


/*

Mostrar:
 *************************************
 "Dados Iniciais do Cliente"
    Nome, Tipo da Conta, Saldo Inicial
 *************************************


Passo a passo:

Inicializar dados do cliente
Menu de opções
Visualização de saldo
Envia valor
Recebe valor


Depois de acabar esse desafio, fazer o capitulo 4 de java da Alura

*/