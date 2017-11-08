package model;

import java.util.Arrays;

public class Combination implements Comparable {

    private String key;
    private Product[] productCombination;
    private Double totalIncome = 0.0;

    public Combination(String key, Product[] productCombination) {
        this.key = key;
        this.productCombination = productCombination;
        setTotalIncome();
    }

    private void setTotalIncome() {
        //Determinar cual de esos 5 productos genera menor gananciay sumar la ganancia de los otros 4 productos.
        Arrays.sort(productCombination);
        for (int i = 1; i < productCombination.length; i++) {
            totalIncome += productCombination[i].income;
        }
    }

    public String getKey() {
        return key;
    }

    public Product[] getProductCombination() {
        return productCombination;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(totalIncome, ((Combination) o).getTotalIncome());
    }
}
