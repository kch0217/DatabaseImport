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
import schema.tables.records.SubmissionsScoreannotationRecord;


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
public class SubmissionsScoreannotation extends TableImpl<SubmissionsScoreannotationRecord> {

    private static final long serialVersionUID = 1815944286;

    /**
     * The reference instance of <code>bitnami_edx.submissions_scoreannotation</code>
     */
    public static final SubmissionsScoreannotation SUBMISSIONS_SCOREANNOTATION = new SubmissionsScoreannotation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubmissionsScoreannotationRecord> getRecordType() {
        return SubmissionsScoreannotationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.submissions_scoreannotation.id</code>.
     */
    public final TableField<SubmissionsScoreannotationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_scoreannotation.annotation_type</code>.
     */
    public final TableField<SubmissionsScoreannotationRecord, String> ANNOTATION_TYPE = createField("annotation_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_scoreannotation.creator</code>.
     */
    public final TableField<SubmissionsScoreannotationRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_scoreannotation.reason</code>.
     */
    public final TableField<SubmissionsScoreannotationRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_scoreannotation.score_id</code>.
     */
    public final TableField<SubmissionsScoreannotationRecord, Integer> SCORE_ID = createField("score_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.submissions_scoreannotation</code> table reference
     */
    public SubmissionsScoreannotation() {
        this("submissions_scoreannotation", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.submissions_scoreannotation</code> table reference
     */
    public SubmissionsScoreannotation(String alias) {
        this(alias, SUBMISSIONS_SCOREANNOTATION);
    }

    private SubmissionsScoreannotation(String alias, Table<SubmissionsScoreannotationRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubmissionsScoreannotation(String alias, Table<SubmissionsScoreannotationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubmissionsScoreannotationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBMISSIONS_SCOREANNOTATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubmissionsScoreannotationRecord> getPrimaryKey() {
        return Keys.KEY_SUBMISSIONS_SCOREANNOTATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubmissionsScoreannotationRecord>> getKeys() {
        return Arrays.<UniqueKey<SubmissionsScoreannotationRecord>>asList(Keys.KEY_SUBMISSIONS_SCOREANNOTATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SubmissionsScoreannotationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SubmissionsScoreannotationRecord, ?>>asList(Keys.SUBMISSIONS_SC_SCORE_ID_7B5EF248552CB857_FK_SUBMISSIONS_SCORE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsScoreannotation as(String alias) {
        return new SubmissionsScoreannotation(alias, this);
    }

    /**
     * Rename this table
     */
    public SubmissionsScoreannotation rename(String name) {
        return new SubmissionsScoreannotation(name, null);
    }
}
