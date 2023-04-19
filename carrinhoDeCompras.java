import java.util.Scanner;

public class plank {
    public static void main(String[] args){
Scanner sc1 = new Scanner(System.in);
int escolha;
int continuar;
double soma = 0;

String[] Produtos = {"0 - Camisa", "1 - Short", "2 - Calça", "3 - chapeu", "4 - relogio"};
double[] preço = {49.99, 70.50, 109.99, 29.99, 299.99};

do{
for(int i = 0; i < Produtos.length; i++){
System.out.println("Produto: " + Produtos[i] + ", " + "preço: R$ " + preço[i]);
}
System.out.println();
System.out.println("Digite o numero do produto desejado: ");
escolha = sc1.nextInt();


if(escolha == 0){
    System.out.println(Produtos[0] + " - R$"+ preço[0]);
}
if(escolha == 1){
    System.out.println(Produtos[1]+ " - R$" + preço[1]);
}
if(escolha == 2){
    System.out.println(Produtos[2] + " - R$"+ preço[2]);
}
if(escolha == 3){
    System.out.println(Produtos[3] + " - R$" + preço[3]);
}
if(escolha == 4){
    System.out.println(Produtos[4] + " - R$"+ preço[4]);
}

soma += preço[escolha];
System.out.println("total da compra ate o momento: R$ " + soma);
System.out.println("Digite 1 para continuar comprando, digite 2 para finalizar compra: ");
continuar = sc1.nextInt();
} while(continuar==1);
    System.out.println("valor total da compra: R$ " + soma);


    }
}
