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
import schema.tables.records.AssessmentPeerworkflowRecord;


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
public class AssessmentPeerworkflow extends TableImpl<AssessmentPeerworkflowRecord> {

    private static final long serialVersionUID = -2038027994;

    /**
     * The reference instance of <code>bitnami_edx.assessment_peerworkflow</code>
     */
    public static final AssessmentPeerworkflow ASSESSMENT_PEERWORKFLOW = new AssessmentPeerworkflow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentPeerworkflowRecord> getRecordType() {
        return AssessmentPeerworkflowRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.id</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.student_id</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, String> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.item_id</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.course_id</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.submission_uuid</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, String> SUBMISSION_UUID = createField("submission_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.created_at</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.completed_at</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, Timestamp> COMPLETED_AT = createField("completed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.grading_completed_at</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, Timestamp> GRADING_COMPLETED_AT = createField("grading_completed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_peerworkflow.cancelled_at</code>.
     */
    public final TableField<AssessmentPeerworkflowRecord, Timestamp> CANCELLED_AT = createField("cancelled_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>bitnami_edx.assessment_peerworkflow</code> table reference
     */
    public AssessmentPeerworkflow() {
        this("assessment_peerworkflow", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_peerworkflow</code> table reference
     */
    public AssessmentPeerworkflow(String alias) {
        this(alias, ASSESSMENT_PEERWORKFLOW);
    }

    private AssessmentPeerworkflow(String alias, Table<AssessmentPeerworkflowRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentPeerworkflow(String alias, Table<AssessmentPeerworkflowRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentPeerworkflowRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_PEERWORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentPeerworkflowRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_PEERWORKFLOW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentPeerworkflowRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentPeerworkflowRecord>>asList(Keys.KEY_ASSESSMENT_PEERWORKFLOW_PRIMARY, Keys.KEY_ASSESSMENT_PEERWORKFLOW_SUBMISSION_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentPeerworkflow as(String alias) {
        return new AssessmentPeerworkflow(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentPeerworkflow rename(String name) {
        return new AssessmentPeerworkflow(name, null);
    }
}
