public class ItemSlot {
    private int slotNumber;
    private Item item;
    private int quantity;
    private final int capacity = 10;

    public ItemSlot (int slotNumber, int quantity, boolean available) {
        this.slotNumber = slotNumber;
        this.quantity = quantity;
    }
}
