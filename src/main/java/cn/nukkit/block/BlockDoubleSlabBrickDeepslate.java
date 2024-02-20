package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * @author GoodLucky777
 */
public class BlockDoubleSlabBrickDeepslate extends BlockDoubleSlab {
    public BlockDoubleSlabBrickDeepslate() {
        this(0);
    }

    protected BlockDoubleSlabBrickDeepslate(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return DEEPSLATE_BRICK_DOUBLE_SLAB;
    }

    @Override
    public String getName() {
        return "Double Deepslate Brick Slab";
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
                    Item.get(Item.DEEPSLATE_BRICK_SLAB, 0, 2)
            };
        } else {
            return new Item[0];
        }
    }

}
