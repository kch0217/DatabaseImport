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
import schema.tables.records.DjangoCommentClientRoleRecord;


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
public class DjangoCommentClientRole extends TableImpl<DjangoCommentClientRoleRecord> {

    private static final long serialVersionUID = -859243354;

    /**
     * The reference instance of <code>bitnami_edx.django_comment_client_role</code>
     */
    public static final DjangoCommentClientRole DJANGO_COMMENT_CLIENT_ROLE = new DjangoCommentClientRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjangoCommentClientRoleRecord> getRecordType() {
        return DjangoCommentClientRoleRecord.class;
    }

    /**
     * The column <code>bitnami_edx.django_comment_client_role.id</code>.
     */
    public final TableField<DjangoCommentClientRoleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_comment_client_role.name</code>.
     */
    public final TableField<DjangoCommentClientRoleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_comment_client_role.course_id</code>.
     */
    public final TableField<DjangoCommentClientRoleRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.django_comment_client_role</code> table reference
     */
    public DjangoCommentClientRole() {
        this("django_comment_client_role", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.django_comment_client_role</code> table reference
     */
    public DjangoCommentClientRole(String alias) {
        this(alias, DJANGO_COMMENT_CLIENT_ROLE);
    }

    private DjangoCommentClientRole(String alias, Table<DjangoCommentClientRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjangoCommentClientRole(String alias, Table<DjangoCommentClientRoleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DjangoCommentClientRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DJANGO_COMMENT_CLIENT_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjangoCommentClientRoleRecord> getPrimaryKey() {
        return Keys.KEY_DJANGO_COMMENT_CLIENT_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjangoCommentClientRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<DjangoCommentClientRoleRecord>>asList(Keys.KEY_DJANGO_COMMENT_CLIENT_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoCommentClientRole as(String alias) {
        return new DjangoCommentClientRole(alias, this);
    }

    /**
     * Rename this table
     */
    public DjangoCommentClientRole rename(String name) {
        return new DjangoCommentClientRole(name, null);
    }
}
