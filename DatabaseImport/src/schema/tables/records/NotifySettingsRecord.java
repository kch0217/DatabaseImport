/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.NotifySettings;


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
public class NotifySettingsRecord extends UpdatableRecordImpl<NotifySettingsRecord> implements Record3<Integer, Short, Integer> {

    private static final long serialVersionUID = -822433395;

    /**
     * Setter for <code>bitnami_edx.notify_settings.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.notify_settings.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.notify_settings.interval</code>.
     */
    public void setInterval(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.notify_settings.interval</code>.
     */
    public Short getInterval() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.notify_settings.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.notify_settings.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Short, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Short, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NotifySettings.NOTIFY_SETTINGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return NotifySettings.NOTIFY_SETTINGS.INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return NotifySettings.NOTIFY_SETTINGS.USER_ID;
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
    public Short value2() {
        return getInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotifySettingsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotifySettingsRecord value2(Short value) {
        setInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotifySettingsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotifySettingsRecord values(Integer value1, Short value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotifySettingsRecord
     */
    public NotifySettingsRecord() {
        super(NotifySettings.NOTIFY_SETTINGS);
    }

    /**
     * Create a detached, initialised NotifySettingsRecord
     */
    public NotifySettingsRecord(Integer id, Short interval, Integer userId) {
        super(NotifySettings.NOTIFY_SETTINGS);

        set(0, id);
        set(1, interval);
        set(2, userId);
    }
}
