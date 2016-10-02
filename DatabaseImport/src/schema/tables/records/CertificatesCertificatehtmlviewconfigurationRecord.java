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

import schema.tables.CertificatesCertificatehtmlviewconfiguration;


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
public class CertificatesCertificatehtmlviewconfigurationRecord extends UpdatableRecordImpl<CertificatesCertificatehtmlviewconfigurationRecord> implements Record5<Integer, Timestamp, Byte, String, Integer> {

    private static final long serialVersionUID = -619818610;

    /**
     * Setter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.configuration</code>.
     */
    public void setConfiguration(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.configuration</code>.
     */
    public String getConfiguration() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.changed_by_id</code>.
     */
    public Integer getChangedById() {
        return (Integer) get(4);
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
    public Row5<Integer, Timestamp, Byte, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, Byte, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION.CONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION.CHANGED_BY_ID;
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
    public String value4() {
        return getConfiguration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord value4(String value) {
        setConfiguration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord value5(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfigurationRecord values(Integer value1, Timestamp value2, Byte value3, String value4, Integer value5) {
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
     * Create a detached CertificatesCertificatehtmlviewconfigurationRecord
     */
    public CertificatesCertificatehtmlviewconfigurationRecord() {
        super(CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION);
    }

    /**
     * Create a detached, initialised CertificatesCertificatehtmlviewconfigurationRecord
     */
    public CertificatesCertificatehtmlviewconfigurationRecord(Integer id, Timestamp changeDate, Byte enabled, String configuration, Integer changedById) {
        super(CertificatesCertificatehtmlviewconfiguration.CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, configuration);
        set(4, changedById);
    }
}
