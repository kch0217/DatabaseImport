/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.DjangoMigrations;


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
public class DjangoMigrationsRecord extends UpdatableRecordImpl<DjangoMigrationsRecord> implements Record4<Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -1718990732;

    /**
     * Setter for <code>bitnami_edx.django_migrations.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_migrations.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.django_migrations.app</code>.
     */
    public void setApp(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_migrations.app</code>.
     */
    public String getApp() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.django_migrations.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_migrations.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.django_migrations.applied</code>.
     */
    public void setApplied(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_migrations.applied</code>.
     */
    public Timestamp getApplied() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjangoMigrations.DJANGO_MIGRATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DjangoMigrations.DJANGO_MIGRATIONS.APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DjangoMigrations.DJANGO_MIGRATIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return DjangoMigrations.DJANGO_MIGRATIONS.APPLIED;
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
    public String value2() {
        return getApp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getApplied();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrationsRecord value2(String value) {
        setApp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrationsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrationsRecord value4(Timestamp value) {
        setApplied(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrationsRecord values(Integer value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjangoMigrationsRecord
     */
    public DjangoMigrationsRecord() {
        super(DjangoMigrations.DJANGO_MIGRATIONS);
    }

    /**
     * Create a detached, initialised DjangoMigrationsRecord
     */
    public DjangoMigrationsRecord(Integer id, String app, String name, Timestamp applied) {
        super(DjangoMigrations.DJANGO_MIGRATIONS);

        set(0, id);
        set(1, app);
        set(2, name);
        set(3, applied);
    }
}
