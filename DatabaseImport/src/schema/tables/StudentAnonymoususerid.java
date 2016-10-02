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
import schema.tables.records.StudentAnonymoususeridRecord;


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
public class StudentAnonymoususerid extends TableImpl<StudentAnonymoususeridRecord> {

    private static final long serialVersionUID = 390131327;

    /**
     * The reference instance of <code>bitnami_edx.student_anonymoususerid</code>
     */
    public static final StudentAnonymoususerid STUDENT_ANONYMOUSUSERID = new StudentAnonymoususerid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentAnonymoususeridRecord> getRecordType() {
        return StudentAnonymoususeridRecord.class;
    }

    /**
     * The column <code>bitnami_edx.student_anonymoususerid.id</code>.
     */
    public final TableField<StudentAnonymoususeridRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_anonymoususerid.anonymous_user_id</code>.
     */
    public final TableField<StudentAnonymoususeridRecord, String> ANONYMOUS_USER_ID = createField("anonymous_user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_anonymoususerid.course_id</code>.
     */
    public final TableField<StudentAnonymoususeridRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_anonymoususerid.user_id</code>.
     */
    public final TableField<StudentAnonymoususeridRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.student_anonymoususerid</code> table reference
     */
    public StudentAnonymoususerid() {
        this("student_anonymoususerid", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.student_anonymoususerid</code> table reference
     */
    public StudentAnonymoususerid(String alias) {
        this(alias, STUDENT_ANONYMOUSUSERID);
    }

    private StudentAnonymoususerid(String alias, Table<StudentAnonymoususeridRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentAnonymoususerid(String alias, Table<StudentAnonymoususeridRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StudentAnonymoususeridRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT_ANONYMOUSUSERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentAnonymoususeridRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_ANONYMOUSUSERID_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentAnonymoususeridRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentAnonymoususeridRecord>>asList(Keys.KEY_STUDENT_ANONYMOUSUSERID_PRIMARY, Keys.KEY_STUDENT_ANONYMOUSUSERID_ANONYMOUS_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentAnonymoususeridRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentAnonymoususeridRecord, ?>>asList(Keys.STUDENT_ANONYMOUSUSERID_USER_ID_1A18AF72CF6B95F7_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentAnonymoususerid as(String alias) {
        return new StudentAnonymoususerid(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentAnonymoususerid rename(String name) {
        return new StudentAnonymoususerid(name, null);
    }
}
