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

import schema.tables.EmbargoEmbargoedcourse;


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
public class EmbargoEmbargoedcourseRecord extends UpdatableRecordImpl<EmbargoEmbargoedcourseRecord> implements Record3<Integer, String, Byte> {

    private static final long serialVersionUID = 1760966799;

    /**
     * Setter for <code>bitnami_edx.embargo_embargoedcourse.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.embargo_embargoedcourse.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.embargo_embargoedcourse.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.embargo_embargoedcourse.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.embargo_embargoedcourse.embargoed</code>.
     */
    public void setEmbargoed(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.embargo_embargoedcourse.embargoed</code>.
     */
    public Byte getEmbargoed() {
        return (Byte) get(2);
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
    public Row3<Integer, String, Byte> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Byte> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmbargoEmbargoedcourse.EMBARGO_EMBARGOEDCOURSE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmbargoEmbargoedcourse.EMBARGO_EMBARGOEDCOURSE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return EmbargoEmbargoedcourse.EMBARGO_EMBARGOEDCOURSE.EMBARGOED;
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
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getEmbargoed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmbargoEmbargoedcourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmbargoEmbargoedcourseRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmbargoEmbargoedcourseRecord value3(Byte value) {
        setEmbargoed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmbargoEmbargoedcourseRecord values(Integer value1, String value2, Byte value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmbargoEmbargoedcourseRecord
     */
    public EmbargoEmbargoedcourseRecord() {
        super(EmbargoEmbargoedcourse.EMBARGO_EMBARGOEDCOURSE);
    }

    /**
     * Create a detached, initialised EmbargoEmbargoedcourseRecord
     */
    public EmbargoEmbargoedcourseRecord(Integer id, String courseId, Byte embargoed) {
        super(EmbargoEmbargoedcourse.EMBARGO_EMBARGOEDCOURSE);

        set(0, id);
        set(1, courseId);
        set(2, embargoed);
    }
}
