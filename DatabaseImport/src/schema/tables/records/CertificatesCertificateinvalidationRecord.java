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

import schema.tables.CertificatesCertificateinvalidation;


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
public class CertificatesCertificateinvalidationRecord extends UpdatableRecordImpl<CertificatesCertificateinvalidationRecord> implements Record7<Integer, Timestamp, Timestamp, String, Byte, Integer, Integer> {

    private static final long serialVersionUID = -460415439;

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.notes</code>.
     */
    public void setNotes(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.notes</code>.
     */
    public String getNotes() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.active</code>.
     */
    public void setActive(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.generated_certificate_id</code>.
     */
    public void setGeneratedCertificateId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.generated_certificate_id</code>.
     */
    public Integer getGeneratedCertificateId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificateinvalidation.invalidated_by_id</code>.
     */
    public void setInvalidatedById(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificateinvalidation.invalidated_by_id</code>.
     */
    public Integer getInvalidatedById() {
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
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.GENERATED_CERTIFICATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION.INVALIDATED_BY_ID;
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
        return getNotes();
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
        return getGeneratedCertificateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getInvalidatedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value4(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value5(Byte value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value6(Integer value) {
        setGeneratedCertificateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord value7(Integer value) {
        setInvalidatedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificateinvalidationRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, Byte value5, Integer value6, Integer value7) {
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
     * Create a detached CertificatesCertificateinvalidationRecord
     */
    public CertificatesCertificateinvalidationRecord() {
        super(CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION);
    }

    /**
     * Create a detached, initialised CertificatesCertificateinvalidationRecord
     */
    public CertificatesCertificateinvalidationRecord(Integer id, Timestamp created, Timestamp modified, String notes, Byte active, Integer generatedCertificateId, Integer invalidatedById) {
        super(CertificatesCertificateinvalidation.CERTIFICATES_CERTIFICATEINVALIDATION);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, notes);
        set(4, active);
        set(5, generatedCertificateId);
        set(6, invalidatedById);
    }
}
