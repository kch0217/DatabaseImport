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

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.SocialAuthNonceRecord;


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
public class SocialAuthNonce extends TableImpl<SocialAuthNonceRecord> {

    private static final long serialVersionUID = 719595923;

    /**
     * The reference instance of <code>bitnami_edx.social_auth_nonce</code>
     */
    public static final SocialAuthNonce SOCIAL_AUTH_NONCE = new SocialAuthNonce();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SocialAuthNonceRecord> getRecordType() {
        return SocialAuthNonceRecord.class;
    }

    /**
     * The column <code>bitnami_edx.social_auth_nonce.id</code>.
     */
    public final TableField<SocialAuthNonceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.social_auth_nonce.server_url</code>.
     */
    public final TableField<SocialAuthNonceRecord, String> SERVER_URL = createField("server_url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.social_auth_nonce.timestamp</code>.
     */
    public final TableField<SocialAuthNonceRecord, Integer> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.social_auth_nonce.salt</code>.
     */
    public final TableField<SocialAuthNonceRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR.length(65).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.social_auth_nonce</code> table reference
     */
    public SocialAuthNonce() {
        this("social_auth_nonce", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.social_auth_nonce</code> table reference
     */
    public SocialAuthNonce(String alias) {
        this(alias, SOCIAL_AUTH_NONCE);
    }

    private SocialAuthNonce(String alias, Table<SocialAuthNonceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SocialAuthNonce(String alias, Table<SocialAuthNonceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SocialAuthNonceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOCIAL_AUTH_NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SocialAuthNonceRecord> getPrimaryKey() {
        return Keys.KEY_SOCIAL_AUTH_NONCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SocialAuthNonceRecord>> getKeys() {
        return Arrays.<UniqueKey<SocialAuthNonceRecord>>asList(Keys.KEY_SOCIAL_AUTH_NONCE_PRIMARY, Keys.KEY_SOCIAL_AUTH_NONCE_SOCIAL_AUTH_NONCE_SERVER_URL_36601F978463B4_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SocialAuthNonce as(String alias) {
        return new SocialAuthNonce(alias, this);
    }

    /**
     * Rename this table
     */
    public SocialAuthNonce rename(String name) {
        return new SocialAuthNonce(name, null);
    }
}
