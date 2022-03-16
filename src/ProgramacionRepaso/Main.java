package ProgramacionRepaso;

import static com.cod.Pizzas.*;

public class Main {

    public static void main(String[] args) {



        /*
        Pizzas basica = new Pizzas();
        Pizzas napolitana = new Pizzas(Pizzas.FINA, Pizzas.GRANDE, Pizzas.BARBACOA, true, false, false, true, true, Pizzas.PARALLEVAR);
        System.out.println(basica.toString());
        System.out.println(napolitana.toString());




        PizzaBuilder miBuilder = new PizzaBuilder();
        PizzaBuilder miBuilder2 = miBuilder.setTipoMasa(PAN);
        PizzaBuilder miBuilder3 = miBuilder2.setSize(PEQUEÑA);



        //construyo la pizza
        Pizzas creadaConBuilder = miBuilder.build();
         */


                Pizza miPizza = new BuilderPizza()
                        .setTipoMasa(FINA);
                        .setSize(GRANDE);
                        .build();
                System.out.println(miPizza.toString());
            }
        }
    }
}
