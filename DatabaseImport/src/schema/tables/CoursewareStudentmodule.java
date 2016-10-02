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
import schema.tables.records.CoursewareStudentmoduleRecord;


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
public class CoursewareStudentmodule extends TableImpl<CoursewareStudentmoduleRecord> {

    private static final long serialVersionUID = 2090375003;

    /**
     * The reference instance of <code>bitnami_edx.courseware_studentmodule</code>
     */
    public static final CoursewareStudentmodule COURSEWARE_STUDENTMODULE = new CoursewareStudentmodule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoursewareStudentmoduleRecord> getRecordType() {
        return CoursewareStudentmoduleRecord.class;
    }

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.id</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.module_type</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, String> MODULE_TYPE = createField("module_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.module_id</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, String> MODULE_ID = createField("module_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.course_id</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.state</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.grade</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Double> GRADE = createField("grade", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.max_grade</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Double> MAX_GRADE = createField("max_grade", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.done</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, String> DONE = createField("done", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.created</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.modified</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_studentmodule.student_id</code>.
     */
    public final TableField<CoursewareStudentmoduleRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.courseware_studentmodule</code> table reference
     */
    public CoursewareStudentmodule() {
        this("courseware_studentmodule", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.courseware_studentmodule</code> table reference
     */
    public CoursewareStudentmodule(String alias) {
        this(alias, COURSEWARE_STUDENTMODULE);
    }

    private CoursewareStudentmodule(String alias, Table<CoursewareStudentmoduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoursewareStudentmodule(String alias, Table<CoursewareStudentmoduleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CoursewareStudentmoduleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSEWARE_STUDENTMODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CoursewareStudentmoduleRecord> getPrimaryKey() {
        return Keys.KEY_COURSEWARE_STUDENTMODULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CoursewareStudentmoduleRecord>> getKeys() {
        return Arrays.<UniqueKey<CoursewareStudentmoduleRecord>>asList(Keys.KEY_COURSEWARE_STUDENTMODULE_PRIMARY, Keys.KEY_COURSEWARE_STUDENTMODULE_COURSEWARE_STUDENTMODULE_STUDENT_ID_635D77AEA1256DE5_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CoursewareStudentmoduleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CoursewareStudentmoduleRecord, ?>>asList(Keys.COURSEWARE_STUDENTMO_STUDENT_ID_57005A9A97046500_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodule as(String alias) {
        return new CoursewareStudentmodule(alias, this);
    }

    /**
     * Rename this table
     */
    public CoursewareStudentmodule rename(String name) {
        return new CoursewareStudentmodule(name, null);
    }
}
