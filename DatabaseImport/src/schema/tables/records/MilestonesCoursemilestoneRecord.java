/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.MilestonesCoursemilestone;


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
public class MilestonesCoursemilestoneRecord extends UpdatableRecordImpl<MilestonesCoursemilestoneRecord> implements Record7<Integer, Timestamp, Timestamp, String, Byte, Integer, Integer> {

    private static final long serialVersionUID = -1747666912;

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.course_id</code>.
     */
    public void setCourseId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.active</code>.
     */
    public void setActive(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.milestone_id</code>.
     */
    public void setMilestoneId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.milestone_id</code>.
     */
    public Integer getMilestoneId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursemilestone.milestone_relationship_type_id</code>.
     */
    public void setMilestoneRelationshipTypeId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursemilestone.milestone_relationship_type_id</code>.
     */
    public Integer getMilestoneRelationshipTypeId() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, Timestamp, String, Byte, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, Timestamp, String, Byte, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.MILESTONE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE.MILESTONE_RELATIONSHIP_TYPE_ID;
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
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMilestoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMilestoneRelationshipTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value4(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value5(Byte value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value6(Integer value) {
        setMilestoneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord value7(Integer value) {
        setMilestoneRelationshipTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursemilestoneRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, Byte value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilestonesCoursemilestoneRecord
     */
    public MilestonesCoursemilestoneRecord() {
        super(MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE);
    }

    /**
     * Create a detached, initialised MilestonesCoursemilestoneRecord
     */
    public MilestonesCoursemilestoneRecord(Integer id, Timestamp created, Timestamp modified, String courseId, Byte active, Integer milestoneId, Integer milestoneRelationshipTypeId) {
        super(MilestonesCoursemilestone.MILESTONES_COURSEMILESTONE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, courseId);
        set(4, active);
        set(5, milestoneId);
        set(6, milestoneRelationshipTypeId);
    }
}