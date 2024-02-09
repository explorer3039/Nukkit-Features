package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;
import cn.nukkit.item.ItemTool;
import cn.nukkit.math.BlockFace;
import org.jetbrains.annotations.NotNull;


/**
 * @author LoboMetalurgico
 * @since 08/06/2021
 */

public class BlockDeepslate extends BlockSolid {

    private static final short[] faces = new short[]{
            0,
            0,
            2,
            2,
            1,
            1
    };

    public BlockDeepslate() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Deepslate";
    }

    @Override
    public int getId() {
        return DEEPSLATE;
    }

    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe()) {
            return new Item[]{
                    Item.get(Item.COBBLED_DEEPSLATE)
            };
        } else {
            return new Item[0];
        }
    }

    @Override
    public boolean canSilkTouch() {
        return true;
    }

    @Override
    public boolean place(Item item, Block block, Block target, BlockFace face, double fx, double fy, double fz, Player player) {
        this.setDamage(((this.getDamage() & 0x03) | faces[face.getIndex()]));
        this.getLevel().setBlock(block, this, true, true);

        return true;
    }
}
