public class IdleState implements VendingMachineState {

    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Cannot insert coin. Select item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Cannot dispense. No item selected.");
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}