package cn.nukkit.block;

public class BlockRealUnknown extends BlockSolid {

    @Override
    public int getId() {
        return UNKNOWN;
    }

    @Override
    public String getName() {
        return "Unknown Block";
    }
    
    @Override
    public double getHardness() {
        return 0;
    }
}
