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
import schema.tables.records.StudentEnrollmentrefundconfigurationRecord;


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
public class StudentEnrollmentrefundconfiguration extends TableImpl<StudentEnrollmentrefundconfigurationRecord> {

    private static final long serialVersionUID = 1230068339;

    /**
     * The reference instance of <code>bitnami_edx.student_enrollmentrefundconfiguration</code>
     */
    public static final StudentEnrollmentrefundconfiguration STUDENT_ENROLLMENTREFUNDCONFIGURATION = new StudentEnrollmentrefundconfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentEnrollmentrefundconfigurationRecord> getRecordType() {
        return StudentEnrollmentrefundconfigurationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.student_enrollmentrefundconfiguration.id</code>.
     */
    public final TableField<StudentEnrollmentrefundconfigurationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_enrollmentrefundconfiguration.change_date</code>.
     */
    public final TableField<StudentEnrollmentrefundconfigurationRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_enrollmentrefundconfiguration.enabled</code>.
     */
    public final TableField<StudentEnrollmentrefundconfigurationRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_enrollmentrefundconfiguration.refund_window_microseconds</code>.
     */
    public final TableField<StudentEnrollmentrefundconfigurationRecord, Long> REFUND_WINDOW_MICROSECONDS = createField("refund_window_microseconds", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_enrollmentrefundconfiguration.changed_by_id</code>.
     */
    public final TableField<StudentEnrollmentrefundconfigurationRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.student_enrollmentrefundconfiguration</code> table reference
     */
    public StudentEnrollmentrefundconfiguration() {
        this("student_enrollmentrefundconfiguration", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.student_enrollmentrefundconfiguration</code> table reference
     */
    public StudentEnrollmentrefundconfiguration(String alias) {
        this(alias, STUDENT_ENROLLMENTREFUNDCONFIGURATION);
    }

    private StudentEnrollmentrefundconfiguration(String alias, Table<StudentEnrollmentrefundconfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentEnrollmentrefundconfiguration(String alias, Table<StudentEnrollmentrefundconfigurationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StudentEnrollmentrefundconfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT_ENROLLMENTREFUNDCONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentEnrollmentrefundconfigurationRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_ENROLLMENTREFUNDCONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentEnrollmentrefundconfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentEnrollmentrefundconfigurationRecord>>asList(Keys.KEY_STUDENT_ENROLLMENTREFUNDCONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentEnrollmentrefundconfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentEnrollmentrefundconfigurationRecord, ?>>asList(Keys.STUDENT_ENROLLMEN_CHANGED_BY_ID_59C187AC05E64A11_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentEnrollmentrefundconfiguration as(String alias) {
        return new StudentEnrollmentrefundconfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentEnrollmentrefundconfiguration rename(String name) {
        return new StudentEnrollmentrefundconfiguration(name, null);
    }
}
