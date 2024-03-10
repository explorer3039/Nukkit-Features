package cn.nukkit.block;

/**
 * @author explorer_3039
 */
public class BlockStairsCrimson extends BlockStairsWood {

    public BlockStairsCrimson() {
        this(0);
    }

    public BlockStairsCrimson(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return CRIMSON_WOOD_STAIRS;
    }

    @Override
    public String getName() {
        return "Crimson Wood Stairs";
    }
}
