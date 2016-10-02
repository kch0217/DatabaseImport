/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.ShoppingcartDonationconfiguration;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShoppingcartDonationconfigurationRecord extends UpdatableRecordImpl<ShoppingcartDonationconfigurationRecord> implements Record4<Integer, Timestamp, Byte, Integer> {

    private static final long serialVersionUID = -1249018705;

    /**
     * Setter for <code>bitnami_edx.shoppingcart_donationconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_donationconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_donationconfiguration.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_donationconfiguration.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_donationconfiguration.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_donationconfiguration.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.shoppingcart_donationconfiguration.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.shoppingcart_donationconfiguration.changed_by_id</code>.
     */
    public Integer getChangedById() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, Byte, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, Byte, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION.CHANGED_BY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getChangeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartDonationconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartDonationconfigurationRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartDonationconfigurationRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartDonationconfigurationRecord value4(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShoppingcartDonationconfigurationRecord values(Integer value1, Timestamp value2, Byte value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShoppingcartDonationconfigurationRecord
     */
    public ShoppingcartDonationconfigurationRecord() {
        super(ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION);
    }

    /**
     * Create a detached, initialised ShoppingcartDonationconfigurationRecord
     */
    public ShoppingcartDonationconfigurationRecord(Integer id, Timestamp changeDate, Byte enabled, Integer changedById) {
        super(ShoppingcartDonationconfiguration.SHOPPINGCART_DONATIONCONFIGURATION);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, changedById);
    }
}