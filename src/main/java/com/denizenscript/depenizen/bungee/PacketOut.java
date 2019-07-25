package com.denizenscript.depenizen.bungee;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;

public abstract class PacketOut {

    public abstract int getPacketId();

    public abstract void writeTo(ByteBuf buf);

    public void writeString(ByteBuf buf, String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        buf.writeInt(bytes.length);
        buf.writeBytes(bytes);
    }
}
