package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.network.protocol.ProtocolInfo;

public class ItemDoorMangrove extends StringItemBase {

    public ItemDoorMangrove() {
        this(0);
    }

    public ItemDoorMangrove(Integer meta) {
        this(meta, 1);
    }

    public ItemDoorMangrove(Integer meta, int count) {
        super("minecraft:mangrove_door", "Mangrove Door");
        this.block = Block.get(DARK_OAK_DOOR_BLOCK);
    }

    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_0;
    }
}
