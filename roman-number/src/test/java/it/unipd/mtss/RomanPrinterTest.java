////////////////////////////////////////////////////////////////////
// [LUCA] [PARISE] [2043677]
// [LEONARDO] [BALDO] [2042372]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class RomanPrinterTest {

    static RomanPrinter printer;


    @BeforeClass
    public static void startPrinter() {
        printer = new RomanPrinter();
    }
    
    @Test
    public void Print1ASCII() throws NegativeNumberException, ZeroException, 
    BiggerThan1000Exception, NotRomanLetterException{
        int number= 1;
        String ascii= RomanPrinter.print(number);
        String I =(
            "  _____  \n"+
            " |_   _| \n"+
            "   | |   \n"+ 
            "   | |   \n"+ 
            "  _| |_  \n"+ 
            " |_____| \n");
            
            assertEquals(I , ascii);
    } 


    @Test
    public void Print5ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException {
        int number= 5;
        String ascii= RomanPrinter.print(number);
        String V =(
            " __      __ \n"+
            " \\ \\    / / \n"+
            "  \\ \\  / /  \n"+ 
            "   \\ \\/ /   \n"+ 
            "    \\  /    \n"+
            "     \\/     \n");
            
            assertEquals(V , ascii);
    } 


    @Test
    public void Print10ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException{
        int number= 10;
        String ascii= RomanPrinter.print(number);
        String X =(" __   __  \n"+
                 " \\ \\ / /  \n"+
                 "  \\ V /   \n"+
                 "   > <    \n"+
                 "  / . \\   \n"+
                 " /_/ \\_\\  \n"
                );
            
            assertEquals(X , ascii);
    }


    @Test 
    public void Print50ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException{
        int number= 50;
        String ascii= RomanPrinter.print(number);
        String L =(
            "  _       \n"+
            " | |      \n"+
            " | |      \n"+
            " | |      \n"+
            " | |____  \n"+
            " |______| \n"
        );
            
            assertEquals(L , ascii);
    }


    @Test
    public void Print100ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException{
        int number= 100;
        String ascii= RomanPrinter.print(number);
        String C =(
            "   _____   \n"+  
            "  / ____|  \n"+
            " | |       \n"+
            " | |       \n"+
            " | |____   \n"+
            "  \\_____|  \n" 
        );
            
            assertEquals(C , ascii);
    }

    @Test
    public void Print500ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException{
        int number= 500;
        String ascii= RomanPrinter.print(number);
        String D =(
            "  ____    \n"+
            " |  __ \\  \n"+
            " | |  | | \n"+
            " | |  | | \n"+
            " | |__| | \n"+
            " |_____/  \n" 
        );
            
            assertEquals(D , ascii);
    }

    @Test
    public void Print1000ASCII() throws NegativeNumberException, ZeroException, BiggerThan1000Exception, NotRomanLetterException{
        int number= 1000;
        String ascii= RomanPrinter.print(number);
        String M =(
            "  __  __   \n"+
            " |  \\/  |  \n"+
            " | \\  / |  \n"+
            " | |\\/| |  \n"+
            " | |  | |  \n"+
            " |_|  |_|  \n");
            
            assertEquals(M , ascii);
    }

   
  
}