/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.SubmissionsScoresummary;


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
public class SubmissionsScoresummaryRecord extends UpdatableRecordImpl<SubmissionsScoresummaryRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 426435309;

    /**
     * Setter for <code>bitnami_edx.submissions_scoresummary.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoresummary.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoresummary.highest_id</code>.
     */
    public void setHighestId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoresummary.highest_id</code>.
     */
    public Integer getHighestId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoresummary.latest_id</code>.
     */
    public void setLatestId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoresummary.latest_id</code>.
     */
    public Integer getLatestId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.submissions_scoresummary.student_item_id</code>.
     */
    public void setStudentItemId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.submissions_scoresummary.student_item_id</code>.
     */
    public Integer getStudentItemId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY.HIGHEST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY.LATEST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY.STUDENT_ITEM_ID;
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
        return getHighestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLatestId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStudentItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoresummaryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoresummaryRecord value2(Integer value) {
        setHighestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoresummaryRecord value3(Integer value) {
        setLatestId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoresummaryRecord value4(Integer value) {
        setStudentItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoresummaryRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubmissionsScoresummaryRecord
     */
    public SubmissionsScoresummaryRecord() {
        super(SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY);
    }

    /**
     * Create a detached, initialised SubmissionsScoresummaryRecord
     */
    public SubmissionsScoresummaryRecord(Integer id, Integer highestId, Integer latestId, Integer studentItemId) {
        super(SubmissionsScoresummary.SUBMISSIONS_SCORESUMMARY);

        set(0, id);
        set(1, highestId);
        set(2, latestId);
        set(3, studentItemId);
    }
}