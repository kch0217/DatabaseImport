/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.DjceleryWorkerstate;


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
public class DjceleryWorkerstateRecord extends UpdatableRecordImpl<DjceleryWorkerstateRecord> implements Record3<Integer, String, Timestamp> {

    private static final long serialVersionUID = 258229187;

    /**
     * Setter for <code>bitnami_edx.djcelery_workerstate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_workerstate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_workerstate.hostname</code>.
     */
    public void setHostname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_workerstate.hostname</code>.
     */
    public String getHostname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_workerstate.last_heartbeat</code>.
     */
    public void setLastHeartbeat(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_workerstate.last_heartbeat</code>.
     */
    public Timestamp getLastHeartbeat() {
        return (Timestamp) get(2);
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
    public Row3<Integer, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjceleryWorkerstate.DJCELERY_WORKERSTATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DjceleryWorkerstate.DJCELERY_WORKERSTATE.HOSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DjceleryWorkerstate.DJCELERY_WORKERSTATE.LAST_HEARTBEAT;
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
    public String value2() {
        return getHostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastHeartbeat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryWorkerstateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryWorkerstateRecord value2(String value) {
        setHostname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryWorkerstateRecord value3(Timestamp value) {
        setLastHeartbeat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryWorkerstateRecord values(Integer value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjceleryWorkerstateRecord
     */
    public DjceleryWorkerstateRecord() {
        super(DjceleryWorkerstate.DJCELERY_WORKERSTATE);
    }

    /**
     * Create a detached, initialised DjceleryWorkerstateRecord
     */
    public DjceleryWorkerstateRecord(Integer id, String hostname, Timestamp lastHeartbeat) {
        super(DjceleryWorkerstate.DJCELERY_WORKERSTATE);

        set(0, id);
        set(1, hostname);
        set(2, lastHeartbeat);
    }
}
