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
import schema.tables.records.ThirdPartyAuthSamlconfigurationRecord;


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
public class ThirdPartyAuthSamlconfiguration extends TableImpl<ThirdPartyAuthSamlconfigurationRecord> {

    private static final long serialVersionUID = -2123549185;

    /**
     * The reference instance of <code>bitnami_edx.third_party_auth_samlconfiguration</code>
     */
    public static final ThirdPartyAuthSamlconfiguration THIRD_PARTY_AUTH_SAMLCONFIGURATION = new ThirdPartyAuthSamlconfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdPartyAuthSamlconfigurationRecord> getRecordType() {
        return ThirdPartyAuthSamlconfigurationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.id</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.change_date</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.enabled</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.private_key</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, String> PRIVATE_KEY = createField("private_key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.public_key</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, String> PUBLIC_KEY = createField("public_key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.entity_id</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, String> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.org_info_str</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, String> ORG_INFO_STR = createField("org_info_str", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.other_config_str</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, String> OTHER_CONFIG_STR = createField("other_config_str", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlconfiguration.changed_by_id</code>.
     */
    public final TableField<ThirdPartyAuthSamlconfigurationRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.third_party_auth_samlconfiguration</code> table reference
     */
    public ThirdPartyAuthSamlconfiguration() {
        this("third_party_auth_samlconfiguration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.third_party_auth_samlconfiguration</code> table reference
     */
    public ThirdPartyAuthSamlconfiguration(String alias) {
        this(alias, THIRD_PARTY_AUTH_SAMLCONFIGURATION);
    }

    private ThirdPartyAuthSamlconfiguration(String alias, Table<ThirdPartyAuthSamlconfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdPartyAuthSamlconfiguration(String alias, Table<ThirdPartyAuthSamlconfigurationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ThirdPartyAuthSamlconfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_THIRD_PARTY_AUTH_SAMLCONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThirdPartyAuthSamlconfigurationRecord> getPrimaryKey() {
        return Keys.KEY_THIRD_PARTY_AUTH_SAMLCONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThirdPartyAuthSamlconfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<ThirdPartyAuthSamlconfigurationRecord>>asList(Keys.KEY_THIRD_PARTY_AUTH_SAMLCONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ThirdPartyAuthSamlconfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ThirdPartyAuthSamlconfigurationRecord, ?>>asList(Keys.THIRD_PARTY_AUTH__CHANGED_BY_ID_67A92ED1A69A5D1F_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfiguration as(String alias) {
        return new ThirdPartyAuthSamlconfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    public ThirdPartyAuthSamlconfiguration rename(String name) {
        return new ThirdPartyAuthSamlconfiguration(name, null);
    }
}
