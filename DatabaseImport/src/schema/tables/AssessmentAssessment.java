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
import schema.tables.records.AssessmentAssessmentRecord;


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
public class AssessmentAssessment extends TableImpl<AssessmentAssessmentRecord> {

    private static final long serialVersionUID = 1301354782;

    /**
     * The reference instance of <code>bitnami_edx.assessment_assessment</code>
     */
    public static final AssessmentAssessment ASSESSMENT_ASSESSMENT = new AssessmentAssessment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentAssessmentRecord> getRecordType() {
        return AssessmentAssessmentRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_assessment.id</code>.
     */
    public final TableField<AssessmentAssessmentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.submission_uuid</code>.
     */
    public final TableField<AssessmentAssessmentRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.scored_at</code>.
     */
    public final TableField<AssessmentAssessmentRecord, Timestamp> SCORED_AT = createField("scored_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.scorer_id</code>.
     */
    public final TableField<AssessmentAssessmentRecord, String> SCORER_ID = createField("scorer_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.score_type</code>.
     */
    public final TableField<AssessmentAssessmentRecord, String> SCORE_TYPE = createField("score_type", org.jooq.impl.SQLDataType.VARCHAR.length(2).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.feedback</code>.
     */
    public final TableField<AssessmentAssessmentRecord, String> FEEDBACK = createField("feedback", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessment.rubric_id</code>.
     */
    public final TableField<AssessmentAssessmentRecord, Integer> RUBRIC_ID = createField("rubric_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_assessment</code> table reference
     */
    public AssessmentAssessment() {
        this("assessment_assessment", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_assessment</code> table reference
     */
    public AssessmentAssessment(String alias) {
        this(alias, ASSESSMENT_ASSESSMENT);
    }

    private AssessmentAssessment(String alias, Table<AssessmentAssessmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentAssessment(String alias, Table<AssessmentAssessmentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentAssessmentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_ASSESSMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentAssessmentRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_ASSESSMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentAssessmentRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentAssessmentRecord>>asList(Keys.KEY_ASSESSMENT_ASSESSMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentAssessmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentAssessmentRecord, ?>>asList(Keys.ASSESSMENT_AS_RUBRIC_ID_7997F01DCBD05633_FK_ASSESSMENT_RUBRIC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessment as(String alias) {
        return new AssessmentAssessment(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentAssessment rename(String name) {
        return new AssessmentAssessment(name, null);
    }
}
