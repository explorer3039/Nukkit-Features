package cn.nukkit.item;

/**
 * @author explorer_3039
 */
public class ItemDiscFragment5 extends StringItemBase {

    public ItemDiscFragment5() {
        super("minecraft:disc_fragment_5", "Disc Fragment");
    }
    
    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_0;
    }
}
