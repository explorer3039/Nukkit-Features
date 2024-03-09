package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.item.EntityFallingBlock;
import cn.nukkit.item.Item;
import cn.nukkit.level.Position;
import cn.nukkit.math.BlockFace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockFrogSpawn extends BlockFlowable{

    @Override
    public String getName() {
        return "Frog Spawn";
    }

    @Override
    public int getId() {
        return FROG_SPAWN;
    }
    
    @Override
    public boolean place(Item item, Block block, Block target, BlockFace face, double fx, double fy, double fz, Player player) {
        if (target instanceof BlockWater) {
            Block up = target.up();
            if (up.getId() == Block.AIR) {
                this.getLevel().setBlock(up, this, true, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_NORMAL) {
            Block down = this.down();
            if (!(down instanceof BlockWater) && !(down.getLevelBlockAtLayer(1) instanceof BlockWater)) {
                this.getLevel().useBreakOn(this);
                return Level.BLOCK_UPDATE_NORMAL;
            }
        }
        return 0;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[0];
    }

    @Override
    public boolean canBePushed() {
        return false;
    }

    @Override
    public boolean canBePulled() {
        return false;
    }
}
