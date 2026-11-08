package org;

import coreforge.Decoder;
import coreforge.Kernel32;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kernel32 kernel32 = new Kernel32();
        var packs = new ArrayList<String>();
        packs.add("RV32I");
        Decoder decoder = new Decoder(kernel32, packs);

        int value = 0x007302B3;
        byte[] bytes = ByteBuffer.allocate(4).putInt(value).array();
        var res = decoder.parse(bytes);
        for (int i = 0; i < 100000; i++){
            res = decoder.parse(bytes);
            res.startPrecondition();
            res.startAction();
        }
        int y = 1;
    }
}