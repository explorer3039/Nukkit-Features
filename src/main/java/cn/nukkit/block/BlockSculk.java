package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

/**
 * @author explorer_3039
 */
public class BlockSculk extends BlockSolid {

    @Override
    public int getId() {
        return SCULK;
    }

    @Override
    public double getHardness() {
        return 0.6;
    }

    @Override
    public double getResistance() {
        return 0.6;
    }

    @Override
    public String getName() {
        return "Sculk";
    }
    
    @Override
    public Item[] getDrops(Item item) {
        if (item.hasEnchantment(Enchantment.ID_SILK_TOUCH)) {
             return new Item[]{this.toItem()};
        } else {
            return Item.EMPTY_ARRAY;
        }
    }
}
