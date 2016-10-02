/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
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
import schema.tables.records.DjangoMigrationsRecord;


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
public class DjangoMigrations extends TableImpl<DjangoMigrationsRecord> {

    private static final long serialVersionUID = -1510362244;

    /**
     * The reference instance of <code>bitnami_edx.django_migrations</code>
     */
    public static final DjangoMigrations DJANGO_MIGRATIONS = new DjangoMigrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjangoMigrationsRecord> getRecordType() {
        return DjangoMigrationsRecord.class;
    }

    /**
     * The column <code>bitnami_edx.django_migrations.id</code>.
     */
    public final TableField<DjangoMigrationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_migrations.app</code>.
     */
    public final TableField<DjangoMigrationsRecord, String> APP = createField("app", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_migrations.name</code>.
     */
    public final TableField<DjangoMigrationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.django_migrations.applied</code>.
     */
    public final TableField<DjangoMigrationsRecord, Timestamp> APPLIED = createField("applied", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.django_migrations</code> table reference
     */
    public DjangoMigrations() {
        this("django_migrations", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.django_migrations</code> table reference
     */
    public DjangoMigrations(String alias) {
        this(alias, DJANGO_MIGRATIONS);
    }

    private DjangoMigrations(String alias, Table<DjangoMigrationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjangoMigrations(String alias, Table<DjangoMigrationsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DjangoMigrationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DJANGO_MIGRATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjangoMigrationsRecord> getPrimaryKey() {
        return Keys.KEY_DJANGO_MIGRATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjangoMigrationsRecord>> getKeys() {
        return Arrays.<UniqueKey<DjangoMigrationsRecord>>asList(Keys.KEY_DJANGO_MIGRATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrations as(String alias) {
        return new DjangoMigrations(alias, this);
    }

    /**
     * Rename this table
     */
    public DjangoMigrations rename(String name) {
        return new DjangoMigrations(name, null);
    }
}