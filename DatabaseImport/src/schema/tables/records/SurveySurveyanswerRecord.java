/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.SurveySurveyanswer;


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
public class SurveySurveyanswerRecord extends UpdatableRecordImpl<SurveySurveyanswerRecord> implements Record8<Integer, Timestamp, Timestamp, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = -125501155;

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.field_name</code>.
     */
    public void setFieldName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.field_name</code>.
     */
    public String getFieldName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.field_value</code>.
     */
    public void setFieldValue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.field_value</code>.
     */
    public String getFieldValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.course_key</code>.
     */
    public void setCourseKey(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.course_key</code>.
     */
    public String getCourseKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.form_id</code>.
     */
    public void setFormId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.form_id</code>.
     */
    public Integer getFormId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.survey_surveyanswer.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.survey_surveyanswer.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, Timestamp, String, String, String, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, Timestamp, String, String, String, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.FIELD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.FIELD_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.COURSE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.FORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SurveySurveyanswer.SURVEY_SURVEYANSWER.USER_ID;
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
        return getFieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFieldValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCourseKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value4(String value) {
        setFieldName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value5(String value) {
        setFieldValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value6(String value) {
        setCourseKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value7(Integer value) {
        setFormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord value8(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveySurveyanswerRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SurveySurveyanswerRecord
     */
    public SurveySurveyanswerRecord() {
        super(SurveySurveyanswer.SURVEY_SURVEYANSWER);
    }

    /**
     * Create a detached, initialised SurveySurveyanswerRecord
     */
    public SurveySurveyanswerRecord(Integer id, Timestamp created, Timestamp modified, String fieldName, String fieldValue, String courseKey, Integer formId, Integer userId) {
        super(SurveySurveyanswer.SURVEY_SURVEYANSWER);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, fieldName);
        set(4, fieldValue);
        set(5, courseKey);
        set(6, formId);
        set(7, userId);
    }
}
