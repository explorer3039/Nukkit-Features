package cn.nukkit.block;

/**
 * @author joserobjr
 * @since 2021-06-14
 */
public class BlockDoubleSlabCopperCutExposedWaxed extends BlockDoubleSlabCopperCutExposed {
    public BlockDoubleSlabCopperCutExposedWaxed() {
        this(0);
    }

    public BlockDoubleSlabCopperCutExposedWaxed(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB;
    }

}
