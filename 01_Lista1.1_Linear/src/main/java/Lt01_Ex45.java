/* Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */
public class Lt01_Ex45 
{
     public static void main (String args [])
    {
        double i, soma=0, x=0;
        
        for (i=1; i<=15; i++)
        {
            if (i %2 != 0)
            {
                x = (i/((i*i)));
                soma = soma + x;
                System.out.println ("+"+i+"/"+i*i);
            }else
            {
                x = -1 * (i/(i*i));
                soma = soma + x;
                System.out.println ("-"+i+"/"+i*i);
            }
        }
        System.out.println ("A soma é: " +soma);
            
    }
    
}


