package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutOxidized extends BlockDoubleSlabCopperCut {
    public BlockDoubleSlabCopperCutOxidized() {
        this(0);
    }

    public BlockDoubleSlabCopperCutOxidized(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return OXIDIZED_DOUBLE_CUT_COPPER_SLAB;
    }

}
