public class OutOfOrderState implements VendingMachineState {

    private VendingMachine machine;

    public OutOfOrderState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Machine already out of order.");
    }
}