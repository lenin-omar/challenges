import model.Combination;
import model.Product;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class Main {

    private static Product products[];

    public static void main(String[] args) {
        setupProducts();
        getListOfCombinations();
    }

    private static void setupProducts() {
        products = new Product[] {
            new Product("Sabritas", 10.00, Product.Type.chips),
            new Product("Pepsi", 10.00, Product.Type.soda),
            new Product("CarlosV", 12.00, Product.Type.chocolate),
            new Product("Doritos", 8.00, Product.Type.chips),
            new Product("Cocacola", 11.00, Product.Type.soda),
            new Product("Kinder", 13.00, Product.Type.chocolate),
            new Product("Chetos", 6.00, Product.Type.chips),
            new Product("Squirt", 12.00, Product.Type.soda),
            new Product("Snickers", 14.00, Product.Type.chocolate),
            new Product("Rancheritos", 7.00, Product.Type.chips),
            new Product("7Up", 9.00, Product.Type.soda),
            new Product("Turin", 15.00, Product.Type.chocolate),
            new Product("Churrumais", 5.50, Product.Type.chips),
            new Product("Fanta", 7.00, Product.Type.soda),
            new Product("Abuelita", 16.00, Product.Type.chocolate)
        };
    }

    private static void getListOfCombinations() {
        int i4 = 0;
        int i3 = 0;
        int i2 = 0;
        int i1 = 0;
        int i0 = 0;
        List<Combination> combinations = new ArrayList<>();
        Product[] productCombination;
        do {
            //Obtener los productos de los indices mostrados.
            productCombination = new Product[]{products[i4], products[i3], products[i2], products[i1], products[i0]};
            //A cada combinación asignar los índices como id.
            Combination combination = new Combination(String.format("%s-%s-%s-%s-%s", i4, i3, i2, i1, i0), productCombination);
            //System.out.println("Combination: " + combination.getKey() + ", Total income: " + combination.getTotalIncome());
            combinations.add(combination);
            //Siguiente combinacion
            if (i0 < products.length-1) {
                //Continua con el proceso normal
                i0++;
            } else {
                //Aumenta uno a la siguiente posicion
                if (i1 < products.length-1) {
                    //Continua con el proceso normal
                    i1++;
                } else {
                    //Aumenta uno a la siguiente posicion
                    if (i2 < products.length-1) {
                        //Continua con el proceso normal
                        i2++;
                    } else {
                        //Aumenta uno a la siguiente posicion
                        if (i3 < products.length-1) {
                            //Continua con el proceso normal
                            i3++;
                        } else {
                            //Aumenta uno a la siguiente posicion
                            i4++;
                            //Iguala el indice actual al de la siguiente posicion
                            i3 = i4;
                        }
                        //Iguala el indice actual al de la siguiente posicion
                        i2 = i3;
                    }
                    //Iguala el indice actual al de la siguiente posicion
                    i1 = i2;
                }
                //Iguala el indice actual al de la siguiente posicion
                i0 = i1;
            }
        } while (i4 < products.length);
        //System.out.println("combinations.size(): " + combinations.size());  //11,628 combinaciones
        sort(combinations);
        //Mostrar resultado final
        for (int i = 0; i < combinations.size(); i++) {
            System.out.println(i + " - Combination: " + combinations.get(i).getKey() + ", Total income: " + combinations.get(i).getTotalIncome());
        }

    }

}
