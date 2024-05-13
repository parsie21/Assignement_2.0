package it.unipd.mtss;

public class ZeroException extends Exception {
    public ZeroException(){
        super("Zero doesn't exist in Roman numerlas !");
    }
}