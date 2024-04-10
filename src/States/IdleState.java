package States;

// 3 states noCoinInserted -> coinInserted -> dispenseState -> noCoinState

public interface IdleState {

    public void  insertCoin(double amount);
    public void  pressButton(int pr);
    public void  dispense(int pr);
}
