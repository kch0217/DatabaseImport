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
import schema.tables.records.Oauth2AccesstokenRecord;


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
public class Oauth2Accesstoken extends TableImpl<Oauth2AccesstokenRecord> {

    private static final long serialVersionUID = 191820375;

    /**
     * The reference instance of <code>bitnami_edx.oauth2_accesstoken</code>
     */
    public static final Oauth2Accesstoken OAUTH2_ACCESSTOKEN = new Oauth2Accesstoken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Oauth2AccesstokenRecord> getRecordType() {
        return Oauth2AccesstokenRecord.class;
    }

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.id</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.token</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.expires</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, Timestamp> EXPIRES = createField("expires", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.scope</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, Integer> SCOPE = createField("scope", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.client_id</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.oauth2_accesstoken.user_id</code>.
     */
    public final TableField<Oauth2AccesstokenRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.oauth2_accesstoken</code> table reference
     */
    public Oauth2Accesstoken() {
        this("oauth2_accesstoken", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.oauth2_accesstoken</code> table reference
     */
    public Oauth2Accesstoken(String alias) {
        this(alias, OAUTH2_ACCESSTOKEN);
    }

    private Oauth2Accesstoken(String alias, Table<Oauth2AccesstokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Oauth2Accesstoken(String alias, Table<Oauth2AccesstokenRecord> aliased, Field<?>[] parameters) {
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
    public Identity<Oauth2AccesstokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH2_ACCESSTOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Oauth2AccesstokenRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH2_ACCESSTOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Oauth2AccesstokenRecord>> getKeys() {
        return Arrays.<UniqueKey<Oauth2AccesstokenRecord>>asList(Keys.KEY_OAUTH2_ACCESSTOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Oauth2AccesstokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<Oauth2AccesstokenRecord, ?>>asList(Keys.OAUTH2_ACCESSTOKE_CLIENT_ID_20C73B03A7C139A2_FK_OAUTH2_CLIENT_ID, Keys.OAUTH2_ACCESSTOKEN_USER_ID_7A865C7085722378_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2Accesstoken as(String alias) {
        return new Oauth2Accesstoken(alias, this);
    }

    /**
     * Rename this table
     */
    public Oauth2Accesstoken rename(String name) {
        return new Oauth2Accesstoken(name, null);
    }
}
