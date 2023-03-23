package contamelhor;
ipackage contamelhor;
import java.util.Scanner;
public class cliente {
  public static void main(String[] args) {
      conta conta = new conta();
      gerente gerente =new gerente();
      conta.saldo = 500;
      boolean verificar = gerente.CriarConta(0);
      
      System.out.println("seja bem vindo");
          Scanner entrada = new Scanner(System.in);
          System.out.println("Caixa eletronico:\n"
          + "vc é gerente ou cliente\n"
          + "Digite 1 para: Gerente \n"
          + "Digite 2 para: Cliente  \n"
          + "Digite 3 para: Sair \n");
          int opcao = entrada.nextInt();
          switch(opcao){
              case 1:
              Scanner entrada10 = new Scanner(System.in);
              System.out.println("criar conta em nome de:");
              double Nomecliente = entrada10.nextInt();
              gerente.CriarConta( Nomecliente);
              System.out.println("Senhor"+ gerente.nomedocliente +"aqui estão suas informações:\n"
              +"Numero da conta: "+ gerente.numerocriado
              +"\nAgencia: "+ gerente.agenciacriado
              +"\nSaldo disponivel: "+ conta.saldo + " Reais");
              



              case 2:
              System.out.println("POrfavor digite seu numero e agencia\n"
              + "\n"
              + "\n");
              int a;
              Scanner ler = new Scanner(System.in);
              a = ler.nextInt();
              


              
              if(verificar == true && a == gerente.agenciacriado){ 
                System.out.println("Caixa eletronico:\n"
                + "Digite 1 para: Depositar \n"
                + "Digite 2 para: Sacar \n"
                + "Digite 3 para: Sair \n");
                Scanner novaentrada = new Scanner(System.in);
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
            }else{System.out.println("Conta inexistente");} 
         
          }
          }
   }
