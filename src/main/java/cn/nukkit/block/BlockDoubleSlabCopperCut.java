package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCut extends BlockDoubleSlab {
    public BlockDoubleSlabCopperCut() {
        this(0);
    }

    public BlockDoubleSlabCopperCut(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return DOUBLE_CUT_COPPER_SLAB;
    }

    @Override
    public String getName() {
        return "Double Cut Copper Slab";
    }
}
