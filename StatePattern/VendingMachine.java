public class VendingMachine {

    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private VendingMachineState currentState;

    private int stock = 5;
    private double balance = 0.0;

    public VendingMachine() {
        idleState = new IdleState(this);
        itemSelectedState = new ItemSelectedState(this);
        dispensingState = new DispensingState(this);
        outOfOrderState = new OutOfOrderState(this);

        currentState = idleState;
    }

    // Delegation
    public void selectItem() { currentState.selectItem(); }
    public void insertCoin(double amount) { currentState.insertCoin(amount); }
    public void dispenseItem() { currentState.dispenseItem(); }
    public void setOutOfOrder() { currentState.setOutOfOrder(); }

    // State transition
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    // Getters
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }

    public int getStock() { return stock; }
    public void decreaseStock() { stock--; }

    public double getBalance() { return balance; }
    public void addBalance(double amount) { balance += amount; }
    public void resetBalance() { balance = 0.0; }
}