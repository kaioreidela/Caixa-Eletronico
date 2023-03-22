package contamelhor;
import java.util.Scanner;
public class cliente {
  public static void main(String[] args) {
      conta conta = new conta();
      gerente gerente =new gerente();
      conta.saldo = 500;
      System.out.println("seja bem vindo");
          Scanner entrada = new Scanner(System.in);
          System.out.println("Caixa eletronico:\n"
          + "vc é gerente ou cliente\n"
          + "Digite 1 para: Cliente \n"
          + "Digite 2 para: Gerente \n"
          + "Digite 3 para: Sair \n");
          int opcao = entrada.nextInt();
          switch(opcao){
              case 1:
              Scanner entrada10 = new Scanner(System.in);
              System.out.println("criar conta em nome de:");
              double Nomecliente = entrada10.nextInt();
              gerente.CriarConta( Nomecliente);
              System.out.println("Numero da conta: "+ gerente.numerocriado
              +"\nAgencia: "+ gerente.agenciacriado
              +"\nSaldo disponivel: "+ conta.saldo + " Reais");
              break;



             case 2:
              Scanner novaentrada = new Scanner(System.in);
              System.out.println("Caixa eletronico:\n"
              + "Digite 1 para: Depositar \n"
              + "Digite 2 para: Sacar \n"
              + "Digite 3 para: Sair \n");
              int opcao2 = novaentrada.nextInt();
              switch(opcao2){
                case 1:
                Scanner entrada100 = new Scanner(System.in);
                System.out.println("quanto deseja depositar");
                double valorDepositado = entrada100.nextInt();
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
 }
