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

import schema.tables.CourseOverviewsCourseoverviewimageconfig;


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
public class CourseOverviewsCourseoverviewimageconfigRecord extends UpdatableRecordImpl<CourseOverviewsCourseoverviewimageconfigRecord> implements Record8<Integer, Timestamp, Byte, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -209942649;

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_width</code>.
     */
    public void setSmallWidth(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_width</code>.
     */
    public Integer getSmallWidth() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_height</code>.
     */
    public void setSmallHeight(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_height</code>.
     */
    public Integer getSmallHeight() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_width</code>.
     */
    public void setLargeWidth(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_width</code>.
     */
    public Integer getLargeWidth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_height</code>.
     */
    public void setLargeHeight(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_height</code>.
     */
    public Integer getLargeHeight() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageconfig.changed_by_id</code>.
     */
    public Integer getChangedById() {
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
    public Row8<Integer, Timestamp, Byte, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, Byte, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.SMALL_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.SMALL_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.LARGE_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.LARGE_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG.CHANGED_BY_ID;
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
        return getChangeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSmallWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSmallHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLargeWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLargeHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value4(Integer value) {
        setSmallWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value5(Integer value) {
        setSmallHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value6(Integer value) {
        setLargeWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value7(Integer value) {
        setLargeHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord value8(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfigRecord values(Integer value1, Timestamp value2, Byte value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
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
     * Create a detached CourseOverviewsCourseoverviewimageconfigRecord
     */
    public CourseOverviewsCourseoverviewimageconfigRecord() {
        super(CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG);
    }

    /**
     * Create a detached, initialised CourseOverviewsCourseoverviewimageconfigRecord
     */
    public CourseOverviewsCourseoverviewimageconfigRecord(Integer id, Timestamp changeDate, Byte enabled, Integer smallWidth, Integer smallHeight, Integer largeWidth, Integer largeHeight, Integer changedById) {
        super(CourseOverviewsCourseoverviewimageconfig.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, smallWidth);
        set(4, smallHeight);
        set(5, largeWidth);
        set(6, largeHeight);
        set(7, changedById);
    }
}
