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

import schema.tables.AssessmentPeerworkflow;


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
public class AssessmentPeerworkflowRecord extends UpdatableRecordImpl<AssessmentPeerworkflowRecord> implements Record9<Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -872129380;

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.student_id</code>.
     */
    public void setStudentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.student_id</code>.
     */
    public String getStudentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.item_id</code>.
     */
    public void setItemId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.item_id</code>.
     */
    public String getItemId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.course_id</code>.
     */
    public void setCourseId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.submission_uuid</code>.
     */
    public void setSubmissionUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.submission_uuid</code>.
     */
    public String getSubmissionUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.completed_at</code>.
     */
    public void setCompletedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.completed_at</code>.
     */
    public Timestamp getCompletedAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.grading_completed_at</code>.
     */
    public void setGradingCompletedAt(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.grading_completed_at</code>.
     */
    public Timestamp getGradingCompletedAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_peerworkflow.cancelled_at</code>.
     */
    public void setCancelledAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_peerworkflow.cancelled_at</code>.
     */
    public Timestamp getCancelledAt() {
        return (Timestamp) get(8);
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
    public Row9<Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.SUBMISSION_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.COMPLETED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.GRADING_COMPLETED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW.CANCELLED_AT;
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
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSubmissionUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCompletedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getGradingCompletedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCancelledAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value2(String value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value3(String value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value4(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value5(String value) {
        setSubmissionUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value6(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value7(Timestamp value) {
        setCompletedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value8(Timestamp value) {
        setGradingCompletedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord value9(Timestamp value) {
        setCancelledAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflowRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached AssessmentPeerworkflowRecord
     */
    public AssessmentPeerworkflowRecord() {
        super(AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW);
    }

    /**
     * Create a detached, initialised AssessmentPeerworkflowRecord
     */
    public AssessmentPeerworkflowRecord(Integer id, String studentId, String itemId, String courseId, String submissionUuid, Timestamp createdAt, Timestamp completedAt, Timestamp gradingCompletedAt, Timestamp cancelledAt) {
        super(AssessmentPeerworkflow.ASSESSMENT_PEERWORKFLOW);

        set(0, id);
        set(1, studentId);
        set(2, itemId);
        set(3, courseId);
        set(4, submissionUuid);
        set(5, createdAt);
        set(6, completedAt);
        set(7, gradingCompletedAt);
        set(8, cancelledAt);
    }
}
