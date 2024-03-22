package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import cn.nukkit.level.particle.BoneMealParticle;
import cn.nukkit.level.Position;
import cn.nukkit.math.BlockFace;
import cn.nukkit.utils.BlockColor;
import java.util.Random;

public class BlockMoss extends BlockSolid {
    public BlockMoss() {
    }

    @Override
    public int getId() {
        return MOSS_BLOCK;
    }

    @Override
    public String getName() {
        return "Moss Block";
    }

    @Override
    public double getHardness() {
        return 0.1;
    }

    @Override
    public double getResistance() {
        return 0.5;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_SHOVEL;
    }

    @Override
    public boolean breaksWhenMoved() {
        return true;
    }

    @Override
    public boolean sticksToPiston() {
        return false;
    }

    @Override
    public boolean canBeActivated() {
        return true;
    }

    @Override
    public boolean onActivate(Item item, Player player) {
        if (item.getId() == Item.DYE && item.getDamage() == 0x0f) {
            if (player != null && !player.isCreative()) {
                item.count--;
            }

            level.addParticle(new BoneMealParticle(this));

            convertToMoss(this);
            return true;
        }

        return false;
    }
    
    public boolean canConvertToMoss(Block block) {
        int id = block.getId();
        return id == BlockID.GRASS ||
                id == BlockID.DIRT ||
                id == BlockID.DIRT_WITH_ROOTS ||
                id == BlockID.STONE ||
                id == BlockID.MYCELIUM ||
                id == BlockID.DEEPSLATE ||
                id == BlockID.TUFF;

    }
    
    public void convertToMoss(Position pos){
        Random random = new Random();
        for (double x = pos.x - 3; x <= pos.x + 3; x++) {
            for (double z = pos.z - 3; z <= pos.z + 3; z++) {
                for (double y = pos.y + 5; y >= pos.y - 5; y--) {
                    if (canConvertToMoss(pos.level.getBlock(new Position(x, y, z, pos.level))) && (random.nextDouble() < 0.6 || Math.abs(x-pos.x) < 3 && Math.abs(z-pos.z) < 3)) {
                        pos.level.setBlock(new Position(x, y, z, pos.level), Block.get(BlockID.MOSS_BLOCK));
                        break;
                    }
                }
            }
        }
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.GREEN_BLOCK_COLOR;
    }
}
