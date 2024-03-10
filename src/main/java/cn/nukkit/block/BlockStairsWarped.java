package cn.nukkit.block;

/**
 * @author explorer_3039
 */
public class BlockStairsWarped extends BlockStairsWood {

    public BlockStairsWarped() {
        this(0);
    }

    public BlockStairsWarped(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return WARPED_WOOD_STAIRS;
    }

    @Override
    public String getName() {
        return "Warped Wood Stairs";
    }
}
