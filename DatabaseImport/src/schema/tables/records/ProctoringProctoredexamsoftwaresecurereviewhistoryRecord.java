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

import schema.tables.ProctoringProctoredexamsoftwaresecurereviewhistory;


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
public class ProctoringProctoredexamsoftwaresecurereviewhistoryRecord extends UpdatableRecordImpl<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> implements Record10<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 113284992;

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.attempt_code</code>.
     */
    public void setAttemptCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.attempt_code</code>.
     */
    public String getAttemptCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.review_status</code>.
     */
    public void setReviewStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.review_status</code>.
     */
    public String getReviewStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.raw_data</code>.
     */
    public void setRawData(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.raw_data</code>.
     */
    public String getRawData() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.video_url</code>.
     */
    public void setVideoUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.video_url</code>.
     */
    public String getVideoUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.exam_id</code>.
     */
    public void setExamId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.exam_id</code>.
     */
    public Integer getExamId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.reviewed_by_id</code>.
     */
    public void setReviewedById(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.reviewed_by_id</code>.
     */
    public Integer getReviewedById() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(9);
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
    public Row10<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.ATTEMPT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.REVIEW_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.RAW_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.VIDEO_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.EXAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.REVIEWED_BY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY.STUDENT_ID;
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
        return getAttemptCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReviewStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRawData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVideoUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getExamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getReviewedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value4(String value) {
        setAttemptCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value5(String value) {
        setReviewStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value6(String value) {
        setRawData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value7(String value) {
        setVideoUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value8(Integer value) {
        setExamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value9(Integer value) {
        setReviewedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord value10(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9, Integer value10) {
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
     * Create a detached ProctoringProctoredexamsoftwaresecurereviewhistoryRecord
     */
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord() {
        super(ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY);
    }

    /**
     * Create a detached, initialised ProctoringProctoredexamsoftwaresecurereviewhistoryRecord
     */
    public ProctoringProctoredexamsoftwaresecurereviewhistoryRecord(Integer id, Timestamp created, Timestamp modified, String attemptCode, String reviewStatus, String rawData, String videoUrl, Integer examId, Integer reviewedById, Integer studentId) {
        super(ProctoringProctoredexamsoftwaresecurereviewhistory.PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, attemptCode);
        set(4, reviewStatus);
        set(5, rawData);
        set(6, videoUrl);
        set(7, examId);
        set(8, reviewedById);
        set(9, studentId);
    }
}
