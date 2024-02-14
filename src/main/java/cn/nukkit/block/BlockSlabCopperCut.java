package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockSlabCopperCut extends BlockSlab {
    public BlockSlabCopperCut() {
        this(0);
    }

    public BlockSlabCopperCut(int meta) {
        super(meta, DOUBLE_CUT_COPPER_SLAB);
    }

    protected BlockSlabCopperCut(int meta, int doubleSlab) {
        super(meta, doubleSlab);
    }

    @Override
    public int getId() {
        return CUT_COPPER_SLAB;
    }

    public String getName() {
        return "Cut Copper Slab";
    }

}
