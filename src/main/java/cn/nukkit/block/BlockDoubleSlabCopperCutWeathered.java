package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutWeathered extends BlockDoubleSlabCopperCut {
    public BlockDoubleSlabCopperCutWeathered() {
        this(0);
    }

    public BlockDoubleSlabCopperCutWeathered(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WEATHERED_DOUBLE_CUT_COPPER_SLAB;
    }

}
