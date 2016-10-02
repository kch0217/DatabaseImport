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
import schema.tables.records.Oauth2ProviderTrustedclientRecord;


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
public class Oauth2ProviderTrustedclient extends TableImpl<Oauth2ProviderTrustedclientRecord> {

    private static final long serialVersionUID = -1510201441;

    /**
     * The reference instance of <code>bitnami_edx.oauth2_provider_trustedclient</code>
     */
    public static final Oauth2ProviderTrustedclient OAUTH2_PROVIDER_TRUSTEDCLIENT = new Oauth2ProviderTrustedclient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Oauth2ProviderTrustedclientRecord> getRecordType() {
        return Oauth2ProviderTrustedclientRecord.class;
    }

    /**
     * The column <code>bitnami_edx.oauth2_provider_trustedclient.id</code>.
     */
    public final TableField<Oauth2ProviderTrustedclientRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_provider_trustedclient.client_id</code>.
     */
    public final TableField<Oauth2ProviderTrustedclientRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.oauth2_provider_trustedclient</code> table reference
     */
    public Oauth2ProviderTrustedclient() {
        this("oauth2_provider_trustedclient", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.oauth2_provider_trustedclient</code> table reference
     */
    public Oauth2ProviderTrustedclient(String alias) {
        this(alias, OAUTH2_PROVIDER_TRUSTEDCLIENT);
    }

    private Oauth2ProviderTrustedclient(String alias, Table<Oauth2ProviderTrustedclientRecord> aliased) {
        this(alias, aliased, null);
    }

    private Oauth2ProviderTrustedclient(String alias, Table<Oauth2ProviderTrustedclientRecord> aliased, Field<?>[] parameters) {
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
    public Identity<Oauth2ProviderTrustedclientRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH2_PROVIDER_TRUSTEDCLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Oauth2ProviderTrustedclientRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH2_PROVIDER_TRUSTEDCLIENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Oauth2ProviderTrustedclientRecord>> getKeys() {
        return Arrays.<UniqueKey<Oauth2ProviderTrustedclientRecord>>asList(Keys.KEY_OAUTH2_PROVIDER_TRUSTEDCLIENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Oauth2ProviderTrustedclientRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<Oauth2ProviderTrustedclientRecord, ?>>asList(Keys.OAUTH2_PROVIDER_TR_CLIENT_ID_BB96EA0BE42C00A_FK_OAUTH2_CLIENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2ProviderTrustedclient as(String alias) {
        return new Oauth2ProviderTrustedclient(alias, this);
    }

    /**
     * Rename this table
     */
    public Oauth2ProviderTrustedclient rename(String name) {
        return new Oauth2ProviderTrustedclient(name, null);
    }
}
