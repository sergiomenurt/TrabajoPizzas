package ProgramacionRepaso;

public class Pizza {


    private int tipoMasa;
    private int size;
    private int tipoSalsa;
    private boolean rellena;
    private boolean cebolla;
    private boolean jamon;
    private boolean sinGluten;
    private boolean champiñones;
    private int recojida;


    public static final int FINA = 0;
    public static final int PAN = 1;


    public static final int PEQUEÑA = 0;
    public static final int MEDIANA = 2;
    public static final int GRANDE = 3;


    public static final int TOMATE=0;
    public static final int BARBACOA=1;
    public static final int BLANCA=2;

    
    public static final int PIZZERIA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas(){
        this.cebolla = true;
        this.recojida = PIZZERIA;
        this.rellena = false;
        this.champiñones = false;
        this.sinGluten = false;
        this.tipoSalsa = TOMATE;
        this.jamon = true;
        this.size = MEDIANA;
        this.tipoMasa = FINA;
    }

    public Pizzas(int tipoMasa, int size, int tipoSalsa, boolean rellena, boolean cebolla, boolean jamon, boolean sinGluten, boolean champiñones, int recojida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.jamon = jamon;
        this.sinGluten = sinGluten;
        this.champiñones = champiñones;
        this.recojida = recojida;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    @Override
    public String toString() {
        return "Pizzas" +
                " tipoMasa=" + tipoMasa +
                ", size=" + size +
                ", tipoSalsa=" + tipoSalsa +
                ", rellena=" + rellena +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", champiñones=" + champiñones +
                ", recojida=" + recojida;
    }
}
