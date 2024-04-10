package States;

import vendingMachine.VendingMachine;

public class NoCoinInserted implements IdleState{
    VendingMachine vendingMachine;

    public  NoCoinInserted(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount){
        vendingMachine.setAmount(amount);
        vendingMachine.setCurrVendingMachineState(vendingMachine.getCoinInserted());
    }
    @Override
    public void pressButton(int num){
        throw new IllegalStateException("No coin inserted");
    }

    @Override
    public  void dispense(int pr){
        throw new IllegalStateException("No coin inserted");
    }

}
