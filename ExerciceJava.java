/*
exercice 1
*/
import java.util.Scanner;

class ExerciceJava
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int y = s.nextInt();
        boolean b = false;
        if(y % 400 == 0)
        {
            b = true;
        }
        else if (y % 100 == 0)
        {
            b = false;
        }
        else if(y % 4 == 0)
        {
            b = true;
        }
        else
        {
            b = false;
        }
        if(b == true)
        {
            System.out.println("L'année "+ y +" est une année bissextile");
        }
        else
        {
            System.out.println("L'année "+ y +" n'est pas une année bissextile");
        }
    }
}

/*
exercice 2
*/
//avec classe
import java.time.*;
int mois = ....;
int anneee = ....;
Month.of(mois).getLength(Year.isLeap(annee));

/*
exercice 3
*/
//avec classe
import java.text.*;
import java.util.*;

public class Main {
   public static boolean check(String date)
   {
      // Définir le format date préféré
      SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
      format.setLenient(false);
      try
      {
          Date d = format.parse(date); 
          System.out.println(date+" est une date valide");
      }
      // Date invalide
      catch (ParseException e)
      {
          System.out.println(date+" est une date invalide");
          return false;
      }
      // Renvoie true si la date est valide
      return true;
   }
   
   public static void main(String args[]){
    check("07/25/2020");
    check("07/25/0000");
    check("07,25,2020");
   }
}

/*
exercice 5
*/
//1-le max et le min
public class Main{
  public static void main(String[] args) {
      int n1 = 3, n2 = 10, n3 = 5;
      if( n1 <= n2 && n1 <= n3)
          System.out.println("Le plus petit nombre est: "+n1);
      else if (n2 <= n1 && n2 <= n3)
          System.out.println("Le plus petit nombre est: "+n2);
      else
          System.out.println("Le plus petit nombre est: "+n3);
  }
}
public class Main{
  public static void main(String[] args) {
      int n1 = 3, n2 = 10, n3 = 5;
      if( n1 >= n2 && n1 >= n3)
          System.out.println("Le plus grand nombre est: "+n1);
      else if (n2 >= n1 && n2 >= n3)
          System.out.println("Le plus grand nombre est: "+n2);
      else
          System.out.println("Le plus grand nombre est: "+n3);
  }
}
//2-les deux premiers min et max
//3-la somme des valeurs premieres
import java.util.Scanner;
class Q7
{
	public static void main( String args [])
	throws Exception
	{
		Scanner sc = new Scanner (System.in);
		int nbre, somme=0;
		do
		{
			System.out.println("Entrez un nombre positif non null");
			nbre=sc.nextInt();
		}
	while(nbre<=0);
	while (nbre!=0){
		somme=somme+nbre;
		nbre--;
	}
	System.out.println ("La somme est : " + somme);
}
//4-le produit des valeur parfaite

//5-la valeur min et max parfaite