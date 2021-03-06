/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.AssessmentAssessmentpart;


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
public class AssessmentAssessmentpartRecord extends UpdatableRecordImpl<AssessmentAssessmentpartRecord> implements Record5<Integer, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1042659051;

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentpart.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentpart.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentpart.feedback</code>.
     */
    public void setFeedback(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentpart.feedback</code>.
     */
    public String getFeedback() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentpart.assessment_id</code>.
     */
    public void setAssessmentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentpart.assessment_id</code>.
     */
    public Integer getAssessmentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentpart.criterion_id</code>.
     */
    public void setCriterionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentpart.criterion_id</code>.
     */
    public Integer getCriterionId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_assessmentpart.option_id</code>.
     */
    public void setOptionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_assessmentpart.option_id</code>.
     */
    public Integer getOptionId() {
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
    public Row5<Integer, String, Integer, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART.FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART.ASSESSMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART.CRITERION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART.OPTION_ID;
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
        return getFeedback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAssessmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCriterionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOptionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord value2(String value) {
        setFeedback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord value3(Integer value) {
        setAssessmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord value4(Integer value) {
        setCriterionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord value5(Integer value) {
        setOptionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentpartRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5) {
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
     * Create a detached AssessmentAssessmentpartRecord
     */
    public AssessmentAssessmentpartRecord() {
        super(AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART);
    }

    /**
     * Create a detached, initialised AssessmentAssessmentpartRecord
     */
    public AssessmentAssessmentpartRecord(Integer id, String feedback, Integer assessmentId, Integer criterionId, Integer optionId) {
        super(AssessmentAssessmentpart.ASSESSMENT_ASSESSMENTPART);

        set(0, id);
        set(1, feedback);
        set(2, assessmentId);
        set(3, criterionId);
        set(4, optionId);
    }
}
