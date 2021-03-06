package tombenpotter.sanguimancy.util;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class RandomUtils {

    public static void dropItems(World world, int x, int y, int z) {
        Random rand = new Random();

        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (!(tileEntity instanceof IInventory)) {
            return;
        }
        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack item = inventory.getStackInSlot(i);

            if (item != null && item.stackSize > 0) {
                float rx = rand.nextFloat() * 0.8F + 0.1F;
                float ry = rand.nextFloat() * 0.8F + 0.1F;
                float rz = rand.nextFloat() * 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.getItem(), item.stackSize, item.getItemDamage()));

                if (item.hasTagCompound()) {
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) item.getTagCompound().copy());
                }

                float factor = 0.05F;
                entityItem.motionX = rand.nextGaussian() * factor;
                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * factor;
                world.spawnEntityInWorld(entityItem);
                item.stackSize = 0;
            }
        }
    }

    public static boolean doesInventoryContain(EntityPlayer player, ItemStack stack) {
        return player.inventory.hasItemStack(stack);
    }

    public static ItemStack getItemInPlayerInv(EntityPlayer player, ItemStack stack) {
        int i;
        for (i = 0; i < player.inventory.armorInventory.length; ++i) {
            if (player.inventory.armorInventory[i] != null && player.inventory.armorInventory[i].isItemEqual(stack)) {
                return player.inventory.armorInventory[i];
            }
        }
        for (i = 0; i < player.inventory.mainInventory.length; ++i) {
            if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].isItemEqual(stack)) {
                return player.inventory.mainInventory[i];
            }
        }
        return null;
    }


}
