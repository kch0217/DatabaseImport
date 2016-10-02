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
import schema.tables.records.AssessmentAssessmentfeedbackRecord;


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
public class AssessmentAssessmentfeedback extends TableImpl<AssessmentAssessmentfeedbackRecord> {

    private static final long serialVersionUID = 2076145552;

    /**
     * The reference instance of <code>bitnami_edx.assessment_assessmentfeedback</code>
     */
    public static final AssessmentAssessmentfeedback ASSESSMENT_ASSESSMENTFEEDBACK = new AssessmentAssessmentfeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentAssessmentfeedbackRecord> getRecordType() {
        return AssessmentAssessmentfeedbackRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback.id</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback.submission_uuid</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_assessmentfeedback.feedback_text</code>.
     */
    public final TableField<AssessmentAssessmentfeedbackRecord, String> FEEDBACK_TEXT = createField("feedback_text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_assessmentfeedback</code> table reference
     */
    public AssessmentAssessmentfeedback() {
        this("assessment_assessmentfeedback", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_assessmentfeedback</code> table reference
     */
    public AssessmentAssessmentfeedback(String alias) {
        this(alias, ASSESSMENT_ASSESSMENTFEEDBACK);
    }

    private AssessmentAssessmentfeedback(String alias, Table<AssessmentAssessmentfeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentAssessmentfeedback(String alias, Table<AssessmentAssessmentfeedbackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentAssessmentfeedbackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_ASSESSMENTFEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentAssessmentfeedbackRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentAssessmentfeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentAssessmentfeedbackRecord>>asList(Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_PRIMARY, Keys.KEY_ASSESSMENT_ASSESSMENTFEEDBACK_SUBMISSION_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAssessmentfeedback as(String alias) {
        return new AssessmentAssessmentfeedback(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentAssessmentfeedback rename(String name) {
        return new AssessmentAssessmentfeedback(name, null);
    }
}
