package exercici1nivell3;

import java.util.ArrayList;
import java.util.List;

// This is the dependency
public class Convertidor implements IConvertidor {


    @Override
    public List<Double> exchangeCoin(List<Coin> coinList, double price) {

        List<Double> listCoins = new ArrayList<>();
        for (Coin coin : coinList)
        {
            listCoins.add(coin.exchangeCoin() * price);
        }
        return listCoins;
    }
}
