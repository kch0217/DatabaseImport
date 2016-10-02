/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import schema.tables.AssessmentCriterion;


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
public class AssessmentCriterionRecord extends UpdatableRecordImpl<AssessmentCriterionRecord> implements Record6<Integer, String, String, UInteger, String, Integer> {

    private static final long serialVersionUID = -140883578;

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.label</code>.
     */
    public void setLabel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.label</code>.
     */
    public String getLabel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.order_num</code>.
     */
    public void setOrderNum(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.order_num</code>.
     */
    public UInteger getOrderNum() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.prompt</code>.
     */
    public void setPrompt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.prompt</code>.
     */
    public String getPrompt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.assessment_criterion.rubric_id</code>.
     */
    public void setRubricId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.assessment_criterion.rubric_id</code>.
     */
    public Integer getRubricId() {
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
    public Row6<Integer, String, String, UInteger, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, UInteger, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.LABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.PROMPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AssessmentCriterion.ASSESSMENT_CRITERION.RUBRIC_ID;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPrompt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRubricId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value3(String value) {
        setLabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value4(UInteger value) {
        setOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value5(String value) {
        setPrompt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord value6(Integer value) {
        setRubricId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterionRecord values(Integer value1, String value2, String value3, UInteger value4, String value5, Integer value6) {
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
     * Create a detached AssessmentCriterionRecord
     */
    public AssessmentCriterionRecord() {
        super(AssessmentCriterion.ASSESSMENT_CRITERION);
    }

    /**
     * Create a detached, initialised AssessmentCriterionRecord
     */
    public AssessmentCriterionRecord(Integer id, String name, String label, UInteger orderNum, String prompt, Integer rubricId) {
        super(AssessmentCriterion.ASSESSMENT_CRITERION);

        set(0, id);
        set(1, name);
        set(2, label);
        set(3, orderNum);
        set(4, prompt);
        set(5, rubricId);
    }
}