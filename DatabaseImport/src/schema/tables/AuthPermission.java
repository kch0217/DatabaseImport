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
import schema.tables.records.AuthPermissionRecord;


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
public class AuthPermission extends TableImpl<AuthPermissionRecord> {

    private static final long serialVersionUID = 2136598303;

    /**
     * The reference instance of <code>bitnami_edx.auth_permission</code>
     */
    public static final AuthPermission AUTH_PERMISSION = new AuthPermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthPermissionRecord> getRecordType() {
        return AuthPermissionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.auth_permission.id</code>.
     */
    public final TableField<AuthPermissionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.auth_permission.name</code>.
     */
    public final TableField<AuthPermissionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.auth_permission.content_type_id</code>.
     */
    public final TableField<AuthPermissionRecord, Integer> CONTENT_TYPE_ID = createField("content_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.auth_permission.codename</code>.
     */
    public final TableField<AuthPermissionRecord, String> CODENAME = createField("codename", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.auth_permission</code> table reference
     */
    public AuthPermission() {
        this("auth_permission", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.auth_permission</code> table reference
     */
    public AuthPermission(String alias) {
        this(alias, AUTH_PERMISSION);
    }

    private AuthPermission(String alias, Table<AuthPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthPermission(String alias, Table<AuthPermissionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AuthPermissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTH_PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthPermissionRecord> getPrimaryKey() {
        return Keys.KEY_AUTH_PERMISSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthPermissionRecord>>asList(Keys.KEY_AUTH_PERMISSION_PRIMARY, Keys.KEY_AUTH_PERMISSION_CONTENT_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthPermissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthPermissionRecord, ?>>asList(Keys.AUTH__CONTENT_TYPE_ID_508CF46651277A81_FK_DJANGO_CONTENT_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthPermission as(String alias) {
        return new AuthPermission(alias, this);
    }

    /**
     * Rename this table
     */
    public AuthPermission rename(String name) {
        return new AuthPermission(name, null);
    }
}
