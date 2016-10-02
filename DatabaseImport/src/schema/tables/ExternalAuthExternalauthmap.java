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
import schema.tables.records.ExternalAuthExternalauthmapRecord;


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
public class ExternalAuthExternalauthmap extends TableImpl<ExternalAuthExternalauthmapRecord> {

    private static final long serialVersionUID = 497873887;

    /**
     * The reference instance of <code>bitnami_edx.external_auth_externalauthmap</code>
     */
    public static final ExternalAuthExternalauthmap EXTERNAL_AUTH_EXTERNALAUTHMAP = new ExternalAuthExternalauthmap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExternalAuthExternalauthmapRecord> getRecordType() {
        return ExternalAuthExternalauthmapRecord.class;
    }

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.id</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.external_id</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.external_domain</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> EXTERNAL_DOMAIN = createField("external_domain", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.external_credentials</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> EXTERNAL_CREDENTIALS = createField("external_credentials", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.external_email</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> EXTERNAL_EMAIL = createField("external_email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.external_name</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> EXTERNAL_NAME = createField("external_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.internal_password</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, String> INTERNAL_PASSWORD = createField("internal_password", org.jooq.impl.SQLDataType.VARCHAR.length(31).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.dtcreated</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, Timestamp> DTCREATED = createField("dtcreated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.dtsignup</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, Timestamp> DTSIGNUP = createField("dtsignup", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.external_auth_externalauthmap.user_id</code>.
     */
    public final TableField<ExternalAuthExternalauthmapRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.external_auth_externalauthmap</code> table reference
     */
    public ExternalAuthExternalauthmap() {
        this("external_auth_externalauthmap", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.external_auth_externalauthmap</code> table reference
     */
    public ExternalAuthExternalauthmap(String alias) {
        this(alias, EXTERNAL_AUTH_EXTERNALAUTHMAP);
    }

    private ExternalAuthExternalauthmap(String alias, Table<ExternalAuthExternalauthmapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExternalAuthExternalauthmap(String alias, Table<ExternalAuthExternalauthmapRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ExternalAuthExternalauthmapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXTERNAL_AUTH_EXTERNALAUTHMAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExternalAuthExternalauthmapRecord> getPrimaryKey() {
        return Keys.KEY_EXTERNAL_AUTH_EXTERNALAUTHMAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExternalAuthExternalauthmapRecord>> getKeys() {
        return Arrays.<UniqueKey<ExternalAuthExternalauthmapRecord>>asList(Keys.KEY_EXTERNAL_AUTH_EXTERNALAUTHMAP_PRIMARY, Keys.KEY_EXTERNAL_AUTH_EXTERNALAUTHMAP_EXTERNAL_AUTH_EXTERNALAUTHMAP_EXTERNAL_ID_7F035EF8BC4D313E_UNIQ, Keys.KEY_EXTERNAL_AUTH_EXTERNALAUTHMAP_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExternalAuthExternalauthmapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExternalAuthExternalauthmapRecord, ?>>asList(Keys.EXTERNAL_AUTH_EXTERNALA_USER_ID_644E7779F2D52B9A_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalAuthExternalauthmap as(String alias) {
        return new ExternalAuthExternalauthmap(alias, this);
    }

    /**
     * Rename this table
     */
    public ExternalAuthExternalauthmap rename(String name) {
        return new ExternalAuthExternalauthmap(name, null);
    }
}