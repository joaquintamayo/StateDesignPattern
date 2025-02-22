public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert coins.");
    }

    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted " + amount + " coins. Current balance: " + machine.getBalance());

        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Balance sufficient. Dispensing item...");
            machine.setState(new DispensingState());
            machine.getState().dispenseItem(machine);
        }
        else
        System.out.println("Item is out of stock!");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insufficient coins.");
    }

    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}