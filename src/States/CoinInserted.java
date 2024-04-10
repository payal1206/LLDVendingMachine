package States;

import vendingMachine.VendingMachine;

public class CoinInserted implements IdleState {
    VendingMachine vendingMachine;

    public  CoinInserted(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount){
        vendingMachine.setAmount(amount + vendingMachine.getAmount());
    }

    @Override
    public void pressButton(int num){
//        if(vendingMachine.getAmount() < )

    }
    @Override
    public  void dispense(int pr){
        throw new IllegalStateException("No coin inserted");
    }
}
