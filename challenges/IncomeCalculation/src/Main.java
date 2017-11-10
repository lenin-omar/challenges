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
            //Obtener los productos en base a los índices.
            productCombination = new Product[]{products[i4], products[i3], products[i2], products[i1], products[i0]};
            //A cada combinación asignar los índices como id.
            //System.out.println(String.format("%s-%s-%s-%s-%s", i4, i3, i2, i1, i0));
            Combination combination = new Combination(String.format("%s-%s-%s-%s-%s", i4, i3, i2, i1, i0), productCombination);
            combinations.add(combination);
            //Siguiente combinacion
            if (i0 < products.length-1) {
                //Continua con el proceso normal
                i0++;
            } else {
                //Aumenta uno a la siguiente posición
                if (i1 < products.length-1) {
                    //Continua con el proceso normal
                    i1++;
                } else {
                    //Aumenta uno a la siguiente posición
                    if (i2 < products.length-1) {
                        //Continua con el proceso normal
                        i2++;
                    } else {
                        //Aumenta uno a la siguiente posición
                        if (i3 < products.length-1) {
                            //Continua con el proceso normal
                            i3++;
                        } else {
                            //Aumenta uno a la siguiente posición
                            i4++;
                            //Iguala el indice actual al de la siguiente posición
                            i3 = i4;
                        }
                        //Iguala el indice actual al de la siguiente posición
                        i2 = i3;
                    }
                    //Iguala el indice actual al de la siguiente posición
                    i1 = i2;
                }
                //Iguala el indice actual al de la siguiente posición
                i0 = i1;
            }
        } while (i4 < products.length);
        sort(combinations);
        //Mostrar resultado final
        for (int i = 0; i < combinations.size(); i++) {
            System.out.println(String.format("%s - Combination: %s, Total income: %5.2f", i, combinations.get(i).getKey(), combinations.get(i).getTotalIncome()));
        }
        //Mostrar combinación con menor ganancia
        System.out.println("\nLOWEST INCOME COMBINATION");
        showCombinationProducts(combinations.get(0).getProductCombination());
        //Mostrar combinación con mayor ganancia
        System.out.println("\nHIGHEST INCOME COMBINATION");
        showCombinationProducts(combinations.get(combinations.size()-1).getProductCombination());
    }

    private static void showCombinationProducts(Product[] prods) {
        for (Product producto : prods) {
            System.out.println(String.format("%s - %5.2f", producto.getName(), producto.getPrice()));
        }
    }

}
