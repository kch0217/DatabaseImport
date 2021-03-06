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
import org.jooq.types.UInteger;

import schema.tables.AssessmentStudenttrainingworkflowitem;


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
public class AssessmentStudenttrainingworkflowitemRecord extends UpdatableRecordImpl<AssessmentStudenttrainingworkflowitemRecord> implements Record6<Integer, UInteger, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = -1807206651;

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.order_num</code>.
     */
    public void setOrderNum(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.order_num</code>.
     */
    public UInteger getOrderNum() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.started_at</code>.
     */
    public void setStartedAt(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.started_at</code>.
     */
    public Timestamp getStartedAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.completed_at</code>.
     */
    public void setCompletedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.completed_at</code>.
     */
    public Timestamp getCompletedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.training_example_id</code>.
     */
    public void setTrainingExampleId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.training_example_id</code>.
     */
    public Integer getTrainingExampleId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.workflow_id</code>.
     */
    public void setWorkflowId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_studenttrainingworkflowitem.workflow_id</code>.
     */
    public Integer getWorkflowId() {
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
    public Row6<Integer, UInteger, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, UInteger, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.STARTED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.COMPLETED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.TRAINING_EXAMPLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM.WORKFLOW_ID;
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
    public UInteger value2() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getStartedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCompletedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTrainingExampleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getWorkflowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value2(UInteger value) {
        setOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value3(Timestamp value) {
        setStartedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value4(Timestamp value) {
        setCompletedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value5(Integer value) {
        setTrainingExampleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord value6(Integer value) {
        setWorkflowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitemRecord values(Integer value1, UInteger value2, Timestamp value3, Timestamp value4, Integer value5, Integer value6) {
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
     * Create a detached AssessmentStudenttrainingworkflowitemRecord
     */
    public AssessmentStudenttrainingworkflowitemRecord() {
        super(AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM);
    }

    /**
     * Create a detached, initialised AssessmentStudenttrainingworkflowitemRecord
     */
    public AssessmentStudenttrainingworkflowitemRecord(Integer id, UInteger orderNum, Timestamp startedAt, Timestamp completedAt, Integer trainingExampleId, Integer workflowId) {
        super(AssessmentStudenttrainingworkflowitem.ASSESSMENT_STUDENTTRAININGWORKFLOWITEM);

        set(0, id);
        set(1, orderNum);
        set(2, startedAt);
        set(3, completedAt);
        set(4, trainingExampleId);
        set(5, workflowId);
    }
}
