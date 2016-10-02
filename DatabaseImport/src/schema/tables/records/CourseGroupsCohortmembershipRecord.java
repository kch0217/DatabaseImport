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

import schema.tables.CourseGroupsCohortmembership;


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
public class CourseGroupsCohortmembershipRecord extends UpdatableRecordImpl<CourseGroupsCohortmembershipRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 328420739;

    /**
     * Setter for <code>bitnami_edx.course_groups_cohortmembership.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_cohortmembership.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_cohortmembership.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_cohortmembership.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_cohortmembership.course_user_group_id</code>.
     */
    public void setCourseUserGroupId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_cohortmembership.course_user_group_id</code>.
     */
    public Integer getCourseUserGroupId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_cohortmembership.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_cohortmembership.user_id</code>.
     */
    public Integer getUserId() {
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
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP.COURSE_USER_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP.USER_ID;
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
    public Integer value3() {
        return getCourseUserGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembershipRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembershipRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembershipRecord value3(Integer value) {
        setCourseUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembershipRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCohortmembershipRecord values(Integer value1, String value2, Integer value3, Integer value4) {
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
     * Create a detached CourseGroupsCohortmembershipRecord
     */
    public CourseGroupsCohortmembershipRecord() {
        super(CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP);
    }

    /**
     * Create a detached, initialised CourseGroupsCohortmembershipRecord
     */
    public CourseGroupsCohortmembershipRecord(Integer id, String courseId, Integer courseUserGroupId, Integer userId) {
        super(CourseGroupsCohortmembership.COURSE_GROUPS_COHORTMEMBERSHIP);

        set(0, id);
        set(1, courseId);
        set(2, courseUserGroupId);
        set(3, userId);
    }
}