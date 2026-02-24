public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Currently dispensing. Cannot insert coin.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed.");
        machine.decreaseStock();
        machine.resetBalance();

        // Automatic transition back to Idle
        machine.setState(machine.getIdleState());
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}