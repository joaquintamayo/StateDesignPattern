public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }

    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed.");
        machine.reduceInventory();
        machine.resetBalance();
        machine.setState(new IdleState());
        System.out.println("Machine is now idle.");
    }

    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
}
