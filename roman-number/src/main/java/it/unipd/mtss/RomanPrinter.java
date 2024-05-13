package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {

  public static String print(int num) throws ZeroException, NegativeNumberException,
   BiggerThan1000Exception, NotRomanLetterException {
  return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) throws NotRomanLetterException {


    String[] I ={
                "  _____  ",
                " |_   _| ",
                "   | |   ", 
                "   | |   ", 
                "  _| |_  ", 
                " |_____| "};


    String[] V ={
                " __      __ ", 
                " \\ \\    / / ",
                "  \\ \\  / /  ", 
                "   \\ \\/ /   ", 
                "    \\  /    ", 
                "     \\/     "};


    String[] X ={" __   __  ", 
                 " \\ \\ / /  ",
                 "  \\ V /   ",
                 "   > <    ",
                 "  / . \\   ",
                 " /_/ \\_\\  "
                };


    String[] L ={
                "  _       ", 
                " | |      ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| "
            };


    String[] C ={
                "   _____   ",  
                "  / ____|  ",
                " | |       ",
                " | |       ",
                " | |____   ",
                "  \\_____|  " 
            };


    String[] D ={
                "  ____    ",
                " |  __ \\  ",
                " | |  | | ",
                " | |  | | ",
                " | |__| | ",
                " |_____/  " 
            };



    String[] M ={
                "  __  __   ",
                " |  \\/  |  ",
                " | \\  / |  ",
                " | |\\/| |  ",
                " | |  | |  ",
                " |_|  |_|  "};


    String result="";


    for (int j=0; j<6;j++){
        
        for (char c : romanNumber.toCharArray()) {
            if(c =='I') {result+= I[j];}
            if(c =='V') {result+= V[j];}
            if(c =='X') {result+= X[j];}
            if(c =='L') {result+= L[j];}
            if(c =='C') {result+= C[j];}
            if(c =='D') {result+= D[j];}
            if(c =='M') {result+= M[j];}
            
            
            if (!(Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M').contains(c))){
                //throw new NotRomanLetterException(c);
            }
        }

        result+="\n";
    }

    return result;
  }
   
};