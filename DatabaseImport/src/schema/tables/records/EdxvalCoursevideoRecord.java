/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.EdxvalCoursevideo;


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
public class EdxvalCoursevideoRecord extends UpdatableRecordImpl<EdxvalCoursevideoRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -1092629302;

    /**
     * Setter for <code>bitnami_edx.edxval_coursevideo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.edxval_coursevideo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.edxval_coursevideo.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.edxval_coursevideo.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.edxval_coursevideo.video_id</code>.
     */
    public void setVideoId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.edxval_coursevideo.video_id</code>.
     */
    public Integer getVideoId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EdxvalCoursevideo.EDXVAL_COURSEVIDEO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EdxvalCoursevideo.EDXVAL_COURSEVIDEO.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return EdxvalCoursevideo.EDXVAL_COURSEVIDEO.VIDEO_ID;
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
        return getVideoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EdxvalCoursevideoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EdxvalCoursevideoRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EdxvalCoursevideoRecord value3(Integer value) {
        setVideoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EdxvalCoursevideoRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EdxvalCoursevideoRecord
     */
    public EdxvalCoursevideoRecord() {
        super(EdxvalCoursevideo.EDXVAL_COURSEVIDEO);
    }

    /**
     * Create a detached, initialised EdxvalCoursevideoRecord
     */
    public EdxvalCoursevideoRecord(Integer id, String courseId, Integer videoId) {
        super(EdxvalCoursevideo.EDXVAL_COURSEVIDEO);

        set(0, id);
        set(1, courseId);
        set(2, videoId);
    }
}
