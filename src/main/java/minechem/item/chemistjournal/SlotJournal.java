package minechem.item.chemistjournal;

import minechem.MinechemItemGeneration;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotJournal extends Slot
{

    public SlotJournal(IInventory par1iInventory, int par2, int par3, int par4)
    {
        super(par1iInventory, par2, par3, par4);
    }

    @Override
    public boolean isItemValid(ItemStack itemstack)
    {
        return itemstack.itemID == MinechemItemGeneration.journal.itemID;
    }

    @Override
    public int getSlotStackLimit()
    {
        return 1;
    }

}
