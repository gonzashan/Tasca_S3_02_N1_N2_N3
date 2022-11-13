package exercici1nivell3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        // Into the arraList 1 equals to AED , 2 equals to Indonesian Rupiah and 3 equals to USDollar
        List<Coin> coinList3 = new ArrayList<Coin>(Arrays.asList(new AED(), new IndonesianRupiah(), new UsDollar()));
        IConvertidorInjector iConvertidorInjector = new ConvertidorInjector();
        IConvertidor convertidor = iConvertidorInjector.getConvertidor();

        List<Product> productList = Stream.of(
                new Product("Pantalones campana",   1, convertidor),
                new Product("Faldas locas",         2, convertidor),
                new Product("Chaqueta LVT",         3, convertidor),
                new Product("Pantis religiosa", 13.99, convertidor))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.format("\n|---------- Conversión precio productos  --------------------------|%n");
        System.out.format("+----------------------+---------+---------+------------+----------+%n");
        System.out.format("| Producto             |  Euros  |   AED   |Rupiah Indo |USDollar  |%n");
        System.out.format("+----------------------+---------+---------+------------+----------+%n");
        for (Product product : productList
             ) {

            List<Double> exchangedCoins = product.exchangeCoins(coinList3);
            System.out.format("%-25s %6.3f %9.3f %13.3f %10.3f\n",
                    product.getItem(),product.getPrice(),exchangedCoins.get(0),exchangedCoins.get(1),exchangedCoins.get(2));
        }


        System.out.format("+----------------------+---------+---------+------------+----------+%n");
    }
}
