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
import schema.tables.records.ProctoringProctoredexamsoftwaresecurereviewhistoryRecord;


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
public class ProctoringProctoredexamsoftwaresecurereviewhistory extends TableImpl<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> {

    private static final long serialVersionUID = -433730716;

    /**
     * The reference instance of <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory</code>
     */
    public static final ProctoringProctoredexamsoftwaresecurereviewhistory PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY = new ProctoringProctoredexamsoftwaresecurereviewhistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> getRecordType() {
        return ProctoringProctoredexamsoftwaresecurereviewhistoryRecord.class;
    }

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.id</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.created</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.modified</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.attempt_code</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, String> ATTEMPT_CODE = createField("attempt_code", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.review_status</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, String> REVIEW_STATUS = createField("review_status", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.raw_data</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, String> RAW_DATA = createField("raw_data", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.video_url</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, String> VIDEO_URL = createField("video_url", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.exam_id</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Integer> EXAM_ID = createField("exam_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.reviewed_by_id</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Integer> REVIEWED_BY_ID = createField("reviewed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory.student_id</code>.
     */
    public final TableField<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory</code> table reference
     */
    public ProctoringProctoredexamsoftwaresecurereviewhistory() {
        this("proctoring_proctoredexamsoftwaresecurereviewhistory", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.proctoring_proctoredexamsoftwaresecurereviewhistory</code> table reference
     */
    public ProctoringProctoredexamsoftwaresecurereviewhistory(String alias) {
        this(alias, PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY);
    }

    private ProctoringProctoredexamsoftwaresecurereviewhistory(String alias, Table<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProctoringProctoredexamsoftwaresecurereviewhistory(String alias, Table<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord> getPrimaryKey() {
        return Keys.KEY_PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord>>asList(Keys.KEY_PROCTORING_PROCTOREDEXAMSOFTWARESECUREREVIEWHISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProctoringProctoredexamsoftwaresecurereviewhistoryRecord, ?>>asList(Keys.PROCTORI_EXAM_ID_73969AE423813477_FK_PROCTORING_PROCTOREDEXAM_ID, Keys.PROCTORING_PROCT_REVIEWED_BY_ID_139568D0BF423998_FK_AUTH_USER_ID, Keys.PROCTORING_PROCTORED_STUDENT_ID_6922BA3B791462D8_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProctoringProctoredexamsoftwaresecurereviewhistory as(String alias) {
        return new ProctoringProctoredexamsoftwaresecurereviewhistory(alias, this);
    }

    /**
     * Rename this table
     */
    public ProctoringProctoredexamsoftwaresecurereviewhistory rename(String name) {
        return new ProctoringProctoredexamsoftwaresecurereviewhistory(name, null);
    }
}