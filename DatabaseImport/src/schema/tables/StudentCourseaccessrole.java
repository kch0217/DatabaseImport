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
import schema.tables.records.StudentCourseaccessroleRecord;


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
public class StudentCourseaccessrole extends TableImpl<StudentCourseaccessroleRecord> {

    private static final long serialVersionUID = 89711281;

    /**
     * The reference instance of <code>bitnami_edx.student_courseaccessrole</code>
     */
    public static final StudentCourseaccessrole STUDENT_COURSEACCESSROLE = new StudentCourseaccessrole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentCourseaccessroleRecord> getRecordType() {
        return StudentCourseaccessroleRecord.class;
    }

    /**
     * The column <code>bitnami_edx.student_courseaccessrole.id</code>.
     */
    public final TableField<StudentCourseaccessroleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_courseaccessrole.org</code>.
     */
    public final TableField<StudentCourseaccessroleRecord, String> ORG = createField("org", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_courseaccessrole.course_id</code>.
     */
    public final TableField<StudentCourseaccessroleRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_courseaccessrole.role</code>.
     */
    public final TableField<StudentCourseaccessroleRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.student_courseaccessrole.user_id</code>.
     */
    public final TableField<StudentCourseaccessroleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.student_courseaccessrole</code> table reference
     */
    public StudentCourseaccessrole() {
        this("student_courseaccessrole", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.student_courseaccessrole</code> table reference
     */
    public StudentCourseaccessrole(String alias) {
        this(alias, STUDENT_COURSEACCESSROLE);
    }

    private StudentCourseaccessrole(String alias, Table<StudentCourseaccessroleRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentCourseaccessrole(String alias, Table<StudentCourseaccessroleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StudentCourseaccessroleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT_COURSEACCESSROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentCourseaccessroleRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_COURSEACCESSROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentCourseaccessroleRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentCourseaccessroleRecord>>asList(Keys.KEY_STUDENT_COURSEACCESSROLE_PRIMARY, Keys.KEY_STUDENT_COURSEACCESSROLE_STUDENT_COURSEACCESSROLE_USER_ID_3203176C4F474414_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentCourseaccessroleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentCourseaccessroleRecord, ?>>asList(Keys.STUDENT_COURSEACCESSROL_USER_ID_5E0F68B978AD0792_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentCourseaccessrole as(String alias) {
        return new StudentCourseaccessrole(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentCourseaccessrole rename(String name) {
        return new StudentCourseaccessrole(name, null);
    }
}
