/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.StudentEntranceexamconfiguration;


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
public class StudentEntranceexamconfigurationRecord extends UpdatableRecordImpl<StudentEntranceexamconfigurationRecord> implements Record6<Integer, String, Timestamp, Timestamp, Byte, Integer> {

    private static final long serialVersionUID = -801452098;

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.skip_entrance_exam</code>.
     */
    public void setSkipEntranceExam(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.skip_entrance_exam</code>.
     */
    public Byte getSkipEntranceExam() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.student_entranceexamconfiguration.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_entranceexamconfiguration.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Timestamp, Timestamp, Byte, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Timestamp, Timestamp, Byte, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.SKIP_ENTRANCE_EXAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION.USER_ID;
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
    public Timestamp value3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getSkipEntranceExam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value3(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value4(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value5(Byte value) {
        setSkipEntranceExam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEntranceexamconfigurationRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, Byte value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentEntranceexamconfigurationRecord
     */
    public StudentEntranceexamconfigurationRecord() {
        super(StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION);
    }

    /**
     * Create a detached, initialised StudentEntranceexamconfigurationRecord
     */
    public StudentEntranceexamconfigurationRecord(Integer id, String courseId, Timestamp created, Timestamp updated, Byte skipEntranceExam, Integer userId) {
        super(StudentEntranceexamconfiguration.STUDENT_ENTRANCEEXAMCONFIGURATION);

        set(0, id);
        set(1, courseId);
        set(2, created);
        set(3, updated);
        set(4, skipEntranceExam);
        set(5, userId);
    }
}
