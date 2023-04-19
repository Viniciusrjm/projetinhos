import java.util.Scanner;

public class banco1 {
    private static String nome;
    private static long cpf;
    private static long numerodaconta;
    private static double saldo;
    private static double sacar;
    private static double depositar;

    Scanner sc = new Scanner(System.in);
    
    public void nome(){
        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
    }
    public void cpf(){
        System.out.print("Informe seu CPF: ");
        cpf = sc.nextLong();
    }
    public void numerodaconta(){
        System.out.print("Informe seu numero da conta: ");
        numerodaconta = sc.nextLong();
    }
    public void saldo(){
        System.out.print("Informe seu saldo: R$ ");
        saldo = sc.nextDouble();
    }
    public void sacar(){
        System.out.println("digite o valor que deseja sacar: R$ ");
        sacar = sc.nextDouble();
        sacar -= saldo;
    }
    public void depositar(){
        System.out.println("digite o valor que deseja depositar: R$ ");
        depositar = sc.nextDouble();    
        depositar += saldo;
    }
    public void exibir(){
        System.out.println();
        System.out.println("Dados atualizados: ");
        System.out.println("Seu nome: " + nome);
        System.out.println("Seu CPF: " + cpf);
        System.out.println("Seu numero da conta: " + numerodaconta);
        System.out.println("Seu Saldo: R$ " + saldo);
    }






}
