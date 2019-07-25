package com.denizenscript.depenizen.bungee.packets.out;

import com.denizenscript.depenizen.bungee.PacketOut;
import io.netty.buffer.ByteBuf;

import java.util.UUID;

public class PlayerSwitchServerPacketOut extends PacketOut {

    public String name;

    public UUID uuid;

    public String newServer;

    @Override
    public int getPacketId() {
        return 55;
    }

    @Override
    public void writeTo(ByteBuf buf) {
        buf.writeLong(uuid.getMostSignificantBits());
        buf.writeLong(uuid.getLeastSignificantBits());
        writeString(buf, name);
        writeString(buf, newServer);
    }
}
