/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CertificatesCertificategenerationcoursesetting;


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
public class CertificatesCertificategenerationcoursesettingRecord extends UpdatableRecordImpl<CertificatesCertificategenerationcoursesettingRecord> implements Record5<Integer, Timestamp, Timestamp, String, Byte> {

    private static final long serialVersionUID = 1644989040;

    /**
     * Setter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.course_key</code>.
     */
    public void setCourseKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.course_key</code>.
     */
    public String getCourseKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificategenerationcoursesetting.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Timestamp, String, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Timestamp, String, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING.COURSE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING.ENABLED;
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
        return getCourseKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord value4(String value) {
        setCourseKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord value5(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificategenerationcoursesettingRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CertificatesCertificategenerationcoursesettingRecord
     */
    public CertificatesCertificategenerationcoursesettingRecord() {
        super(CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING);
    }

    /**
     * Create a detached, initialised CertificatesCertificategenerationcoursesettingRecord
     */
    public CertificatesCertificategenerationcoursesettingRecord(Integer id, Timestamp created, Timestamp modified, String courseKey, Byte enabled) {
        super(CertificatesCertificategenerationcoursesetting.CERTIFICATES_CERTIFICATEGENERATIONCOURSESETTING);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, courseKey);
        set(4, enabled);
    }
}