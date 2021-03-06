/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.CertificatesCertificatehtmlviewconfigurationRecord;


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
public class CertificatesCertificatehtmlviewconfiguration extends TableImpl<CertificatesCertificatehtmlviewconfigurationRecord> {

    private static final long serialVersionUID = -824217028;

    /**
     * The reference instance of <code>bitnami_edx.certificates_certificatehtmlviewconfiguration</code>
     */
    public static final CertificatesCertificatehtmlviewconfiguration CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION = new CertificatesCertificatehtmlviewconfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CertificatesCertificatehtmlviewconfigurationRecord> getRecordType() {
        return CertificatesCertificatehtmlviewconfigurationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.id</code>.
     */
    public final TableField<CertificatesCertificatehtmlviewconfigurationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.change_date</code>.
     */
    public final TableField<CertificatesCertificatehtmlviewconfigurationRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.enabled</code>.
     */
    public final TableField<CertificatesCertificatehtmlviewconfigurationRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.configuration</code>.
     */
    public final TableField<CertificatesCertificatehtmlviewconfigurationRecord, String> CONFIGURATION = createField("configuration", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.certificates_certificatehtmlviewconfiguration.changed_by_id</code>.
     */
    public final TableField<CertificatesCertificatehtmlviewconfigurationRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.certificates_certificatehtmlviewconfiguration</code> table reference
     */
    public CertificatesCertificatehtmlviewconfiguration() {
        this("certificates_certificatehtmlviewconfiguration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.certificates_certificatehtmlviewconfiguration</code> table reference
     */
    public CertificatesCertificatehtmlviewconfiguration(String alias) {
        this(alias, CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION);
    }

    private CertificatesCertificatehtmlviewconfiguration(String alias, Table<CertificatesCertificatehtmlviewconfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private CertificatesCertificatehtmlviewconfiguration(String alias, Table<CertificatesCertificatehtmlviewconfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BitnamiEdx.BITNAMI_EDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CertificatesCertificatehtmlviewconfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CertificatesCertificatehtmlviewconfigurationRecord> getPrimaryKey() {
        return Keys.KEY_CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CertificatesCertificatehtmlviewconfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<CertificatesCertificatehtmlviewconfigurationRecord>>asList(Keys.KEY_CERTIFICATES_CERTIFICATEHTMLVIEWCONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CertificatesCertificatehtmlviewconfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CertificatesCertificatehtmlviewconfigurationRecord, ?>>asList(Keys.CERTIFICATES_CERT_CHANGED_BY_ID_1DE6CF549BCA749B_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CertificatesCertificatehtmlviewconfiguration as(String alias) {
        return new CertificatesCertificatehtmlviewconfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    public CertificatesCertificatehtmlviewconfiguration rename(String name) {
        return new CertificatesCertificatehtmlviewconfiguration(name, null);
    }
}
