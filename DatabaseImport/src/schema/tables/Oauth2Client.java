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
import schema.tables.records.Oauth2ClientRecord;


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
public class Oauth2Client extends TableImpl<Oauth2ClientRecord> {

    private static final long serialVersionUID = 1733841873;

    /**
     * The reference instance of <code>bitnami_edx.oauth2_client</code>
     */
    public static final Oauth2Client OAUTH2_CLIENT = new Oauth2Client();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Oauth2ClientRecord> getRecordType() {
        return Oauth2ClientRecord.class;
    }

    /**
     * The column <code>bitnami_edx.oauth2_client.id</code>.
     */
    public final TableField<Oauth2ClientRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.name</code>.
     */
    public final TableField<Oauth2ClientRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.url</code>.
     */
    public final TableField<Oauth2ClientRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.redirect_uri</code>.
     */
    public final TableField<Oauth2ClientRecord, String> REDIRECT_URI = createField("redirect_uri", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.client_id</code>.
     */
    public final TableField<Oauth2ClientRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.client_secret</code>.
     */
    public final TableField<Oauth2ClientRecord, String> CLIENT_SECRET = createField("client_secret", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.client_type</code>.
     */
    public final TableField<Oauth2ClientRecord, Integer> CLIENT_TYPE = createField("client_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_client.user_id</code>.
     */
    public final TableField<Oauth2ClientRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.oauth2_client</code> table reference
     */
    public Oauth2Client() {
        this("oauth2_client", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.oauth2_client</code> table reference
     */
    public Oauth2Client(String alias) {
        this(alias, OAUTH2_CLIENT);
    }

    private Oauth2Client(String alias, Table<Oauth2ClientRecord> aliased) {
        this(alias, aliased, null);
    }

    private Oauth2Client(String alias, Table<Oauth2ClientRecord> aliased, Field<?>[] parameters) {
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
    public Identity<Oauth2ClientRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH2_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Oauth2ClientRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH2_CLIENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Oauth2ClientRecord>> getKeys() {
        return Arrays.<UniqueKey<Oauth2ClientRecord>>asList(Keys.KEY_OAUTH2_CLIENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Oauth2ClientRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<Oauth2ClientRecord, ?>>asList(Keys.OAUTH2_CLIENT_USER_ID_2B47284BBD512FE1_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2Client as(String alias) {
        return new Oauth2Client(alias, this);
    }

    /**
     * Rename this table
     */
    public Oauth2Client rename(String name) {
        return new Oauth2Client(name, null);
    }
}
