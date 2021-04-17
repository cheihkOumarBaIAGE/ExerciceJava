/*
    -Ajouter classe***A Faire
    -Lister classe***A Faire
    -inscrire etudiant dans une classe
    -affecter une classe a un enseignat
    -Lister les classes d'un enseignat
    -Lister les etudiants d'une classe
*/

import java.util.Scanner;
public class ExercicePoo {
public static void main(String[] args) {
    System.out.println("1-Ajouter classe");
    System.out.println("2-Lister classe");
    System.out.println("3-inscrire etudiant dans une classe");
    System.out.println("4-affecter une classe a un enseignat");
    System.out.println("5-Lister les classes d'un enseignat");
    System.out.println("6-Lister les etudiants d'une classe");
    System.out.println("7-Quitter");
    System.out.print("Saisissez un chiffre inferieur ou egal a 7 :");
        Scanner clavier=new Scanner(System.in);
            int nb=clavier.nextInt();
switch(nb){
    case 1:char[] firstArray =new char[3];
    Scanner clavier=new Scanner(System.in);
    //Message&Saisie
    System.out.println("Entrer Le nom");
    char x=clavier.nextChar();      

    System.out.println("Entrer son Prenom");
    char reel1=clavier.nextChar();

    System.out.println("Entrer sa classe");
    char f=clavier.nextChar();;break;
    case 2:System.out.printlnfor(char c:firstArray){
        System.out.println(value);;break;
    case 3:System.out.println("Inscription etudiant dans une classe");break;
    case 4:System.out.println("Affectation une classe a un enseignat");break;
    case 5:System.out.println("Liste des classes d'un enseignat");break;
    case 6:System.out.println("Liste des etudiants d'une classe");break;
    default:System.exit(7);
    break;
}}}