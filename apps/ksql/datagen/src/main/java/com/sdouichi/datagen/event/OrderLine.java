/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.sdouichi.datagen.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderLine extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3748356208111308753L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderLine\",\"namespace\":\"com.sdouichi.datagen.event\",\"fields\":[{\"name\":\"dish_id\",\"type\":\"long\",\"doc\":\"Dish's id\"},{\"name\":\"unit\",\"type\":\"int\",\"doc\":\"Unit\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderLine> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderLine> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderLine> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderLine> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderLine> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderLine to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderLine from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderLine instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderLine fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Dish's id */
  private long dish_id;
  /** Unit */
  private int unit;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderLine() {}

  /**
   * All-args constructor.
   * @param dish_id Dish's id
   * @param unit Unit
   */
  public OrderLine(java.lang.Long dish_id, java.lang.Integer unit) {
    this.dish_id = dish_id;
    this.unit = unit;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dish_id;
    case 1: return unit;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dish_id = (java.lang.Long)value$; break;
    case 1: unit = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'dish_id' field.
   * @return Dish's id
   */
  public long getDishId() {
    return dish_id;
  }


  /**
   * Sets the value of the 'dish_id' field.
   * Dish's id
   * @param value the value to set.
   */
  public void setDishId(long value) {
    this.dish_id = value;
  }

  /**
   * Gets the value of the 'unit' field.
   * @return Unit
   */
  public int getUnit() {
    return unit;
  }


  /**
   * Sets the value of the 'unit' field.
   * Unit
   * @param value the value to set.
   */
  public void setUnit(int value) {
    this.unit = value;
  }

  /**
   * Creates a new OrderLine RecordBuilder.
   * @return A new OrderLine RecordBuilder
   */
  public static com.sdouichi.datagen.event.OrderLine.Builder newBuilder() {
    return new com.sdouichi.datagen.event.OrderLine.Builder();
  }

  /**
   * Creates a new OrderLine RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderLine RecordBuilder
   */
  public static com.sdouichi.datagen.event.OrderLine.Builder newBuilder(com.sdouichi.datagen.event.OrderLine.Builder other) {
    if (other == null) {
      return new com.sdouichi.datagen.event.OrderLine.Builder();
    } else {
      return new com.sdouichi.datagen.event.OrderLine.Builder(other);
    }
  }

  /**
   * Creates a new OrderLine RecordBuilder by copying an existing OrderLine instance.
   * @param other The existing instance to copy.
   * @return A new OrderLine RecordBuilder
   */
  public static com.sdouichi.datagen.event.OrderLine.Builder newBuilder(com.sdouichi.datagen.event.OrderLine other) {
    if (other == null) {
      return new com.sdouichi.datagen.event.OrderLine.Builder();
    } else {
      return new com.sdouichi.datagen.event.OrderLine.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderLine instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderLine>
    implements org.apache.avro.data.RecordBuilder<OrderLine> {

    /** Dish's id */
    private long dish_id;
    /** Unit */
    private int unit;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.sdouichi.datagen.event.OrderLine.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dish_id)) {
        this.dish_id = data().deepCopy(fields()[0].schema(), other.dish_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.unit)) {
        this.unit = data().deepCopy(fields()[1].schema(), other.unit);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderLine instance
     * @param other The existing instance to copy.
     */
    private Builder(com.sdouichi.datagen.event.OrderLine other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.dish_id)) {
        this.dish_id = data().deepCopy(fields()[0].schema(), other.dish_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.unit)) {
        this.unit = data().deepCopy(fields()[1].schema(), other.unit);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'dish_id' field.
      * Dish's id
      * @return The value.
      */
    public long getDishId() {
      return dish_id;
    }


    /**
      * Sets the value of the 'dish_id' field.
      * Dish's id
      * @param value The value of 'dish_id'.
      * @return This builder.
      */
    public com.sdouichi.datagen.event.OrderLine.Builder setDishId(long value) {
      validate(fields()[0], value);
      this.dish_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dish_id' field has been set.
      * Dish's id
      * @return True if the 'dish_id' field has been set, false otherwise.
      */
    public boolean hasDishId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dish_id' field.
      * Dish's id
      * @return This builder.
      */
    public com.sdouichi.datagen.event.OrderLine.Builder clearDishId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'unit' field.
      * Unit
      * @return The value.
      */
    public int getUnit() {
      return unit;
    }


    /**
      * Sets the value of the 'unit' field.
      * Unit
      * @param value The value of 'unit'.
      * @return This builder.
      */
    public com.sdouichi.datagen.event.OrderLine.Builder setUnit(int value) {
      validate(fields()[1], value);
      this.unit = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'unit' field has been set.
      * Unit
      * @return True if the 'unit' field has been set, false otherwise.
      */
    public boolean hasUnit() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'unit' field.
      * Unit
      * @return This builder.
      */
    public com.sdouichi.datagen.event.OrderLine.Builder clearUnit() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderLine build() {
      try {
        OrderLine record = new OrderLine();
        record.dish_id = fieldSetFlags()[0] ? this.dish_id : (java.lang.Long) defaultValue(fields()[0]);
        record.unit = fieldSetFlags()[1] ? this.unit : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderLine>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderLine>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderLine>
    READER$ = (org.apache.avro.io.DatumReader<OrderLine>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.dish_id);

    out.writeInt(this.unit);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.dish_id = in.readLong();

      this.unit = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.dish_id = in.readLong();
          break;

        case 1:
          this.unit = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










