// TALL Alan TDA 29/09/2021
package calculator;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Alant
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator: \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo") ;
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'opérateur :");
        operateur=sc.nextInt();
        if(5<operateur || operateur<1);
            
           System.out.println("Erreur de saisie , t nul");
           System.exit(0);
        
        int operande1;
        System.out.println("\n Entrer first numb :");
        operande1=sc.nextInt();
        int operande2;
        System.out.println("\n Entrer second numb :");
        operande2=sc.nextInt();
        int resultat;
        resultat=0;
        
                       
        switch (operateur){
            case 1 :
                resultat=operande1+operande2;
                    break;
            case 2 :
                resultat=operande1-operande2;
                    break;
            case 3 :
                resultat=operande1*operande2;
                    break;
            case 4 :
                resultat=operande1/operande2;
                    break;
            case 5 :
                resultat=operande1%operande2;
                    break;
               
        }
        System.out.print("Le résultat est :"+resultat);
                    
                
                    
        
        
        
        
        
        
    }
    
}
