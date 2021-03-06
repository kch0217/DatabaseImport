/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.VerifyStudentHistoricalverificationdeadline;


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
public class VerifyStudentHistoricalverificationdeadlineRecord extends UpdatableRecordImpl<VerifyStudentHistoricalverificationdeadlineRecord> implements Record10<Integer, Timestamp, Timestamp, String, Timestamp, Integer, Timestamp, String, Integer, Byte> {

    private static final long serialVersionUID = -2083691962;

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.course_key</code>.
     */
    public void setCourseKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.course_key</code>.
     */
    public String getCourseKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.deadline</code>.
     */
    public void setDeadline(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.deadline</code>.
     */
    public Timestamp getDeadline() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_id</code>.
     */
    public void setHistoryId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_id</code>.
     */
    public Integer getHistoryId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_date</code>.
     */
    public void setHistoryDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_date</code>.
     */
    public Timestamp getHistoryDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_type</code>.
     */
    public void setHistoryType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_type</code>.
     */
    public String getHistoryType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_user_id</code>.
     */
    public void setHistoryUserId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.history_user_id</code>.
     */
    public Integer getHistoryUserId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_historicalverificationdeadline.deadline_is_explicit</code>.
     */
    public void setDeadlineIsExplicit(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_historicalverificationdeadline.deadline_is_explicit</code>.
     */
    public Byte getDeadlineIsExplicit() {
        return (Byte) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, String, Timestamp, Integer, Timestamp, String, Integer, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, String, Timestamp, Integer, Timestamp, String, Integer, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.COURSE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.DEADLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.HISTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.HISTORY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.HISTORY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.HISTORY_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE.DEADLINE_IS_EXPLICIT;
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
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCourseKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getHistoryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getHistoryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getHistoryUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getDeadlineIsExplicit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value4(String value) {
        setCourseKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value5(Timestamp value) {
        setDeadline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value6(Integer value) {
        setHistoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value7(Timestamp value) {
        setHistoryDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value8(String value) {
        setHistoryType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value9(Integer value) {
        setHistoryUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord value10(Byte value) {
        setDeadlineIsExplicit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentHistoricalverificationdeadlineRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, Timestamp value5, Integer value6, Timestamp value7, String value8, Integer value9, Byte value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VerifyStudentHistoricalverificationdeadlineRecord
     */
    public VerifyStudentHistoricalverificationdeadlineRecord() {
        super(VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE);
    }

    /**
     * Create a detached, initialised VerifyStudentHistoricalverificationdeadlineRecord
     */
    public VerifyStudentHistoricalverificationdeadlineRecord(Integer id, Timestamp created, Timestamp modified, String courseKey, Timestamp deadline, Integer historyId, Timestamp historyDate, String historyType, Integer historyUserId, Byte deadlineIsExplicit) {
        super(VerifyStudentHistoricalverificationdeadline.VERIFY_STUDENT_HISTORICALVERIFICATIONDEADLINE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, courseKey);
        set(4, deadline);
        set(5, historyId);
        set(6, historyDate);
        set(7, historyType);
        set(8, historyUserId);
        set(9, deadlineIsExplicit);
    }
}
