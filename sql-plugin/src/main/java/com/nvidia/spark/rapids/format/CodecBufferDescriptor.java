// automatically generated by the FlatBuffers compiler, do not modify

package com.nvidia.spark.rapids.format;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Descriptor for a compressed buffer
 */
public final class CodecBufferDescriptor extends Table {
  public static CodecBufferDescriptor getRootAsCodecBufferDescriptor(ByteBuffer _bb) { return getRootAsCodecBufferDescriptor(_bb, new CodecBufferDescriptor()); }
  public static CodecBufferDescriptor getRootAsCodecBufferDescriptor(ByteBuffer _bb, CodecBufferDescriptor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public CodecBufferDescriptor __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * the compression codec used
   */
  public byte codec() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateCodec(byte codec) { int o = __offset(4); if (o != 0) { bb.put(o + bb_pos, codec); return true; } else { return false; } }
  /**
   * byte offset from the start of the enclosing compressed buffer
   * where the compressed data begins
   */
  public long compressedOffset() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateCompressedOffset(long compressed_offset) { int o = __offset(6); if (o != 0) { bb.putLong(o + bb_pos, compressed_offset); return true; } else { return false; } }
  /**
   * size of the compressed data in bytes
   */
  public long compressedSize() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateCompressedSize(long compressed_size) { int o = __offset(8); if (o != 0) { bb.putLong(o + bb_pos, compressed_size); return true; } else { return false; } }
  /**
   * byte offset from the start of the enclosing uncompressed buffer
   * where the uncompressed data should be written
   */
  public long uncompressedOffset() { int o = __offset(10); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateUncompressedOffset(long uncompressed_offset) { int o = __offset(10); if (o != 0) { bb.putLong(o + bb_pos, uncompressed_offset); return true; } else { return false; } }
  /**
   * size of the uncompressed data in bytes
   */
  public long uncompressedSize() { int o = __offset(12); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateUncompressedSize(long uncompressed_size) { int o = __offset(12); if (o != 0) { bb.putLong(o + bb_pos, uncompressed_size); return true; } else { return false; } }

  public static int createCodecBufferDescriptor(FlatBufferBuilder builder,
      byte codec,
      long compressed_offset,
      long compressed_size,
      long uncompressed_offset,
      long uncompressed_size) {
    builder.startObject(5);
    CodecBufferDescriptor.addUncompressedSize(builder, uncompressed_size);
    CodecBufferDescriptor.addUncompressedOffset(builder, uncompressed_offset);
    CodecBufferDescriptor.addCompressedSize(builder, compressed_size);
    CodecBufferDescriptor.addCompressedOffset(builder, compressed_offset);
    CodecBufferDescriptor.addCodec(builder, codec);
    return CodecBufferDescriptor.endCodecBufferDescriptor(builder);
  }

  public static void startCodecBufferDescriptor(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addCodec(FlatBufferBuilder builder, byte codec) { builder.addByte(0, codec, 0); }
  public static void addCompressedOffset(FlatBufferBuilder builder, long compressedOffset) { builder.addLong(1, compressedOffset, 0L); }
  public static void addCompressedSize(FlatBufferBuilder builder, long compressedSize) { builder.addLong(2, compressedSize, 0L); }
  public static void addUncompressedOffset(FlatBufferBuilder builder, long uncompressedOffset) { builder.addLong(3, uncompressedOffset, 0L); }
  public static void addUncompressedSize(FlatBufferBuilder builder, long uncompressedSize) { builder.addLong(4, uncompressedSize, 0L); }
  public static int endCodecBufferDescriptor(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

