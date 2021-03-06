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
import schema.tables.records.StudentLoginfailuresRecord;


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
public class StudentLoginfailures extends TableImpl<StudentLoginfailuresRecord> {

    private static final long serialVersionUID = -548026331;

    /**
     * The reference instance of <code>bitnami_edx.student_loginfailures</code>
     */
    public static final StudentLoginfailures STUDENT_LOGINFAILURES = new StudentLoginfailures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentLoginfailuresRecord> getRecordType() {
        return StudentLoginfailuresRecord.class;
    }

    /**
     * The column <code>bitnami_edx.student_loginfailures.id</code>.
     */
    public final TableField<StudentLoginfailuresRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_loginfailures.failure_count</code>.
     */
    public final TableField<StudentLoginfailuresRecord, Integer> FAILURE_COUNT = createField("failure_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_loginfailures.lockout_until</code>.
     */
    public final TableField<StudentLoginfailuresRecord, Timestamp> LOCKOUT_UNTIL = createField("lockout_until", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.student_loginfailures.user_id</code>.
     */
    public final TableField<StudentLoginfailuresRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.student_loginfailures</code> table reference
     */
    public StudentLoginfailures() {
        this("student_loginfailures", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.student_loginfailures</code> table reference
     */
    public StudentLoginfailures(String alias) {
        this(alias, STUDENT_LOGINFAILURES);
    }

    private StudentLoginfailures(String alias, Table<StudentLoginfailuresRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentLoginfailures(String alias, Table<StudentLoginfailuresRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StudentLoginfailuresRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT_LOGINFAILURES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentLoginfailuresRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_LOGINFAILURES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentLoginfailuresRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentLoginfailuresRecord>>asList(Keys.KEY_STUDENT_LOGINFAILURES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentLoginfailuresRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentLoginfailuresRecord, ?>>asList(Keys.STUDENT_LOGINFAILURES_USER_ID_3DAAC39F3118BAC4_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentLoginfailures as(String alias) {
        return new StudentLoginfailures(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentLoginfailures rename(String name) {
        return new StudentLoginfailures(name, null);
    }
}
