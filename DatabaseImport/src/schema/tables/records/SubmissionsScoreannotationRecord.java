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

import schema.tables.SubmissionsScoreannotation;


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
public class SubmissionsScoreannotationRecord extends UpdatableRecordImpl<SubmissionsScoreannotationRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 113601543;

    /**
     * Setter for <code>bitnami_edx.submissions_scoreannotation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoreannotation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoreannotation.annotation_type</code>.
     */
    public void setAnnotationType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoreannotation.annotation_type</code>.
     */
    public String getAnnotationType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoreannotation.creator</code>.
     */
    public void setCreator(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoreannotation.creator</code>.
     */
    public String getCreator() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoreannotation.reason</code>.
     */
    public void setReason(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoreannotation.reason</code>.
     */
    public String getReason() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoreannotation.score_id</code>.
     */
    public void setScoreId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoreannotation.score_id</code>.
     */
    public Integer getScoreId() {
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
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION.ANNOTATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION.SCORE_ID;
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
        return getAnnotationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getScoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord value2(String value) {
        setAnnotationType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord value3(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord value4(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord value5(Integer value) {
        setScoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotationRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached SubmissionsScoreannotationRecord
     */
    public SubmissionsScoreannotationRecord() {
        super(SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION);
    }

    /**
     * Create a detached, initialised SubmissionsScoreannotationRecord
     */
    public SubmissionsScoreannotationRecord(Integer id, String annotationType, String creator, String reason, Integer scoreId) {
        super(SubmissionsScoreannotation.SUBMISSIONS_SCOREANNOTATION);

        set(0, id);
        set(1, annotationType);
        set(2, creator);
        set(3, reason);
        set(4, scoreId);
    }
}
