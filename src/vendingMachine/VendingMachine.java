package vendingMachine;

import Inventory.Inventory;
import States.CoinInserted;
import States.DispenseState;
import States.IdleState;
import States.NoCoinInserted;

public class VendingMachine {
    private NoCoinInserted noCoinInserted;
    private CoinInserted coinInserted;
    private DispenseState dispenseState;
    private IdleState currVendingMachineState;

    private Inventory inventory;
    private double amount;
    private static final int product = 2;

    public VendingMachine(){
        noCoinInserted = new NoCoinInserted(this);
        coinInserted =  new CoinInserted(this);
        dispenseState = new DispenseState(this);
        currVendingMachineState = noCoinInserted;
        amount = 0.0;
        inventory = new Inventory(product);
    }
     public boolean insufficientAmount(double exA){
        return exA <= this.amount;
     }
      // getters and setters method
     public NoCoinInserted getNoCoinInserted(){
        return noCoinInserted;
     }

     public void setNoCoinInserted(NoCoinInserted noCoinInserted){
        this.noCoinInserted = noCoinInserted;
     }

     public  CoinInserted getCoinInserted(){
        return coinInserted;
     }

    public void setCoinInserted(CoinInserted coinInserted) {
        this.coinInserted = coinInserted;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public IdleState getCurrVendingMachineState() {
        return currVendingMachineState;
    }

    public void setCurrVendingMachineState(IdleState currVendingMachineState) {
        this.currVendingMachineState = currVendingMachineState;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void insertCoin(double amount){
        this.currVendingMachineState.insertCoin(amount);
        System.out.println("coin Inserted");
    }

    public void pressButton(int product){
        this.currVendingMachineState.pressButton(product);
        this.currVendingMachineState.dispense(product);
    }
//
//    public  void addProduct(Product product){
//
//    }
}
