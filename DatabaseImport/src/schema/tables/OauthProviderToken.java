/**
 * This class is generated by jOOQ
 */
package schema.tables;


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
import schema.tables.records.OauthProviderTokenRecord;


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
public class OauthProviderToken extends TableImpl<OauthProviderTokenRecord> {

    private static final long serialVersionUID = -36036716;

    /**
     * The reference instance of <code>bitnami_edx.oauth_provider_token</code>
     */
    public static final OauthProviderToken OAUTH_PROVIDER_TOKEN = new OauthProviderToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthProviderTokenRecord> getRecordType() {
        return OauthProviderTokenRecord.class;
    }

    /**
     * The column <code>bitnami_edx.oauth_provider_token.id</code>.
     */
    public final TableField<OauthProviderTokenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.key</code>.
     */
    public final TableField<OauthProviderTokenRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.secret</code>.
     */
    public final TableField<OauthProviderTokenRecord, String> SECRET = createField("secret", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.token_type</code>.
     */
    public final TableField<OauthProviderTokenRecord, Short> TOKEN_TYPE = createField("token_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.timestamp</code>.
     */
    public final TableField<OauthProviderTokenRecord, Integer> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.is_approved</code>.
     */
    public final TableField<OauthProviderTokenRecord, Byte> IS_APPROVED = createField("is_approved", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.verifier</code>.
     */
    public final TableField<OauthProviderTokenRecord, String> VERIFIER = createField("verifier", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.callback</code>.
     */
    public final TableField<OauthProviderTokenRecord, String> CALLBACK = createField("callback", org.jooq.impl.SQLDataType.VARCHAR.length(2083), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.callback_confirmed</code>.
     */
    public final TableField<OauthProviderTokenRecord, Byte> CALLBACK_CONFIRMED = createField("callback_confirmed", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.consumer_id</code>.
     */
    public final TableField<OauthProviderTokenRecord, Integer> CONSUMER_ID = createField("consumer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.scope_id</code>.
     */
    public final TableField<OauthProviderTokenRecord, Integer> SCOPE_ID = createField("scope_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_token.user_id</code>.
     */
    public final TableField<OauthProviderTokenRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.oauth_provider_token</code> table reference
     */
    public OauthProviderToken() {
        this("oauth_provider_token", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.oauth_provider_token</code> table reference
     */
    public OauthProviderToken(String alias) {
        this(alias, OAUTH_PROVIDER_TOKEN);
    }

    private OauthProviderToken(String alias, Table<OauthProviderTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthProviderToken(String alias, Table<OauthProviderTokenRecord> aliased, Field<?>[] parameters) {
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
    public Identity<OauthProviderTokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH_PROVIDER_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthProviderTokenRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_PROVIDER_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthProviderTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthProviderTokenRecord>>asList(Keys.KEY_OAUTH_PROVIDER_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OauthProviderTokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OauthProviderTokenRecord, ?>>asList(Keys.OAUTH_CONSUMER_ID_1B9915B5BCF1EE5B_FK_OAUTH_PROVIDER_CONSUMER_ID, Keys.OAUTH_PROVI_SCOPE_ID_459821B6FECBC02A_FK_OAUTH_PROVIDER_SCOPE_ID, Keys.OAUTH_PROVIDER_TOKEN_USER_ID_588ADBCFFC892186_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderToken as(String alias) {
        return new OauthProviderToken(alias, this);
    }

    /**
     * Rename this table
     */
    public OauthProviderToken rename(String name) {
        return new OauthProviderToken(name, null);
    }
}