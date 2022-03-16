package ProgramacionRepaso;

public class BuilderPizza {

    private Pizza pizza;

    public Pizza build(){
        return this.pizza;
    }
    //Tengo que definir el constructor por defecto del builder para que cuando le instancie se genere una pizza (por defecto)
    public BuilderPizza(){
        pizza=new Pizza();
    }
    public BuilderPizza setTipoMasa(int tipoMasa){
        pizza.setTipoMasa(tipoMasa);
        return this;
    }
    public BuilderPizza setSize(int size){
        pizza.setSize(size);
        return this;
    }
}

}
