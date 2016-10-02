/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.ProctoringProctoredexamstudentattemptcomment;


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
public class ProctoringProctoredexamstudentattemptcommentRecord extends UpdatableRecordImpl<ProctoringProctoredexamstudentattemptcommentRecord> implements Record9<Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer> {

    private static final long serialVersionUID = -1246235889;

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.start_time</code>.
     */
    public void setStartTime(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.start_time</code>.
     */
    public Integer getStartTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.stop_time</code>.
     */
    public void setStopTime(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.stop_time</code>.
     */
    public Integer getStopTime() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.duration</code>.
     */
    public void setDuration(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.duration</code>.
     */
    public Integer getDuration() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.comment</code>.
     */
    public void setComment(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.comment</code>.
     */
    public String getComment() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.status</code>.
     */
    public void setStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.status</code>.
     */
    public String getStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.review_id</code>.
     */
    public void setReviewId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamstudentattemptcomment.review_id</code>.
     */
    public Integer getReviewId() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.STOP_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT.REVIEW_ID;
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
    public Integer value4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStopTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getReviewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value4(Integer value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value5(Integer value) {
        setStopTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value6(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value7(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value8(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord value9(Integer value) {
        setReviewId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamstudentattemptcommentRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, Integer value5, Integer value6, String value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProctoringProctoredexamstudentattemptcommentRecord
     */
    public ProctoringProctoredexamstudentattemptcommentRecord() {
        super(ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT);
    }

    /**
     * Create a detached, initialised ProctoringProctoredexamstudentattemptcommentRecord
     */
    public ProctoringProctoredexamstudentattemptcommentRecord(Integer id, Timestamp created, Timestamp modified, Integer startTime, Integer stopTime, Integer duration, String comment, String status, Integer reviewId) {
        super(ProctoringProctoredexamstudentattemptcomment.PROCTORING_PROCTOREDEXAMSTUDENTATTEMPTCOMMENT);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, startTime);
        set(4, stopTime);
        set(5, duration);
        set(6, comment);
        set(7, status);
        set(8, reviewId);
    }
}