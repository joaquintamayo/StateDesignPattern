public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item has been selected. Insert coins.");
        machine.setState(new ItemSelectedState());
    }

    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Select an item first to insert coins.");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected to be dispensed.");
    }

    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is out of order.");
        machine.setState(new OutOfOrderState());
    }
}