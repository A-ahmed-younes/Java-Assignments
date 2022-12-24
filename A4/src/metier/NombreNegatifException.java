package metier;

public class NombreNegatifException extends Exception {
    private final int valeurErronee;
    private String message;
    public NombreNegatifException(String message, int valeurErronee) {
        super(message);
        this.valeurErronee = valeurErronee;
    }

    //mémoriser la valeur erronée
    public int getValeurErronee() {
        return this.valeurErronee;
    }
}
