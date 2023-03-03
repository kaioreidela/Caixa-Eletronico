import java.util.Scanner;
import java.time.LocalDate;

public class testecorrente {
    public static void main(String[] args) {
        contacorrente conta = new contacorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.saldo = 500;
        
   
        System.out.println("Numero da conta: "+ conta.numero
        +"\nAgencia: "+ conta.agencia
        +"\nSaldo disponivel: "+ conta.saldo + " Reais");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Caixa eletronico:\n"
        + "Digite 1 para: Depositar \n"
        + "Digite 2 para: Sacar \n"
        + "Digite 3 para: Sair \n");
        int opcao = entrada.nextInt();
        switch(opcao){
          case 1:
          Scanner entrada1 = new Scanner(System.in);
          System.out.println("quanto deseja depositar");
          double valorDepositado = entrada1.nextInt();
          conta.depositar(valorDepositado);
          conta.consultarsaldo();
          break;

          case 2:
          Scanner entrada2 = new Scanner(System.in);
          System.out.println("quanto deseja sacar");
          double quantiaSacar  = entrada2.nextInt();
          conta.realizarSaque(quantiaSacar);
          conta.consultarsaldo();
          break;

          case 3:
            break;
          default:
            System.out.println("opcao digitada invalida");    
   
        }
   
}
}