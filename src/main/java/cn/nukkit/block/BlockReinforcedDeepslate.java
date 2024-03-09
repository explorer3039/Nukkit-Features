package cn.nukkit.block;

public class BlockReinforcedDeepslate extends BlockSolid{
    @Override
    public String getName() {
        return "ReinForced DeepSlate";
    }

    @Override
    public int getId() {
        return REINFORCED_DEEPSLATE;
    }

    @Override
    public double getResistance() {
        return 1200.0;
    }
}
