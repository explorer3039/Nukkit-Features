package cn.nukkit.block;

public class BlockDoubleSlabBrickBlackstonePolished extends BlockDoubleSlabBlackstonePolished {
    public BlockDoubleSlabBrickBlackstonePolished() {
    
    }

    @Override
    public int getId() {
        return POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB;
    }

    @Override
    public String getName() {
        return "Polished Blackstone Brick";
    }

    @Override
    public double getHardness() {
        return 2;
    }
}
