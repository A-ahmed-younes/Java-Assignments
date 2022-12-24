package metier;

public class EntierNaturel {
    private final String ExceptionMsg = "La valeur est négative";

    private int val;
    //pour initialiser l’attribut val
    public EntierNaturel(int val) throws NombreNegatifException{
        if (val<0) throw new NombreNegatifException(ExceptionMsg, val);
        else this.val = val;
    }

    //un accesseur en lecture getVal()
    public int getVal(){
        return this.val;
    }
    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException(ExceptionMsg, val);
        else this.val = val;
    }
    public void decrementer() throws NombreNegatifException {
        if(this.val-1<0) throw new NombreNegatifException("Valeur négative après décrémentation", val);
        else this.val --;
    }
}
