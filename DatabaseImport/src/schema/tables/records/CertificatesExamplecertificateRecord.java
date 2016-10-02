/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CertificatesExamplecertificate;


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
public class CertificatesExamplecertificateRecord extends UpdatableRecordImpl<CertificatesExamplecertificateRecord> implements Record12<Integer, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 955442011;

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.uuid</code>.
     */
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.uuid</code>.
     */
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.access_key</code>.
     */
    public void setAccessKey(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.access_key</code>.
     */
    public String getAccessKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.full_name</code>.
     */
    public void setFullName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.full_name</code>.
     */
    public String getFullName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.template</code>.
     */
    public void setTemplate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.template</code>.
     */
    public String getTemplate() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.status</code>.
     */
    public void setStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.status</code>.
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.error_reason</code>.
     */
    public void setErrorReason(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.error_reason</code>.
     */
    public String getErrorReason() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.download_url</code>.
     */
    public void setDownloadUrl(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.download_url</code>.
     */
    public String getDownloadUrl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_examplecertificate.example_cert_set_id</code>.
     */
    public void setExampleCertSetId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_examplecertificate.example_cert_set_id</code>.
     */
    public Integer getExampleCertSetId() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.ACCESS_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.ERROR_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.DOWNLOAD_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE.EXAMPLE_CERT_SET_ID;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAccessKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getErrorReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDownloadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getExampleCertSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value6(String value) {
        setAccessKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value7(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value8(String value) {
        setTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value9(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value10(String value) {
        setErrorReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value11(String value) {
        setDownloadUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord value12(Integer value) {
        setExampleCertSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesExamplecertificateRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Integer value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CertificatesExamplecertificateRecord
     */
    public CertificatesExamplecertificateRecord() {
        super(CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE);
    }

    /**
     * Create a detached, initialised CertificatesExamplecertificateRecord
     */
    public CertificatesExamplecertificateRecord(Integer id, Timestamp created, Timestamp modified, String description, String uuid, String accessKey, String fullName, String template, String status, String errorReason, String downloadUrl, Integer exampleCertSetId) {
        super(CertificatesExamplecertificate.CERTIFICATES_EXAMPLECERTIFICATE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, description);
        set(4, uuid);
        set(5, accessKey);
        set(6, fullName);
        set(7, template);
        set(8, status);
        set(9, errorReason);
        set(10, downloadUrl);
        set(11, exampleCertSetId);
    }
}
