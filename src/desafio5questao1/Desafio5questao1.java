package desafio5questao1;

/**
 *
 * @author Jeferson Leon
 */
public class Desafio5questao1 {

    /*
    Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 
    metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e 
    imprima quantos anos serão necessários para que Zé seja maior que Chico
     */
    public static void main(String[] args) {

        int chico, ze, ano;
        chico = 150;
        ze = 110;
        ano = 0;

        while (chico >= ze) {
            chico = chico + 2;
            ze = ze + 3;
            ano++;
             System.out.println("Chico:"+chico+" Zé:"+ze +"Ano: "+ano);
        }
        System.out.println("Int - Zé levou " + ano + " anos para ser maior que chico");
     double c, z, a;
        c = 1.50;
        z = 1.10;
        a = 0;
         while (c > z) {
            c = c + 0.02;
            z = z + 0.03;
            a++;
             System.out.println("Chico:"+c+" Zé:"+z +"Ano: "+a);
        }
        System.out.println("Double - Zé levou " + a + " anos para ser maior que chico");
    }

}
