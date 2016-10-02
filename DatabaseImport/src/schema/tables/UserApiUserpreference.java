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
import schema.tables.records.UserApiUserpreferenceRecord;


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
public class UserApiUserpreference extends TableImpl<UserApiUserpreferenceRecord> {

    private static final long serialVersionUID = 758616012;

    /**
     * The reference instance of <code>bitnami_edx.user_api_userpreference</code>
     */
    public static final UserApiUserpreference USER_API_USERPREFERENCE = new UserApiUserpreference();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserApiUserpreferenceRecord> getRecordType() {
        return UserApiUserpreferenceRecord.class;
    }

    /**
     * The column <code>bitnami_edx.user_api_userpreference.id</code>.
     */
    public final TableField<UserApiUserpreferenceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.user_api_userpreference.key</code>.
     */
    public final TableField<UserApiUserpreferenceRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.user_api_userpreference.value</code>.
     */
    public final TableField<UserApiUserpreferenceRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.user_api_userpreference.user_id</code>.
     */
    public final TableField<UserApiUserpreferenceRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.user_api_userpreference</code> table reference
     */
    public UserApiUserpreference() {
        this("user_api_userpreference", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.user_api_userpreference</code> table reference
     */
    public UserApiUserpreference(String alias) {
        this(alias, USER_API_USERPREFERENCE);
    }

    private UserApiUserpreference(String alias, Table<UserApiUserpreferenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserApiUserpreference(String alias, Table<UserApiUserpreferenceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserApiUserpreferenceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_API_USERPREFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserApiUserpreferenceRecord> getPrimaryKey() {
        return Keys.KEY_USER_API_USERPREFERENCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserApiUserpreferenceRecord>> getKeys() {
        return Arrays.<UniqueKey<UserApiUserpreferenceRecord>>asList(Keys.KEY_USER_API_USERPREFERENCE_PRIMARY, Keys.KEY_USER_API_USERPREFERENCE_USER_API_USERPREFERENCE_USER_ID_4E4942D73F760072_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserApiUserpreferenceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserApiUserpreferenceRecord, ?>>asList(Keys.USER_API_USERPREFERENCE_USER_ID_41F12E3954B69095_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserpreference as(String alias) {
        return new UserApiUserpreference(alias, this);
    }

    /**
     * Rename this table
     */
    public UserApiUserpreference rename(String name) {
        return new UserApiUserpreference(name, null);
    }
}