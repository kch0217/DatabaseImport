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
import schema.tables.records.AssessmentStudenttrainingworkflowRecord;


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
public class AssessmentStudenttrainingworkflow extends TableImpl<AssessmentStudenttrainingworkflowRecord> {

    private static final long serialVersionUID = -1047276512;

    /**
     * The reference instance of <code>bitnami_edx.assessment_studenttrainingworkflow</code>
     */
    public static final AssessmentStudenttrainingworkflow ASSESSMENT_STUDENTTRAININGWORKFLOW = new AssessmentStudenttrainingworkflow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentStudenttrainingworkflowRecord> getRecordType() {
        return AssessmentStudenttrainingworkflowRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflow.id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflow.submission_uuid</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflow.student_id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowRecord, String> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflow.item_id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflow.course_id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_studenttrainingworkflow</code> table reference
     */
    public AssessmentStudenttrainingworkflow() {
        this("assessment_studenttrainingworkflow", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_studenttrainingworkflow</code> table reference
     */
    public AssessmentStudenttrainingworkflow(String alias) {
        this(alias, ASSESSMENT_STUDENTTRAININGWORKFLOW);
    }

    private AssessmentStudenttrainingworkflow(String alias, Table<AssessmentStudenttrainingworkflowRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentStudenttrainingworkflow(String alias, Table<AssessmentStudenttrainingworkflowRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentStudenttrainingworkflowRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_STUDENTTRAININGWORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentStudenttrainingworkflowRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentStudenttrainingworkflowRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentStudenttrainingworkflowRecord>>asList(Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOW_PRIMARY, Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOW_SUBMISSION_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflow as(String alias) {
        return new AssessmentStudenttrainingworkflow(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentStudenttrainingworkflow rename(String name) {
        return new AssessmentStudenttrainingworkflow(name, null);
    }
}
