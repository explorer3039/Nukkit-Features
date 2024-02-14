package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * @author GoodLucky777
 */
public class BlockInfestedDeepslate extends BlockDeepslate {

    public BlockInfestedDeepslate() {
        this(0);
    }

    public BlockInfestedDeepslate(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return INFESTED_DEEPSLATE;
    }
    
    @Override
    public String getName() {
        return "Infested Deepslate";
    }
    
    @Override
    public double getHardness() {
        return 0;
    }
    
    @Override
    public double getResistance() {
        return 0.75;
    }
    
    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }
    
    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }
    
    @Override
    public Item[] getDrops(Item item) {
        return Item.EMPTY_ARRAY;
    }

}
