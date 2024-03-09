package cn.nukkit.block;

import cn.nukkit.item.Item;

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
        if (item.getEnchantment(Enchantment.ID_SILK_TOUCH) != null) {
            return super.getDrops(item);
        } else {
            return Item.EMPTY_ARRAY;
        }
    }
}
