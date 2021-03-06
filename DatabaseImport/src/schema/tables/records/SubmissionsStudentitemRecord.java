/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.SubmissionsStudentitem;


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
public class SubmissionsStudentitemRecord extends UpdatableRecordImpl<SubmissionsStudentitemRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = -424032186;

    /**
     * Setter for <code>bitnami_edx.submissions_studentitem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_studentitem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_studentitem.student_id</code>.
     */
    public void setStudentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_studentitem.student_id</code>.
     */
    public String getStudentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_studentitem.course_id</code>.
     */
    public void setCourseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_studentitem.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_studentitem.item_id</code>.
     */
    public void setItemId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_studentitem.item_id</code>.
     */
    public String getItemId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_studentitem.item_type</code>.
     */
    public void setItemType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_studentitem.item_type</code>.
     */
    public String getItemType() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM.ITEM_TYPE;
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
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getItemType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord value2(String value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord value3(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord value4(String value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord value5(String value) {
        setItemType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitemRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubmissionsStudentitemRecord
     */
    public SubmissionsStudentitemRecord() {
        super(SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM);
    }

    /**
     * Create a detached, initialised SubmissionsStudentitemRecord
     */
    public SubmissionsStudentitemRecord(Integer id, String studentId, String courseId, String itemId, String itemType) {
        super(SubmissionsStudentitem.SUBMISSIONS_STUDENTITEM);

        set(0, id);
        set(1, studentId);
        set(2, courseId);
        set(3, itemId);
        set(4, itemType);
    }
}
