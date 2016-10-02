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

import schema.tables.UtilRatelimitconfiguration;


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
public class UtilRatelimitconfigurationRecord extends UpdatableRecordImpl<UtilRatelimitconfigurationRecord> implements Record4<Integer, Timestamp, Byte, Integer> {

    private static final long serialVersionUID = 713389447;

    /**
     * Setter for <code>bitnami_edx.util_ratelimitconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.util_ratelimitconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.util_ratelimitconfiguration.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.util_ratelimitconfiguration.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.util_ratelimitconfiguration.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.util_ratelimitconfiguration.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.util_ratelimitconfiguration.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.util_ratelimitconfiguration.changed_by_id</code>.
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
        return UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION.CHANGED_BY_ID;
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
    public UtilRatelimitconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UtilRatelimitconfigurationRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UtilRatelimitconfigurationRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UtilRatelimitconfigurationRecord value4(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UtilRatelimitconfigurationRecord values(Integer value1, Timestamp value2, Byte value3, Integer value4) {
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
     * Create a detached UtilRatelimitconfigurationRecord
     */
    public UtilRatelimitconfigurationRecord() {
        super(UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION);
    }

    /**
     * Create a detached, initialised UtilRatelimitconfigurationRecord
     */
    public UtilRatelimitconfigurationRecord(Integer id, Timestamp changeDate, Byte enabled, Integer changedById) {
        super(UtilRatelimitconfiguration.UTIL_RATELIMITCONFIGURATION);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, changedById);
    }
}
