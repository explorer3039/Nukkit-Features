package cn.nukkit.block;

/**
 * Created by PetteriM1
 */
public class BlockInfoUpdate extends BlockSolid {

    @Override
    public int getId() {
        return INFO_UPDATE;
    }

    @Override
    public String getName() {
        return "Update Game Block";
    }
    
    @Override
    public double getResistance() {
        return 2.5;
    }

    @Override
    public double getHardness() {
        return 0.5;
    }
}
