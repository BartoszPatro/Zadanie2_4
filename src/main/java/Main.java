// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Wbierz działanie: 1-suma, 2-różnica, 3-iloczyn, 4-iloraz");
    Scanner scanner=new Scanner(System.in);
    int opcja=scanner.nextInt();
    System.out.println("Podaj zmienną a");
    double a=scanner.nextDouble();
    System.out.println("Podaj zmienną b");
    double b=scanner.nextDouble();
    double wynik=0.0;
    double suma=0.0;
    double roznica=0.0;
    double iloczyn=0.0;
    double iloraz=0.0;
    switch(opcja)
      {
        case 1:
          suma=a+b;
          wynik=suma;
          break;
        case 2:
          roznica=a-b;
          wynik=roznica;
          break;
        case 3:
          iloczyn=a*b;
          wynik=iloczyn;
          break;
        case 4:
          if (b!=0)
          {
            iloraz=a/b;
            wynik=iloraz;
          }else
          {
            System.out.println("Nie dziel przez zero");
          }  
          break;
    default:
          System.out.println("Niepoprawna opcja ");
          return;
      }
    DecimalFormat df =new DecimalFormat("#.## ");
    System.out.println("Wynik działania to: "+ df.format(wynik));
    scanner.close();    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}