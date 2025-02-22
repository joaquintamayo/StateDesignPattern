public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(3); 

        machine.selectItem();
        machine.insertCoin(5); 
        machine.insertCoin(5); 

        machine.selectItem();
        machine.insertCoin(10);

        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin(10);
    }
}
