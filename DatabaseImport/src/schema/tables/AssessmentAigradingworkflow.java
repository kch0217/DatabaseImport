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
import schema.tables.records.AssessmentAigradingworkflowRecord;


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
public class AssessmentAigradingworkflow extends TableImpl<AssessmentAigradingworkflowRecord> {

    private static final long serialVersionUID = -62574857;

    /**
     * The reference instance of <code>bitnami_edx.assessment_aigradingworkflow</code>
     */
    public static final AssessmentAigradingworkflow ASSESSMENT_AIGRADINGWORKFLOW = new AssessmentAigradingworkflow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentAigradingworkflowRecord> getRecordType() {
        return AssessmentAigradingworkflowRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.uuid</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.course_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.item_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.scheduled_at</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Timestamp> SCHEDULED_AT = createField("scheduled_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.completed_at</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Timestamp> COMPLETED_AT = createField("completed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.algorithm_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> ALGORITHM_ID = createField("algorithm_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.submission_uuid</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.essay_text</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> ESSAY_TEXT = createField("essay_text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.student_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, String> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.assessment_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Integer> ASSESSMENT_ID = createField("assessment_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.classifier_set_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Integer> CLASSIFIER_SET_ID = createField("classifier_set_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.assessment_aigradingworkflow.rubric_id</code>.
     */
    public final TableField<AssessmentAigradingworkflowRecord, Integer> RUBRIC_ID = createField("rubric_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_aigradingworkflow</code> table reference
     */
    public AssessmentAigradingworkflow() {
        this("assessment_aigradingworkflow", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_aigradingworkflow</code> table reference
     */
    public AssessmentAigradingworkflow(String alias) {
        this(alias, ASSESSMENT_AIGRADINGWORKFLOW);
    }

    private AssessmentAigradingworkflow(String alias, Table<AssessmentAigradingworkflowRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentAigradingworkflow(String alias, Table<AssessmentAigradingworkflowRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentAigradingworkflowRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_AIGRADINGWORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentAigradingworkflowRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_AIGRADINGWORKFLOW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentAigradingworkflowRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentAigradingworkflowRecord>>asList(Keys.KEY_ASSESSMENT_AIGRADINGWORKFLOW_PRIMARY, Keys.KEY_ASSESSMENT_AIGRADINGWORKFLOW_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentAigradingworkflowRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentAigradingworkflowRecord, ?>>asList(Keys.ASSES_ASSESSMENT_ID_68B86880A7F62F1C_FK_ASSESSMENT_ASSESSMENT_ID, Keys.D4D9BCA115376AEB07FD970155499DB3, Keys.ASSESSMENT_AI_RUBRIC_ID_3FC938E9E3AE7B2D_FK_ASSESSMENT_RUBRIC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAigradingworkflow as(String alias) {
        return new AssessmentAigradingworkflow(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentAigradingworkflow rename(String name) {
        return new AssessmentAigradingworkflow(name, null);
    }
}
