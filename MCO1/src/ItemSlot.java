public class ItemSlot {
    private int slotNumber;
    private Item item;
    private int quantity;
    private final int capacity = 10;

    public ItemSlot (int slotNumber, Item item, int quantity) {
        if (slotNumber > 0) {
            this.slotNumber = slotNumber;
        }

        if (item != null) {
            this.item = item;
        }

        if (quantity > 0) {
            this.quantity = quantity;
        }

        else {
            this.quantity = 0;
        }
    }

    public boolean isAvailable () {
        return quantity > 0;
    }

    public void addStock (int qty) {
        if (qty > 0) {
            if (quantity + qty <= capacity) {
                quantity += qty;
            }

            else {
                System.out.println("Not enough items to have a slot");
            }
        }
    }

    public boolean removeStock (int qty) {
        if (qty <= quantity && qty > 0) {
            quantity -= qty;
            return true;
        }

        else {
            return false;
        }
    }

    public int getQuantity () {
        return this.quantity;
    }

    public Item getItem () {
        return this.item;
    }
}
