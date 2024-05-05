package cn.nukkit.block;

public class BlockLogStrippedMangrove extends BlockWoodStripped {

    public BlockLogStrippedMangrove() {
        super(0);
    }

    public BlockLogStrippedMangrove(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return STRIPPED_MANGROVE_LOG;
    }

    @Override
    public String getName() {
        return "Stripped Mangrove Log";
    }

    @Override
    public double getResistance() {
        return 2;
    }
}