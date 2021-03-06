/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.VerifyStudentVerificationstatus;


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
public class VerifyStudentVerificationstatusRecord extends UpdatableRecordImpl<VerifyStudentVerificationstatusRecord> implements Record7<Integer, String, Timestamp, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1760525468;

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.status</code>.
     */
    public void setStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.status</code>.
     */
    public String getStatus() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.response</code>.
     */
    public void setResponse(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.response</code>.
     */
    public String getResponse() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.error</code>.
     */
    public void setError(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.error</code>.
     */
    public String getError() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.checkpoint_id</code>.
     */
    public void setCheckpointId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.checkpoint_id</code>.
     */
    public Integer getCheckpointId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.verify_student_verificationstatus.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.verify_student_verificationstatus.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, String, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.RESPONSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.ERROR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.CHECKPOINT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS.USER_ID;
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
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getResponse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getError();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCheckpointId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value2(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value3(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value4(String value) {
        setResponse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value5(String value) {
        setError(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value6(Integer value) {
        setCheckpointId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentVerificationstatusRecord values(Integer value1, String value2, Timestamp value3, String value4, String value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VerifyStudentVerificationstatusRecord
     */
    public VerifyStudentVerificationstatusRecord() {
        super(VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS);
    }

    /**
     * Create a detached, initialised VerifyStudentVerificationstatusRecord
     */
    public VerifyStudentVerificationstatusRecord(Integer id, String status, Timestamp timestamp, String response, String error, Integer checkpointId, Integer userId) {
        super(VerifyStudentVerificationstatus.VERIFY_STUDENT_VERIFICATIONSTATUS);

        set(0, id);
        set(1, status);
        set(2, timestamp);
        set(3, response);
        set(4, error);
        set(5, checkpointId);
        set(6, userId);
    }
}
