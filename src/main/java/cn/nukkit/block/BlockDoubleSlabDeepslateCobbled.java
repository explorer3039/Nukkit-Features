package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-15
 */
public class BlockDoubleSlabDeepslateCobbled extends BlockDoubleSlab {
    public BlockDoubleSlabDeepslateCobbled() {
        this(0);
    }

    public BlockDoubleSlabDeepslateCobbled(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return COBBLED_DEEPSLATE_DOUBLE_SLAB;
    }

    @Override
    public String getName() {
        return "Double Cobbled Deepslate Slab";
    }
    
    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe()) {
            return new Item[]{
                    Item.get(Item.COBBLED_DEEPSLATE_SLAB, 0, 2)
            };
        } else {
            return new Item[0];
        }
    }
}
