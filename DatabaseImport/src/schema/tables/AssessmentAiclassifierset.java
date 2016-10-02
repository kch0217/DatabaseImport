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
import schema.tables.records.AssessmentAiclassifiersetRecord;


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
public class AssessmentAiclassifierset extends TableImpl<AssessmentAiclassifiersetRecord> {

    private static final long serialVersionUID = 543946697;

    /**
     * The reference instance of <code>bitnami_edx.assessment_aiclassifierset</code>
     */
    public static final AssessmentAiclassifierset ASSESSMENT_AICLASSIFIERSET = new AssessmentAiclassifierset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentAiclassifiersetRecord> getRecordType() {
        return AssessmentAiclassifiersetRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.id</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.created_at</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.algorithm_id</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, String> ALGORITHM_ID = createField("algorithm_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.course_id</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.item_id</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_aiclassifierset.rubric_id</code>.
     */
    public final TableField<AssessmentAiclassifiersetRecord, Integer> RUBRIC_ID = createField("rubric_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_aiclassifierset</code> table reference
     */
    public AssessmentAiclassifierset() {
        this("assessment_aiclassifierset", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_aiclassifierset</code> table reference
     */
    public AssessmentAiclassifierset(String alias) {
        this(alias, ASSESSMENT_AICLASSIFIERSET);
    }

    private AssessmentAiclassifierset(String alias, Table<AssessmentAiclassifiersetRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentAiclassifierset(String alias, Table<AssessmentAiclassifiersetRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentAiclassifiersetRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_AICLASSIFIERSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentAiclassifiersetRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_AICLASSIFIERSET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentAiclassifiersetRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentAiclassifiersetRecord>>asList(Keys.KEY_ASSESSMENT_AICLASSIFIERSET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentAiclassifiersetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentAiclassifiersetRecord, ?>>asList(Keys.ASSESSMENT_AI_RUBRIC_ID_45488BE94EA0AEA5_FK_ASSESSMENT_RUBRIC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentAiclassifierset as(String alias) {
        return new AssessmentAiclassifierset(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentAiclassifierset rename(String name) {
        return new AssessmentAiclassifierset(name, null);
    }
}
