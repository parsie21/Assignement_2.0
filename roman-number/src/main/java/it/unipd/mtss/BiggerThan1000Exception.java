package it.unipd.mtss;


public class BiggerThan1000Exception extends Exception {
    public BiggerThan1000Exception() {
        super("Numbers greater than 4000 are not supported!");
    }
}
