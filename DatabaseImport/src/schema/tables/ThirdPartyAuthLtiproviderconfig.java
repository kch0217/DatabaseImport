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
import schema.tables.records.ThirdPartyAuthLtiproviderconfigRecord;


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
public class ThirdPartyAuthLtiproviderconfig extends TableImpl<ThirdPartyAuthLtiproviderconfigRecord> {

    private static final long serialVersionUID = -779014207;

    /**
     * The reference instance of <code>bitnami_edx.third_party_auth_ltiproviderconfig</code>
     */
    public static final ThirdPartyAuthLtiproviderconfig THIRD_PARTY_AUTH_LTIPROVIDERCONFIG = new ThirdPartyAuthLtiproviderconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdPartyAuthLtiproviderconfigRecord> getRecordType() {
        return ThirdPartyAuthLtiproviderconfigRecord.class;
    }

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.id</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.change_date</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.enabled</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.icon_class</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> ICON_CLASS = createField("icon_class", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.name</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.secondary</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Byte> SECONDARY = createField("secondary", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.skip_registration_form</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Byte> SKIP_REGISTRATION_FORM = createField("skip_registration_form", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.skip_email_verification</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Byte> SKIP_EMAIL_VERIFICATION = createField("skip_email_verification", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.lti_consumer_key</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> LTI_CONSUMER_KEY = createField("lti_consumer_key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.lti_hostname</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> LTI_HOSTNAME = createField("lti_hostname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.lti_consumer_secret</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> LTI_CONSUMER_SECRET = createField("lti_consumer_secret", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.lti_max_timestamp_age</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Integer> LTI_MAX_TIMESTAMP_AGE = createField("lti_max_timestamp_age", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.changed_by_id</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_ltiproviderconfig.icon_image</code>.
     */
    public final TableField<ThirdPartyAuthLtiproviderconfigRecord, String> ICON_IMAGE = createField("icon_image", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.third_party_auth_ltiproviderconfig</code> table reference
     */
    public ThirdPartyAuthLtiproviderconfig() {
        this("third_party_auth_ltiproviderconfig", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.third_party_auth_ltiproviderconfig</code> table reference
     */
    public ThirdPartyAuthLtiproviderconfig(String alias) {
        this(alias, THIRD_PARTY_AUTH_LTIPROVIDERCONFIG);
    }

    private ThirdPartyAuthLtiproviderconfig(String alias, Table<ThirdPartyAuthLtiproviderconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdPartyAuthLtiproviderconfig(String alias, Table<ThirdPartyAuthLtiproviderconfigRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ThirdPartyAuthLtiproviderconfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_THIRD_PARTY_AUTH_LTIPROVIDERCONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThirdPartyAuthLtiproviderconfigRecord> getPrimaryKey() {
        return Keys.KEY_THIRD_PARTY_AUTH_LTIPROVIDERCONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThirdPartyAuthLtiproviderconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<ThirdPartyAuthLtiproviderconfigRecord>>asList(Keys.KEY_THIRD_PARTY_AUTH_LTIPROVIDERCONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ThirdPartyAuthLtiproviderconfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ThirdPartyAuthLtiproviderconfigRecord, ?>>asList(Keys.THIRD_PARTY_AUTH__CHANGED_BY_ID_7749E09FD5F71AB0_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthLtiproviderconfig as(String alias) {
        return new ThirdPartyAuthLtiproviderconfig(alias, this);
    }

    /**
     * Rename this table
     */
    public ThirdPartyAuthLtiproviderconfig rename(String name) {
        return new ThirdPartyAuthLtiproviderconfig(name, null);
    }
}
