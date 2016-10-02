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

import schema.tables.VerifiedTrackContentVerifiedtrackcohortedcourse;


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
public class VerifiedTrackContentVerifiedtrackcohortedcourseRecord extends UpdatableRecordImpl<VerifiedTrackContentVerifiedtrackcohortedcourseRecord> implements Record4<Integer, String, Byte, String> {

    private static final long serialVersionUID = -807170751;

    /**
     * Setter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.course_key</code>.
     */
    public void setCourseKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.course_key</code>.
     */
    public String getCourseKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.verified_cohort_name</code>.
     */
    public void setVerifiedCohortName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.verified_track_content_verifiedtrackcohortedcourse.verified_cohort_name</code>.
     */
    public String getVerifiedCohortName() {
        return (String) get(3);
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
    public Row4<Integer, String, Byte, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Byte, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE.COURSE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE.VERIFIED_COHORT_NAME;
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
        return getCourseKey();
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
    public String value4() {
        return getVerifiedCohortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord value2(String value) {
        setCourseKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord value4(String value) {
        setVerifiedCohortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord values(Integer value1, String value2, Byte value3, String value4) {
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
     * Create a detached VerifiedTrackContentVerifiedtrackcohortedcourseRecord
     */
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord() {
        super(VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE);
    }

    /**
     * Create a detached, initialised VerifiedTrackContentVerifiedtrackcohortedcourseRecord
     */
    public VerifiedTrackContentVerifiedtrackcohortedcourseRecord(Integer id, String courseKey, Byte enabled, String verifiedCohortName) {
        super(VerifiedTrackContentVerifiedtrackcohortedcourse.VERIFIED_TRACK_CONTENT_VERIFIEDTRACKCOHORTEDCOURSE);

        set(0, id);
        set(1, courseKey);
        set(2, enabled);
        set(3, verifiedCohortName);
    }
}