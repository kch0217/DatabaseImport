/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.AuthUserGroups;


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
public class AuthUserGroupsRecord extends UpdatableRecordImpl<AuthUserGroupsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1961928959;

    /**
     * Setter for <code>bitnami_edx.auth_user_groups.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.auth_user_groups.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.auth_user_groups.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.auth_user_groups.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.auth_user_groups.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.auth_user_groups.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AuthUserGroups.AUTH_USER_GROUPS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AuthUserGroups.AUTH_USER_GROUPS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AuthUserGroups.AUTH_USER_GROUPS.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthUserGroupsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthUserGroupsRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthUserGroupsRecord value3(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthUserGroupsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthUserGroupsRecord
     */
    public AuthUserGroupsRecord() {
        super(AuthUserGroups.AUTH_USER_GROUPS);
    }

    /**
     * Create a detached, initialised AuthUserGroupsRecord
     */
    public AuthUserGroupsRecord(Integer id, Integer userId, Integer groupId) {
        super(AuthUserGroups.AUTH_USER_GROUPS);

        set(0, id);
        set(1, userId);
        set(2, groupId);
    }
}
