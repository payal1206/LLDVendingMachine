package States;

import vendingMachine.VendingMachine;

public class DispenseState implements  IdleState{
    VendingMachine vendingMachine;

    public  DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount){
        throw new IllegalStateException("No coin inserted");
    }

    @Override
    public void pressButton(int num){
        throw new IllegalStateException("No coin inserted");
    }

    @Override
    public  void dispense(int pr){

    }
}
