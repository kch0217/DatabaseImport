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
import schema.tables.records.AssessmentAssessmentfeedbackAssessmentsRecord;


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
public class AssessmentAssessmentfeedbackAssessments extends TableImpl<AssessmentAssessmentfeedbackAssessmentsRecord> {

    private static final long serialVersionUID = -1214281463;

    /**
     * The reference instance of <code>bitnami_edx.assessment_assessmentfeedback_assessments</code>
     */
    public static final AssessmentAssessmentfeedbackAssessments ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS = new AssessmentAssessmentfeedbackAssessments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentAssessmentfeedbackAssessmentsRecord> getRecordType() {
        return AssessmentAssessmentfeedbackAssessmentsRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback_assessments.id</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackAssessmentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback_assessments.assessmentfeedback_id</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackAssessmentsRecord, Integer> ASSESSMENTFEEDBACK_ID = createField("assessmentfeedback_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback_assessments.assessment_id</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackAssessmentsRecord, Integer> ASSESSMENT_ID = createField("assessment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_assessmentfeedback_assessments</code> table reference
     */
    public AssessmentAssessmentfeedbackAssessments() {
        this("assessment_assessmentfeedback_assessments", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_assessmentfeedback_assessments</code> table reference
     */
    public AssessmentAssessmentfeedbackAssessments(String alias) {
        this(alias, ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS);
    }

    private AssessmentAssessmentfeedbackAssessments(String alias, Table<AssessmentAssessmentfeedbackAssessmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentAssessmentfeedbackAssessments(String alias, Table<AssessmentAssessmentfeedbackAssessmentsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentAssessmentfeedbackAssessmentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentAssessmentfeedbackAssessmentsRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentAssessmentfeedbackAssessmentsRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentAssessmentfeedbackAssessmentsRecord>>asList(Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS_PRIMARY, Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_ASSESSMENTS_ASSESSMENTFEEDBACK_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentAssessmentfeedbackAssessmentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentAssessmentfeedbackAssessmentsRecord, ?>>asList(Keys.D1FC3FA7CD7BE79D20561668A95A9FC1, Keys.ASSES_ASSESSMENT_ID_392D354ECA2E0C87_FK_ASSESSMENT_ASSESSMENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedbackAssessments as(String alias) {
        return new AssessmentAssessmentfeedbackAssessments(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentAssessmentfeedbackAssessments rename(String name) {
        return new AssessmentAssessmentfeedbackAssessments(name, null);
    }
}
