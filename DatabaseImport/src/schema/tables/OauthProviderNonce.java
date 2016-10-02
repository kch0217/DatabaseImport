/**
 * This class is generated by jOOQ
 */
package schema.tables;


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
import org.jooq.types.UInteger;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.OauthProviderNonceRecord;


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
public class OauthProviderNonce extends TableImpl<OauthProviderNonceRecord> {

    private static final long serialVersionUID = -1438986891;

    /**
     * The reference instance of <code>bitnami_edx.oauth_provider_nonce</code>
     */
    public static final OauthProviderNonce OAUTH_PROVIDER_NONCE = new OauthProviderNonce();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthProviderNonceRecord> getRecordType() {
        return OauthProviderNonceRecord.class;
    }

    /**
     * The column <code>bitnami_edx.oauth_provider_nonce.id</code>.
     */
    public final TableField<OauthProviderNonceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_nonce.token_key</code>.
     */
    public final TableField<OauthProviderNonceRecord, String> TOKEN_KEY = createField("token_key", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_nonce.consumer_key</code>.
     */
    public final TableField<OauthProviderNonceRecord, String> CONSUMER_KEY = createField("consumer_key", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_nonce.key</code>.
     */
    public final TableField<OauthProviderNonceRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth_provider_nonce.timestamp</code>.
     */
    public final TableField<OauthProviderNonceRecord, UInteger> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.oauth_provider_nonce</code> table reference
     */
    public OauthProviderNonce() {
        this("oauth_provider_nonce", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.oauth_provider_nonce</code> table reference
     */
    public OauthProviderNonce(String alias) {
        this(alias, OAUTH_PROVIDER_NONCE);
    }

    private OauthProviderNonce(String alias, Table<OauthProviderNonceRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthProviderNonce(String alias, Table<OauthProviderNonceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<OauthProviderNonceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH_PROVIDER_NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthProviderNonceRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_PROVIDER_NONCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthProviderNonceRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthProviderNonceRecord>>asList(Keys.KEY_OAUTH_PROVIDER_NONCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderNonce as(String alias) {
        return new OauthProviderNonce(alias, this);
    }

    /**
     * Rename this table
     */
    public OauthProviderNonce rename(String name) {
        return new OauthProviderNonce(name, null);
    }
}