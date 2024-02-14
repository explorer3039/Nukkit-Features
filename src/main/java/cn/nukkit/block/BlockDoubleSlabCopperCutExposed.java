package cn.nukkit.block;


/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutExposed extends BlockDoubleSlabCopperCut {
    public BlockDoubleSlabCopperCutExposed() {
        this(0);
    }

    public BlockDoubleSlabCopperCutExposed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return EXPOSED_DOUBLE_CUT_COPPER_SLAB;
    }

}
