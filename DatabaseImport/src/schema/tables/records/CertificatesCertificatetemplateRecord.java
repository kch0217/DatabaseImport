/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CertificatesCertificatetemplate;


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
public class CertificatesCertificatetemplateRecord extends UpdatableRecordImpl<CertificatesCertificatetemplateRecord> implements Record10<Integer, Timestamp, Timestamp, String, String, String, Integer, String, String, Byte> {

    private static final long serialVersionUID = -1962462531;

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.template</code>.
     */
    public void setTemplate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.template</code>.
     */
    public String getTemplate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.organization_id</code>.
     */
    public void setOrganizationId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.organization_id</code>.
     */
    public Integer getOrganizationId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.course_key</code>.
     */
    public void setCourseKey(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.course_key</code>.
     */
    public String getCourseKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.mode</code>.
     */
    public void setMode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.mode</code>.
     */
    public String getMode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatetemplate.is_active</code>.
     */
    public void setIsActive(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatetemplate.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, String, String, String, Integer, String, String, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, String, String, String, Integer, String, String, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.ORGANIZATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.COURSE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE.IS_ACTIVE;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getOrganizationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCourseKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value6(String value) {
        setTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value7(Integer value) {
        setOrganizationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value8(String value) {
        setCourseKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value9(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord value10(Byte value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatetemplateRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Integer value7, String value8, String value9, Byte value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CertificatesCertificatetemplateRecord
     */
    public CertificatesCertificatetemplateRecord() {
        super(CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE);
    }

    /**
     * Create a detached, initialised CertificatesCertificatetemplateRecord
     */
    public CertificatesCertificatetemplateRecord(Integer id, Timestamp created, Timestamp modified, String name, String description, String template, Integer organizationId, String courseKey, String mode, Byte isActive) {
        super(CertificatesCertificatetemplate.CERTIFICATES_CERTIFICATETEMPLATE);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, name);
        set(4, description);
        set(5, template);
        set(6, organizationId);
        set(7, courseKey);
        set(8, mode);
        set(9, isActive);
    }
}
