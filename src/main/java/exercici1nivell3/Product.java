package exercici1nivell3;

import java.util.List;

public class Product {

    private String item;
    private double price;
    private IConvertidor convertidor;

    public Product(String item, double price, IConvertidor convertidor) {
        this.item = item;
        this.price = price;
        this.convertidor = convertidor;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public List<Double> exchangeCoins(List<Coin> coinList){

        return this.convertidor.exchangeCoin(coinList, this.price);
    }

}
