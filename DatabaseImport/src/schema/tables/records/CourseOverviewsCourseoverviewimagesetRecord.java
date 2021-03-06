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

import schema.tables.CourseOverviewsCourseoverviewimageset;


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
public class CourseOverviewsCourseoverviewimagesetRecord extends UpdatableRecordImpl<CourseOverviewsCourseoverviewimagesetRecord> implements Record6<Integer, Timestamp, Timestamp, String, String, String> {

    private static final long serialVersionUID = -2136505815;

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.small_url</code>.
     */
    public void setSmallUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.small_url</code>.
     */
    public String getSmallUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.large_url</code>.
     */
    public void setLargeUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.large_url</code>.
     */
    public String getLargeUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.course_overviews_courseoverviewimageset.course_overview_id</code>.
     */
    public void setCourseOverviewId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.course_overviews_courseoverviewimageset.course_overview_id</code>.
     */
    public String getCourseOverviewId() {
        return (String) get(5);
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
    public Row6<Integer, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.SMALL_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.LARGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET.COURSE_OVERVIEW_ID;
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
        return getSmallUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLargeUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCourseOverviewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value4(String value) {
        setSmallUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value5(String value) {
        setLargeUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord value6(String value) {
        setCourseOverviewId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimagesetRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6) {
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
     * Create a detached CourseOverviewsCourseoverviewimagesetRecord
     */
    public CourseOverviewsCourseoverviewimagesetRecord() {
        super(CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET);
    }

    /**
     * Create a detached, initialised CourseOverviewsCourseoverviewimagesetRecord
     */
    public CourseOverviewsCourseoverviewimagesetRecord(Integer id, Timestamp created, Timestamp modified, String smallUrl, String largeUrl, String courseOverviewId) {
        super(CourseOverviewsCourseoverviewimageset.COURSE_OVERVIEWS_COURSEOVERVIEWIMAGESET);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, smallUrl);
        set(4, largeUrl);
        set(5, courseOverviewId);
    }
}
