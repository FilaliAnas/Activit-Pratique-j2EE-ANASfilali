package metier;
import Metier.Calcul;
import org.junit.Assert;
import org.junit.Test;

public class calculTest {
    private Calcul calcul;

 @Test
    public void testSomme(){
calcul=new Calcul();
int a =5; int b=3 ;
int expected =8;
int res =calcul.somme(a,b);
     Assert.assertTrue(res==expected);
    }
}
