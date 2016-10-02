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

import schema.tables.CoursewareOfflinecomputedgrade;


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
public class CoursewareOfflinecomputedgradeRecord extends UpdatableRecordImpl<CoursewareOfflinecomputedgradeRecord> implements Record6<Integer, String, Timestamp, Timestamp, String, Integer> {

    private static final long serialVersionUID = 1015236184;

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.gradeset</code>.
     */
    public void setGradeset(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.gradeset</code>.
     */
    public String getGradeset() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_offlinecomputedgrade.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_offlinecomputedgrade.user_id</code>.
     */
    public Integer getUserId() {
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
    public Row6<Integer, String, Timestamp, Timestamp, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Timestamp, Timestamp, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.GRADESET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE.USER_ID;
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
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGradeset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value3(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value4(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value5(String value) {
        setGradeset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgradeRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, String value5, Integer value6) {
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
     * Create a detached CoursewareOfflinecomputedgradeRecord
     */
    public CoursewareOfflinecomputedgradeRecord() {
        super(CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE);
    }

    /**
     * Create a detached, initialised CoursewareOfflinecomputedgradeRecord
     */
    public CoursewareOfflinecomputedgradeRecord(Integer id, String courseId, Timestamp created, Timestamp updated, String gradeset, Integer userId) {
        super(CoursewareOfflinecomputedgrade.COURSEWARE_OFFLINECOMPUTEDGRADE);

        set(0, id);
        set(1, courseId);
        set(2, created);
        set(3, updated);
        set(4, gradeset);
        set(5, userId);
    }
}
