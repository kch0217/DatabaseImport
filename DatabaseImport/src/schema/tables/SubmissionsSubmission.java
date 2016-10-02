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
import org.jooq.types.UInteger;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.SubmissionsSubmissionRecord;


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
public class SubmissionsSubmission extends TableImpl<SubmissionsSubmissionRecord> {

    private static final long serialVersionUID = -775577029;

    /**
     * The reference instance of <code>bitnami_edx.submissions_submission</code>
     */
    public static final SubmissionsSubmission SUBMISSIONS_SUBMISSION = new SubmissionsSubmission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubmissionsSubmissionRecord> getRecordType() {
        return SubmissionsSubmissionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.submissions_submission.id</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.uuid</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.attempt_number</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, UInteger> ATTEMPT_NUMBER = createField("attempt_number", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.submitted_at</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, Timestamp> SUBMITTED_AT = createField("submitted_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.created_at</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.raw_answer</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, String> RAW_ANSWER = createField("raw_answer", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.student_item_id</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, Integer> STUDENT_ITEM_ID = createField("student_item_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_submission.status</code>.
     */
    public final TableField<SubmissionsSubmissionRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(1).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.submissions_submission</code> table reference
     */
    public SubmissionsSubmission() {
        this("submissions_submission", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.submissions_submission</code> table reference
     */
    public SubmissionsSubmission(String alias) {
        this(alias, SUBMISSIONS_SUBMISSION);
    }

    private SubmissionsSubmission(String alias, Table<SubmissionsSubmissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubmissionsSubmission(String alias, Table<SubmissionsSubmissionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubmissionsSubmissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBMISSIONS_SUBMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubmissionsSubmissionRecord> getPrimaryKey() {
        return Keys.KEY_SUBMISSIONS_SUBMISSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubmissionsSubmissionRecord>> getKeys() {
        return Arrays.<UniqueKey<SubmissionsSubmissionRecord>>asList(Keys.KEY_SUBMISSIONS_SUBMISSION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SubmissionsSubmissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SubmissionsSubmissionRecord, ?>>asList(Keys.SU_STUDENT_ITEM_ID_D3801FF833D05B1_FK_SUBMISSIONS_STUDENTITEM_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsSubmission as(String alias) {
        return new SubmissionsSubmission(alias, this);
    }

    /**
     * Rename this table
     */
    public SubmissionsSubmission rename(String name) {
        return new SubmissionsSubmission(name, null);
    }
}