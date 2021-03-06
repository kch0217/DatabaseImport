/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.ThirdPartyAuthSamlproviderdataRecord;


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
public class ThirdPartyAuthSamlproviderdata extends TableImpl<ThirdPartyAuthSamlproviderdataRecord> {

    private static final long serialVersionUID = -2117917193;

    /**
     * The reference instance of <code>bitnami_edx.third_party_auth_samlproviderdata</code>
     */
    public static final ThirdPartyAuthSamlproviderdata THIRD_PARTY_AUTH_SAMLPROVIDERDATA = new ThirdPartyAuthSamlproviderdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdPartyAuthSamlproviderdataRecord> getRecordType() {
        return ThirdPartyAuthSamlproviderdataRecord.class;
    }

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.id</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.fetched_at</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, Timestamp> FETCHED_AT = createField("fetched_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.expires_at</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, Timestamp> EXPIRES_AT = createField("expires_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.entity_id</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, String> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.sso_url</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, String> SSO_URL = createField("sso_url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.third_party_auth_samlproviderdata.public_key</code>.
     */
    public final TableField<ThirdPartyAuthSamlproviderdataRecord, String> PUBLIC_KEY = createField("public_key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.third_party_auth_samlproviderdata</code> table reference
     */
    public ThirdPartyAuthSamlproviderdata() {
        this("third_party_auth_samlproviderdata", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.third_party_auth_samlproviderdata</code> table reference
     */
    public ThirdPartyAuthSamlproviderdata(String alias) {
        this(alias, THIRD_PARTY_AUTH_SAMLPROVIDERDATA);
    }

    private ThirdPartyAuthSamlproviderdata(String alias, Table<ThirdPartyAuthSamlproviderdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdPartyAuthSamlproviderdata(String alias, Table<ThirdPartyAuthSamlproviderdataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ThirdPartyAuthSamlproviderdataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_THIRD_PARTY_AUTH_SAMLPROVIDERDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThirdPartyAuthSamlproviderdataRecord> getPrimaryKey() {
        return Keys.KEY_THIRD_PARTY_AUTH_SAMLPROVIDERDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThirdPartyAuthSamlproviderdataRecord>> getKeys() {
        return Arrays.<UniqueKey<ThirdPartyAuthSamlproviderdataRecord>>asList(Keys.KEY_THIRD_PARTY_AUTH_SAMLPROVIDERDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlproviderdata as(String alias) {
        return new ThirdPartyAuthSamlproviderdata(alias, this);
    }

    /**
     * Rename this table
     */
    public ThirdPartyAuthSamlproviderdata rename(String name) {
        return new ThirdPartyAuthSamlproviderdata(name, null);
    }
}
