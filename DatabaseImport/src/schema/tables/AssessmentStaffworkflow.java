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
import schema.tables.records.AssessmentStaffworkflowRecord;


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
public class AssessmentStaffworkflow extends TableImpl<AssessmentStaffworkflowRecord> {

    private static final long serialVersionUID = -955317473;

    /**
     * The reference instance of <code>bitnami_edx.assessment_staffworkflow</code>
     */
    public static final AssessmentStaffworkflow ASSESSMENT_STAFFWORKFLOW = new AssessmentStaffworkflow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentStaffworkflowRecord> getRecordType() {
        return AssessmentStaffworkflowRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.id</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.scorer_id</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, String> SCORER_ID = createField("scorer_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.course_id</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.item_id</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.submission_uuid</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.created_at</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.grading_completed_at</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, Timestamp> GRADING_COMPLETED_AT = createField("grading_completed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.grading_started_at</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, Timestamp> GRADING_STARTED_AT = createField("grading_started_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.cancelled_at</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, Timestamp> CANCELLED_AT = createField("cancelled_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_staffworkflow.assessment</code>.
     */
    public final TableField<AssessmentStaffworkflowRecord, String> ASSESSMENT = createField("assessment", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_staffworkflow</code> table reference
     */
    public AssessmentStaffworkflow() {
        this("assessment_staffworkflow", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_staffworkflow</code> table reference
     */
    public AssessmentStaffworkflow(String alias) {
        this(alias, ASSESSMENT_STAFFWORKFLOW);
    }

    private AssessmentStaffworkflow(String alias, Table<AssessmentStaffworkflowRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentStaffworkflow(String alias, Table<AssessmentStaffworkflowRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentStaffworkflowRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_STAFFWORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentStaffworkflowRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_STAFFWORKFLOW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentStaffworkflowRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentStaffworkflowRecord>>asList(Keys.KEY_ASSESSMENT_STAFFWORKFLOW_PRIMARY, Keys.KEY_ASSESSMENT_STAFFWORKFLOW_SUBMISSION_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStaffworkflow as(String alias) {
        return new AssessmentStaffworkflow(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentStaffworkflow rename(String name) {
        return new AssessmentStaffworkflow(name, null);
    }
}
