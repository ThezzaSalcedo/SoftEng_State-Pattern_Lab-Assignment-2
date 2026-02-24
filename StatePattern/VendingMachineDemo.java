public class VendingMachineDemo {
    public static void main(String[] args) {

        System.out.println("===== TEST 1: Idle Restrictions =====");
        VendingMachine machine1 = new VendingMachine();
        machine1.insertCoin(10);      // Should NOT allow
        machine1.dispenseItem();      // Should NOT allow


        System.out.println("\n===== TEST 2: Normal Purchase Flow =====");
        VendingMachine machine2 = new VendingMachine();
        machine2.selectItem();        // Move to ItemSelected
        machine2.insertCoin(10);      // Allowed
        machine2.dispenseItem();      // Dispense → back to Idle


        System.out.println("\n===== TEST 3: Double Selection Restriction =====");
        VendingMachine machine3 = new VendingMachine();
        machine3.selectItem();        // First selection
        machine3.selectItem();        // Should NOT allow


        System.out.println("\n===== TEST 4: Dispensing State Restriction =====");
        VendingMachine machine4 = new VendingMachine();
        machine4.selectItem();
        machine4.insertCoin(10);
        machine4.dispenseItem();      // Dispensing
        machine4.insertCoin(5);       // Should NOT allow (back to Idle)


        System.out.println("\n===== TEST 5: Out Of Order State =====");
        VendingMachine machine5 = new VendingMachine();
        machine5.setOutOfOrder();
        machine5.selectItem();        // Blocked
        machine5.insertCoin(10);      // Blocked
        machine5.dispenseItem();      // Blocked

    }
}
  