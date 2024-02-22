package cn.nukkit.item;

/**
 * @author explorer_3039
 */
public class ItemEchoShard extends StringItemBase {

    public ItemEchoShard() {
        super("minecraft:echo_shard", "Echo Shard");
    }
    
    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_0;
    }
}
