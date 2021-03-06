package tombenpotter.sanguimancy.util;

import net.minecraft.item.ItemStack;
import tombenpotter.sanguimancy.registry.BlocksRegistry;
import tombenpotter.sanguimancy.registry.ItemsRegistry;

public class SanguimancyItemstacks {

    // Items
    public static ItemStack unattunedPlayerSacrificer = new ItemStack(ItemsRegistry.playerSacrificer, 1, 0);
    public static ItemStack attunnedPlayerSacrificer = new ItemStack(ItemsRegistry.playerSacrificer, 1, 1);
    public static ItemStack focusedPlayerSacrificer = new ItemStack(ItemsRegistry.playerSacrificer, 1, 2);
    public static ItemStack addCorruption = new ItemStack(ItemsRegistry.soulCorruptionTest, 1, 0);
    public static ItemStack removeCorruption = new ItemStack(ItemsRegistry.soulCorruptionTest, 1, 1);
    public static ItemStack negateCorruption = new ItemStack(ItemsRegistry.soulCorruptionTest, 1, 2);
    public static ItemStack corruptionReader = new ItemStack(ItemsRegistry.soulCorruptionTest, 1, 3);

    // Blocks
    public static ItemStack altarEmitter = new ItemStack(BlocksRegistry.altarEmitter);
    public static ItemStack altarDiviner = new ItemStack(BlocksRegistry.altarDiviner);
    public static ItemStack sacrificeTransferrer = new ItemStack(BlocksRegistry.sacrificeTransfer);
    public static ItemStack diamondOreIllusion = new ItemStack(BlocksRegistry.illusion, 1, 0);
    public static ItemStack diamondBlockIllusion = new ItemStack(BlocksRegistry.illusion, 1, 1);
    public static ItemStack glowstoneIllusion = new ItemStack(BlocksRegistry.illusion, 1, 2);
    public static ItemStack netherrackIllusion = new ItemStack(BlocksRegistry.illusion, 1, 3);
    public static ItemStack quartzOreIllusion = new ItemStack(BlocksRegistry.illusion, 1, 4);
    public static ItemStack endStoneIllusion = new ItemStack(BlocksRegistry.illusion, 1, 5);
    public static ItemStack pinkWoolIllusion = new ItemStack(BlocksRegistry.illusion, 1, 6);
    public static ItemStack lavaIllusion = new ItemStack(BlocksRegistry.illusion, 1, 7);
    public static ItemStack jackOLanternIllusion = new ItemStack(BlocksRegistry.illusion, 1, 8);
    public static ItemStack bedrockIllusion = new ItemStack(BlocksRegistry.illusion, 1, 9);
    public static ItemStack obsidianIllusion = new ItemStack(BlocksRegistry.illusion, 1, 10);
    public static ItemStack glassIllusion = new ItemStack(BlocksRegistry.illusion, 1, 11);
    public static ItemStack snowIllusion = new ItemStack(BlocksRegistry.illusion, 1, 12);
    public static ItemStack melonIllusion = new ItemStack(BlocksRegistry.illusion, 1, 13);
    public static ItemStack goldBlockIllusion = new ItemStack(BlocksRegistry.illusion, 1, 14);
    public static ItemStack clayIllusion = new ItemStack(BlocksRegistry.illusion, 1, 15);
}
