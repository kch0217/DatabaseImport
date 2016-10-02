/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.MilestonesCoursecontentmilestone;


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
public class MilestonesCoursecontentmilestoneRecord extends UpdatableRecordImpl<MilestonesCoursecontentmilestoneRecord> implements Record9<Integer, Timestamp, Timestamp, String, String, Byte, Integer, Integer, String> {

    private static final long serialVersionUID = 400552853;

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.course_id</code>.
     */
    public void setCourseId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.content_id</code>.
     */
    public void setContentId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.content_id</code>.
     */
    public String getContentId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.active</code>.
     */
    public void setActive(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.milestone_id</code>.
     */
    public void setMilestoneId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.milestone_id</code>.
     */
    public Integer getMilestoneId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.milestone_relationship_type_id</code>.
     */
    public void setMilestoneRelationshipTypeId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.milestone_relationship_type_id</code>.
     */
    public Integer getMilestoneRelationshipTypeId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.milestones_coursecontentmilestone.requirements</code>.
     */
    public void setRequirements(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.milestones_coursecontentmilestone.requirements</code>.
     */
    public String getRequirements() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, String, String, Byte, Integer, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, String, String, Byte, Integer, Integer, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.CONTENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.MILESTONE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.MILESTONE_RELATIONSHIP_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE.REQUIREMENTS;
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
    public String value5() {
        return getContentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMilestoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMilestoneRelationshipTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRequirements();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value4(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value5(String value) {
        setContentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value6(Byte value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value7(Integer value) {
        setMilestoneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value8(Integer value) {
        setMilestoneRelationshipTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord value9(String value) {
        setRequirements(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MilestonesCoursecontentmilestoneRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, Byte value6, Integer value7, Integer value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilestonesCoursecontentmilestoneRecord
     */
    public MilestonesCoursecontentmilestoneRecord() {
        super(MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE);
    }

    /**
     * Create a detached, initialised MilestonesCoursecontentmilestoneRecord
     */
    public MilestonesCoursecontentmilestoneRecord(Integer id, Timestamp created, Timestamp modified, String courseId, String contentId, Byte active, Integer milestoneId, Integer milestoneRelationshipTypeId, String requirements) {
        super(MilestonesCoursecontentmilestone.MILESTONES_COURSECONTENTMILESTONE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, courseId);
        set(4, contentId);
        set(5, active);
        set(6, milestoneId);
        set(7, milestoneRelationshipTypeId);
        set(8, requirements);
    }
}
