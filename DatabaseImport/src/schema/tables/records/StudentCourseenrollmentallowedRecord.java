/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.StudentCourseenrollmentallowed;


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
public class StudentCourseenrollmentallowedRecord extends UpdatableRecordImpl<StudentCourseenrollmentallowedRecord> implements Record5<Integer, String, String, Byte, Timestamp> {

    private static final long serialVersionUID = -773081483;

    /**
     * Setter for <code>bitnami_edx.student_courseenrollmentallowed.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_courseenrollmentallowed.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.student_courseenrollmentallowed.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_courseenrollmentallowed.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.student_courseenrollmentallowed.course_id</code>.
     */
    public void setCourseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_courseenrollmentallowed.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.student_courseenrollmentallowed.auto_enroll</code>.
     */
    public void setAutoEnroll(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_courseenrollmentallowed.auto_enroll</code>.
     */
    public Byte getAutoEnroll() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.student_courseenrollmentallowed.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_courseenrollmentallowed.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(4);
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
    public Row5<Integer, String, String, Byte, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Byte, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED.AUTO_ENROLL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED.CREATED;
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
        return getEmail();
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
    public Byte value4() {
        return getAutoEnroll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord value3(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord value4(Byte value) {
        setAutoEnroll(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord value5(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseenrollmentallowedRecord values(Integer value1, String value2, String value3, Byte value4, Timestamp value5) {
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
     * Create a detached StudentCourseenrollmentallowedRecord
     */
    public StudentCourseenrollmentallowedRecord() {
        super(StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED);
    }

    /**
     * Create a detached, initialised StudentCourseenrollmentallowedRecord
     */
    public StudentCourseenrollmentallowedRecord(Integer id, String email, String courseId, Byte autoEnroll, Timestamp created) {
        super(StudentCourseenrollmentallowed.STUDENT_COURSEENROLLMENTALLOWED);

        set(0, id);
        set(1, email);
        set(2, courseId);
        set(3, autoEnroll);
        set(4, created);
    }
}