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

import schema.tables.CourseGroupsCourseusergrouppartitiongroup;


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
public class CourseGroupsCourseusergrouppartitiongroupRecord extends UpdatableRecordImpl<CourseGroupsCourseusergrouppartitiongroupRecord> implements Record6<Integer, Integer, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 1170022399;

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.partition_id</code>.
     */
    public void setPartitionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.partition_id</code>.
     */
    public Integer getPartitionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.course_user_group_id</code>.
     */
    public void setCourseUserGroupId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_groups_courseusergrouppartitiongroup.course_user_group_id</code>.
     */
    public Integer getCourseUserGroupId() {
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
    public Row6<Integer, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.PARTITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP.COURSE_USER_GROUP_ID;
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
        return getPartitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGroupId();
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
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCourseUserGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value2(Integer value) {
        setPartitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value3(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord value6(Integer value) {
        setCourseUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseGroupsCourseusergrouppartitiongroupRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Integer value6) {
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
     * Create a detached CourseGroupsCourseusergrouppartitiongroupRecord
     */
    public CourseGroupsCourseusergrouppartitiongroupRecord() {
        super(CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP);
    }

    /**
     * Create a detached, initialised CourseGroupsCourseusergrouppartitiongroupRecord
     */
    public CourseGroupsCourseusergrouppartitiongroupRecord(Integer id, Integer partitionId, Integer groupId, Timestamp createdAt, Timestamp updatedAt, Integer courseUserGroupId) {
        super(CourseGroupsCourseusergrouppartitiongroup.COURSE_GROUPS_COURSEUSERGROUPPARTITIONGROUP);

        set(0, id);
        set(1, partitionId);
        set(2, groupId);
        set(3, createdAt);
        set(4, updatedAt);
        set(5, courseUserGroupId);
    }
}
