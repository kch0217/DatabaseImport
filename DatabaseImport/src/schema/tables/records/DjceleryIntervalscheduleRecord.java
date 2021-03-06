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

import schema.tables.DjceleryIntervalschedule;


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
public class DjceleryIntervalscheduleRecord extends UpdatableRecordImpl<DjceleryIntervalscheduleRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1435198318;

    /**
     * Setter for <code>bitnami_edx.djcelery_intervalschedule.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_intervalschedule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_intervalschedule.every</code>.
     */
    public void setEvery(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_intervalschedule.every</code>.
     */
    public Integer getEvery() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_intervalschedule.period</code>.
     */
    public void setPeriod(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_intervalschedule.period</code>.
     */
    public String getPeriod() {
        return (String) get(2);
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
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjceleryIntervalschedule.DJCELERY_INTERVALSCHEDULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DjceleryIntervalschedule.DJCELERY_INTERVALSCHEDULE.EVERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DjceleryIntervalschedule.DJCELERY_INTERVALSCHEDULE.PERIOD;
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
    public Integer value2() {
        return getEvery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryIntervalscheduleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryIntervalscheduleRecord value2(Integer value) {
        setEvery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryIntervalscheduleRecord value3(String value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryIntervalscheduleRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjceleryIntervalscheduleRecord
     */
    public DjceleryIntervalscheduleRecord() {
        super(DjceleryIntervalschedule.DJCELERY_INTERVALSCHEDULE);
    }

    /**
     * Create a detached, initialised DjceleryIntervalscheduleRecord
     */
    public DjceleryIntervalscheduleRecord(Integer id, Integer every, String period) {
        super(DjceleryIntervalschedule.DJCELERY_INTERVALSCHEDULE);

        set(0, id);
        set(1, every);
        set(2, period);
    }
}
