////////////////////////////////////////////////////////////////////
// [LUCA] [PARISE] [2043677]
// [LEONARDO] [BALDO] [2042372]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NotRomanLetterException extends Exception{
    public NotRomanLetterException(char c){
        super("The letter "+ c + "is not a in the Roman set numerals");
    }
} 
