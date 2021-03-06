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
import schema.tables.records.AuthUserGroupsRecord;


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
public class AuthUserGroups extends TableImpl<AuthUserGroupsRecord> {

    private static final long serialVersionUID = 1858415152;

    /**
     * The reference instance of <code>bitnami_edx.auth_user_groups</code>
     */
    public static final AuthUserGroups AUTH_USER_GROUPS = new AuthUserGroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthUserGroupsRecord> getRecordType() {
        return AuthUserGroupsRecord.class;
    }

    /**
     * The column <code>bitnami_edx.auth_user_groups.id</code>.
     */
    public final TableField<AuthUserGroupsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.auth_user_groups.user_id</code>.
     */
    public final TableField<AuthUserGroupsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.auth_user_groups.group_id</code>.
     */
    public final TableField<AuthUserGroupsRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.auth_user_groups</code> table reference
     */
    public AuthUserGroups() {
        this("auth_user_groups", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.auth_user_groups</code> table reference
     */
    public AuthUserGroups(String alias) {
        this(alias, AUTH_USER_GROUPS);
    }

    private AuthUserGroups(String alias, Table<AuthUserGroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthUserGroups(String alias, Table<AuthUserGroupsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AuthUserGroupsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTH_USER_GROUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthUserGroupsRecord> getPrimaryKey() {
        return Keys.KEY_AUTH_USER_GROUPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthUserGroupsRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthUserGroupsRecord>>asList(Keys.KEY_AUTH_USER_GROUPS_PRIMARY, Keys.KEY_AUTH_USER_GROUPS_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthUserGroupsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthUserGroupsRecord, ?>>asList(Keys.AUTH_USER_GROUPS_USER_ID_4B5ED4FFDB8FD9B0_FK_AUTH_USER_ID, Keys.AUTH_USER_GROUPS_GROUP_ID_33AC548DCF5F8E37_FK_AUTH_GROUP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthUserGroups as(String alias) {
        return new AuthUserGroups(alias, this);
    }

    /**
     * Rename this table
     */
    public AuthUserGroups rename(String name) {
        return new AuthUserGroups(name, null);
    }
}
