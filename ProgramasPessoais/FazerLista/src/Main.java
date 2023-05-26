import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Dados
        String listanomes = "1.GUILHERME GONÇALVES GARROTE  4.WENDLER GABRIEL FERRAZ POCARLI  5.JULIANA CARDOSO ARAUJO  6.JOSE HENRIQUE VISU DE OLIVEIRA  7.ANA BEATRIZ FOGACA MEDEIROS  8.JOAO VITOR DE OLIVEIRA BERGAMINI  9.JOAO VICTOR DE OLIVEIRA  10.JOSE RENATO GONÇALVES LOURENCO DA SILVA  11.KAUA FELIPE NUNES OLIVEIRA  12.DAVI GOMES CARDOSO  13.MARCELA BIANCA DE OLIVEIRA  14.CONRADO JOSE BALADELI DOS SANTOS  15.ARTHUR VILAR BATISTA  16.MARIA FERNANDA ORMENESE GOMES  17.DANILO FILADELFO SANCHES JUNIOR  18.ISABELLI FERRAZI ENZ  19.MOISES FELIPE VIOL  20.MURILO ALVES BUROCCHI  21.MARINA MORAES BARBOSA  22.BRUNO HERNANDES DE CAMARGO  24.JOÃO GUILHERME RUBENS DE OLIVEIRA  26.GIOVANNA GABRIELA MAINARDI ALEINO  27.PEDRO HENRIQUE ELIAS DE FREITAS  28.RAFAELA MARIA DE OLIVEIRA  29.DAVID CARRIEL FREIRE  30.GUILHERME DA COSTA ISIDORO  31.JOAO PEDRO OLIVEIRA AMBROSIO  32.IAGO ORTIZ PEREIRA  33.RAFAEL JOSE MORALES GONCALVES SIIVA  34.DANIEL ZANATA JOIA GAUDENS  35.KAROL APARECIDA RODRIGUES ROSA  36.NICOLAS MIGUEL OLVEIRA DA SILVA  37.EDUARDO GOGONI BOTARO  38.LETICIA RODRIGUES VIEIRA SOUSA  39.THIAGO HENRIQUE MORAIS DE CAMPOS  40.MARIA JULIA PILEGI  41.ANA BEATRIZ LEMOS  42.MARIA VITORIA MARIANO DE SOUSA  44.NATALIA VITORIA GERALDO DE SOUZA  45.JOAO VITOR FURTUNATO DOS REIS  46.ISABELLA GOMES GARCIA";

        String listanomesalfabetica = "ANA BEATRIZ FOGACA MEDEIROS  ANA BEATRIZ LEMOS  ARTHUR VILAR BATISTA  BRUNO HERNANDES DE CAMARGO  CONRADO JOSE BALADELI DOS SANTOS  DANIEL ZANATA JOIA GAUDENS  DANILO FILADELFO SANCHES JUNIOR  DAVI GOMES CARDOSO  DAVID CARRIEL FREIRE  EDUARDO GOGONI BOTARO  GIOVANNA GABRIELA MAINARDI ALEINO  GUILHERME DA COSTA ISIDORO  GUILHERME GONÇALVES GARROTE  IAGO ORTIZ PEREIRA  ISABELLA GOMES GARCIA  ISABELLI FERRAZI ENZ  JOÃO GUILHERME RUBENS DE OLIVEIRA  JOAO PEDRO OLIVEIRA AMBROSIO  JOAO VICTOR DE OLIVEIRA  JOAO VITOR DE OLIVEIRA BERGAMINI  JOAO VITOR FURTUNATO DOS REIS  JOSE HENRIQUE VISU DE OLIVEIRA  JOSE RENATO GONÇALVES LOURENCO DA SILVA  JULIANA CARDOSO ARAUJO  KAROL APARECIDA RODRIGUES ROSA  KAUA FELIPE NUNES OLIVEIRA  LETICIA RODRIGUES VIEIRA SOUSA  MARCELA BIANCA DE OLIVEIRA  MARIA FERNANDA ORMENESE GOMES  MARIA JULIA PILEGI  MARIA VITORIA MARIANO DE SOUSA  MARINA MORAES BARBOSA  MOISES FELIPE VIOL  MURILO ALVES BUROCCHI  NATALIA VITORIA GERALDO DE SOUZA  NICOLAS MIGUEL OLVEIRA DA SILVA  PEDRO HENRIQUE ELIAS DE FREITAS  RAFAEL JOSE MORALES GONCALVES SIIVA  RAFAELA MARIA DE OLIVEIRA  THIAGO HENRIQUE MORAIS DE CAMPOS  WENDLER GABRIEL FERRAZ POCARLI";

        String listarms = "20231620082  20231620123  20231620028  20231620040  20231620095  20231620070  20231620097  20231620068  20231620063  20231620075  20231620031  20231620102  20231620019  20231620106  20231620137  20231620026  20231620089  20231620057  20231620032  20231620008  20231620131  20231620033  20231620021  20231620001  20231620065  20231620011  20231620094  20231620015  20231620105  20231620058  20231620120  20231620049  20231620010  20231620002  20231620140  20231620064  20231620112  20231620046  20231620069  20231620103  20231620079";


        String[] nomes = listanomesalfabetica.split("  ");
        String[] rms = listarms.split("  ");

        for (int i = 0; i != 41; i++) {
            String nome = nomes[i];
            String rm = rms[i];
            nome = nome.replace(".", "° ");
            System.out.println((i + 1) + "- " + nome + " - " + rm);
        }

        sc.close();


    }


}
