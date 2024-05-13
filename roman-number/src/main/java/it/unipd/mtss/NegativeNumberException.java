////////////////////////////////////////////////////////////////////
// [LUCA] [PARISE] [2043677]
// [LEONARDO] [BALDO] [2042372]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException  extends Exception {
    public NegativeNumberException(){
        super("Negative numbers don't exist in Roman numerals !");
    }
}
