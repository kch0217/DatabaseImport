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

import schema.tables.CertificatesCertificatewhitelist;


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
public class CertificatesCertificatewhitelistRecord extends UpdatableRecordImpl<CertificatesCertificatewhitelistRecord> implements Record6<Integer, String, Byte, Timestamp, String, Integer> {

    private static final long serialVersionUID = 591001526;

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.course_id</code>.
     */
    public void setCourseId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.whitelist</code>.
     */
    public void setWhitelist(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.whitelist</code>.
     */
    public Byte getWhitelist() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.notes</code>.
     */
    public void setNotes(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.notes</code>.
     */
    public String getNotes() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatewhitelist.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatewhitelist.user_id</code>.
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
    public Row6<Integer, String, Byte, Timestamp, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Byte, Timestamp, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.WHITELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST.USER_ID;
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
    public Byte value3() {
        return getWhitelist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNotes();
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
    public CertificatesCertificatewhitelistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord value2(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord value3(Byte value) {
        setWhitelist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord value4(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord value5(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatewhitelistRecord values(Integer value1, String value2, Byte value3, Timestamp value4, String value5, Integer value6) {
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
     * Create a detached CertificatesCertificatewhitelistRecord
     */
    public CertificatesCertificatewhitelistRecord() {
        super(CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST);
    }

    /**
     * Create a detached, initialised CertificatesCertificatewhitelistRecord
     */
    public CertificatesCertificatewhitelistRecord(Integer id, String courseId, Byte whitelist, Timestamp created, String notes, Integer userId) {
        super(CertificatesCertificatewhitelist.CERTIFICATES_CERTIFICATEWHITELIST);

        set(0, id);
        set(1, courseId);
        set(2, whitelist);
        set(3, created);
        set(4, notes);
        set(5, userId);
    }
}