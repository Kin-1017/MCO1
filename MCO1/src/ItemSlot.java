public class ItemSlot {
    private int slotNumber;
    private Item item;
    private int quantity;
    private final int capacity = 10;

    public ItemSlot (int slotNumber, Item item, int quantity) {
        this.item = item;
        this.slotNumber = slotNumber;
        this.quantity = quantity;
    }

    public boolean isAvailable () {
        boolean available = false;
        if (quantity < capacity) {
            return available;
        }

        else {
            return !available;
        }
    }

    public void addStock (int qty) {

    }


}
