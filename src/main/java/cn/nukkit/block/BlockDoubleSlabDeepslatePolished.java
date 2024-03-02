package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;
import cn.nukkit.item.ItemTool;

/**
 * @author GoodLucky777
 */
public class BlockDoubleSlabDeepslatePolished extends BlockDoubleSlab {
    public BlockDoubleSlabDeepslatePolished() {
        this(0);
    }

    public BlockDoubleSlabDeepslatePolished(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return POLISHED_DEEPSLATE_DOUBLE_SLAB;
    }
    
    @Override
    public String getName() {
        return "Double Polished Deepslate Slab";
    }
    
    @Override
    public double getHardness() {
        return 3.5;
    }
    
    @Override
    public double getResistance() {
        return 6;
    }
    
    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }
    
    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe()) {
            return new Item[]{
                    new ItemBlock(Block.get(POLISHED_DEEPSLATE_SLAB), 0, 2)
            };
        } else {
            return new Item[0];
        }
    }

}
