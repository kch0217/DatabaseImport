/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.AssessmentAssessmentfeedbackOptions;


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
public class AssessmentAssessmentfeedbackOptionsRecord extends UpdatableRecordImpl<AssessmentAssessmentfeedbackOptionsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -912245640;

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentfeedback_options.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentfeedback_options.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentfeedback_options.assessmentfeedback_id</code>.
     */
    public void setAssessmentfeedbackId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentfeedback_options.assessmentfeedback_id</code>.
     */
    public Integer getAssessmentfeedbackId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentfeedback_options.assessmentfeedbackoption_id</code>.
     */
    public void setAssessmentfeedbackoptionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentfeedback_options.assessmentfeedbackoption_id</code>.
     */
    public Integer getAssessmentfeedbackoptionId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssessmentAssessmentfeedbackOptions.ASSESSMENT_ASSESSMENTFEEDBACK_OPTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AssessmentAssessmentfeedbackOptions.ASSESSMENT_ASSESSMENTFEEDBACK_OPTIONS.ASSESSMENTFEEDBACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AssessmentAssessmentfeedbackOptions.ASSESSMENT_ASSESSMENTFEEDBACK_OPTIONS.ASSESSMENTFEEDBACKOPTION_ID;
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
    public Integer value2() {
        return getAssessmentfeedbackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAssessmentfeedbackoptionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedbackOptionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedbackOptionsRecord value2(Integer value) {
        setAssessmentfeedbackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedbackOptionsRecord value3(Integer value) {
        setAssessmentfeedbackoptionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedbackOptionsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssessmentAssessmentfeedbackOptionsRecord
     */
    public AssessmentAssessmentfeedbackOptionsRecord() {
        super(AssessmentAssessmentfeedbackOptions.ASSESSMENT_ASSESSMENTFEEDBACK_OPTIONS);
    }

    /**
     * Create a detached, initialised AssessmentAssessmentfeedbackOptionsRecord
     */
    public AssessmentAssessmentfeedbackOptionsRecord(Integer id, Integer assessmentfeedbackId, Integer assessmentfeedbackoptionId) {
        super(AssessmentAssessmentfeedbackOptions.ASSESSMENT_ASSESSMENTFEEDBACK_OPTIONS);

        set(0, id);
        set(1, assessmentfeedbackId);
        set(2, assessmentfeedbackoptionId);
    }
}
