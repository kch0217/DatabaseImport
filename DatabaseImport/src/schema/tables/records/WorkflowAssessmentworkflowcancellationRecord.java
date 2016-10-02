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

import schema.tables.WorkflowAssessmentworkflowcancellation;


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
public class WorkflowAssessmentworkflowcancellationRecord extends UpdatableRecordImpl<WorkflowAssessmentworkflowcancellationRecord> implements Record5<Integer, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 1442397031;

    /**
     * Setter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.comments</code>.
     */
    public void setComments(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.comments</code>.
     */
    public String getComments() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.cancelled_by_id</code>.
     */
    public void setCancelledById(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.cancelled_by_id</code>.
     */
    public String getCancelledById() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.workflow_id</code>.
     */
    public void setWorkflowId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.workflow_assessmentworkflowcancellation.workflow_id</code>.
     */
    public Integer getWorkflowId() {
        return (Integer) get(4);
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
    public Row5<Integer, String, String, Timestamp, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION.CANCELLED_BY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION.WORKFLOW_ID;
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
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCancelledById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getWorkflowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord value2(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord value3(String value) {
        setCancelledById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord value5(Integer value) {
        setWorkflowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkflowAssessmentworkflowcancellationRecord values(Integer value1, String value2, String value3, Timestamp value4, Integer value5) {
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
     * Create a detached WorkflowAssessmentworkflowcancellationRecord
     */
    public WorkflowAssessmentworkflowcancellationRecord() {
        super(WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION);
    }

    /**
     * Create a detached, initialised WorkflowAssessmentworkflowcancellationRecord
     */
    public WorkflowAssessmentworkflowcancellationRecord(Integer id, String comments, String cancelledById, Timestamp createdAt, Integer workflowId) {
        super(WorkflowAssessmentworkflowcancellation.WORKFLOW_ASSESSMENTWORKFLOWCANCELLATION);

        set(0, id);
        set(1, comments);
        set(2, cancelledById);
        set(3, createdAt);
        set(4, workflowId);
    }
}