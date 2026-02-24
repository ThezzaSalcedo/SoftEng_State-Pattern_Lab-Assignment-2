public class ItemSelectedState implements VendingMachineState {

    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(double amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted: " + amount);
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing item...");
        machine.setState(machine.getDispensingState());
        machine.dispenseItem();  // Delegate to dispensing state
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}