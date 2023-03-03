import java.time.LocalDate;


    public class contacorrente {
        String numero;
        String agencia;
        double saldo;
     
        boolean realizarSaque (double quantiaSacar){
           if (saldo >= quantiaSacar) {
             saldo -=quantiaSacar;
             return true;
    
           }else{
             return false;
    
           }
     
        }
        void depositar (double valorDepositado){
           saldo += valorDepositado;
    
        }
        void consultarsaldo(){
           System.out.println("Saldo atual =" + saldo);
    
    
        }
    }
    

    

