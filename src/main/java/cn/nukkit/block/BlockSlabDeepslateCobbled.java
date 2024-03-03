package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import cn.nukkit.item.ItemBlock;
/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockSlabDeepslateCobbled extends BlockSlab {
    public BlockSlabDeepslateCobbled() {
        this(0);
    }

    public BlockSlabDeepslateCobbled(int meta) {
        super(meta, COBBLED_DEEPSLATE_DOUBLE_SLAB);
    }

    @Override
    public int getId() {
        return COBBLED_DEEPSLATE_SLAB;
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
    public String getName() {
        return "Cobbled Deepslate Slab";
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
    public Item toItem() {
        return new ItemBlock(this, this.getDamage() & 0x07);
    }

}
