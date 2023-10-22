import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        media();
    }

    private static void media() {
        System.out.println("Qual sua nota?");
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        Scanner n4 = new Scanner(System.in);
        float nota1 = n1.nextFloat();
        float nota2 = n2.nextFloat();
        float nota3 = n3.nextFloat();
        float nota4 = n4.nextFloat();
        float mediN = (nota1 + nota2 + nota3 + nota4)/4;
        if (mediN >= 7){
            System.out.println("Aprovado");
        }else if (mediN >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
