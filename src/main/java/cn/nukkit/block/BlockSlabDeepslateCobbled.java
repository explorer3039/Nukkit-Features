package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
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
    public String getName() {
        return "Cobbled Deepslate Slab";
    }
    
    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= ItemTool.TIER_WOODEN) {
            return new Item[]{
                    toItem()
            };
        } else {
            return Item.EMPTY_ARRAY;
        }
    }

}
