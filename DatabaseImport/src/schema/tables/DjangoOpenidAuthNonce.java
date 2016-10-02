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
import schema.tables.records.DjangoOpenidAuthNonceRecord;


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
public class DjangoOpenidAuthNonce extends TableImpl<DjangoOpenidAuthNonceRecord> {

    private static final long serialVersionUID = 1506630441;

    /**
     * The reference instance of <code>bitnami_edx.django_openid_auth_nonce</code>
     */
    public static final DjangoOpenidAuthNonce DJANGO_OPENID_AUTH_NONCE = new DjangoOpenidAuthNonce();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjangoOpenidAuthNonceRecord> getRecordType() {
        return DjangoOpenidAuthNonceRecord.class;
    }

    /**
     * The column <code>bitnami_edx.django_openid_auth_nonce.id</code>.
     */
    public final TableField<DjangoOpenidAuthNonceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_openid_auth_nonce.server_url</code>.
     */
    public final TableField<DjangoOpenidAuthNonceRecord, String> SERVER_URL = createField("server_url", org.jooq.impl.SQLDataType.VARCHAR.length(2047).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_openid_auth_nonce.timestamp</code>.
     */
    public final TableField<DjangoOpenidAuthNonceRecord, Integer> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_openid_auth_nonce.salt</code>.
     */
    public final TableField<DjangoOpenidAuthNonceRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.django_openid_auth_nonce</code> table reference
     */
    public DjangoOpenidAuthNonce() {
        this("django_openid_auth_nonce", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.django_openid_auth_nonce</code> table reference
     */
    public DjangoOpenidAuthNonce(String alias) {
        this(alias, DJANGO_OPENID_AUTH_NONCE);
    }

    private DjangoOpenidAuthNonce(String alias, Table<DjangoOpenidAuthNonceRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjangoOpenidAuthNonce(String alias, Table<DjangoOpenidAuthNonceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DjangoOpenidAuthNonceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DJANGO_OPENID_AUTH_NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjangoOpenidAuthNonceRecord> getPrimaryKey() {
        return Keys.KEY_DJANGO_OPENID_AUTH_NONCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjangoOpenidAuthNonceRecord>> getKeys() {
        return Arrays.<UniqueKey<DjangoOpenidAuthNonceRecord>>asList(Keys.KEY_DJANGO_OPENID_AUTH_NONCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoOpenidAuthNonce as(String alias) {
        return new DjangoOpenidAuthNonce(alias, this);
    }

    /**
     * Rename this table
     */
    public DjangoOpenidAuthNonce rename(String name) {
        return new DjangoOpenidAuthNonce(name, null);
    }
}