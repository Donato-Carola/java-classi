//! esercizio sulle classi in JAVA , prima versione

// costruire una piccola calcolatrice con le classi in JAVA

public class Operazioni {

    int a;
    int b;
    

    public void somma(){
        int somma = a + b ;
        System.out.println("la somma è: " +  somma );
    }

    public void moltiplicazione(){
        int mol = a * b ;
        System.out.println("la moltiplicazione è: " +  mol );
    }

    public void divisione(){
        int div = a / b ;
        System.out.println("la divisione è: " +  div );
    }
    public void sottrazione(){
        int sott = a + b ;
        System.out.println("la sottrazione è: " +  sott );
    }

    public static void main(String[] args) {
        Operazioni result = new Operazioni();   //andiamo a creare l'istanza di calcolatrice

        result.a = 10;                  //andiamo ad aggiungere i valori 
        result.b = 2;

        result.somma();            // in questo modo andiamo a richiamare i singoli metodi
        result.divisione();
        result.moltiplicazione();
        result.divisione();
    }

}
