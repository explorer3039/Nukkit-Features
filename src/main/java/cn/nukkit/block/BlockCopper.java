package cn.nukkit.block;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopper extends BlockSolid {
    public BlockCopper() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Block of Copper";
    }

    @Override
    public int getId() {
        return COPPER_BLOCK;
    }
}
