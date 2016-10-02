/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.DjceleryPeriodictasks;


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
public class DjceleryPeriodictasksRecord extends UpdatableRecordImpl<DjceleryPeriodictasksRecord> implements Record2<Short, Timestamp> {

    private static final long serialVersionUID = -1111071865;

    /**
     * Setter for <code>bitnami_edx.djcelery_periodictasks.ident</code>.
     */
    public void setIdent(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_periodictasks.ident</code>.
     */
    public Short getIdent() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_periodictasks.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_periodictasks.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, Timestamp> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Short, Timestamp> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return DjceleryPeriodictasks.DJCELERY_PERIODICTASKS.IDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DjceleryPeriodictasks.DJCELERY_PERIODICTASKS.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getIdent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryPeriodictasksRecord value1(Short value) {
        setIdent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryPeriodictasksRecord value2(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryPeriodictasksRecord values(Short value1, Timestamp value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjceleryPeriodictasksRecord
     */
    public DjceleryPeriodictasksRecord() {
        super(DjceleryPeriodictasks.DJCELERY_PERIODICTASKS);
    }

    /**
     * Create a detached, initialised DjceleryPeriodictasksRecord
     */
    public DjceleryPeriodictasksRecord(Short ident, Timestamp lastUpdate) {
        super(DjceleryPeriodictasks.DJCELERY_PERIODICTASKS);

        set(0, ident);
        set(1, lastUpdate);
    }
}