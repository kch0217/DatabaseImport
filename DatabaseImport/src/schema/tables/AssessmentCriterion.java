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
import org.jooq.types.UInteger;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.AssessmentCriterionRecord;


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
public class AssessmentCriterion extends TableImpl<AssessmentCriterionRecord> {

    private static final long serialVersionUID = 1824529025;

    /**
     * The reference instance of <code>bitnami_edx.assessment_criterion</code>
     */
    public static final AssessmentCriterion ASSESSMENT_CRITERION = new AssessmentCriterion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentCriterionRecord> getRecordType() {
        return AssessmentCriterionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_criterion.id</code>.
     */
    public final TableField<AssessmentCriterionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_criterion.name</code>.
     */
    public final TableField<AssessmentCriterionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_criterion.label</code>.
     */
    public final TableField<AssessmentCriterionRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_criterion.order_num</code>.
     */
    public final TableField<AssessmentCriterionRecord, UInteger> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_criterion.prompt</code>.
     */
    public final TableField<AssessmentCriterionRecord, String> PROMPT = createField("prompt", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_criterion.rubric_id</code>.
     */
    public final TableField<AssessmentCriterionRecord, Integer> RUBRIC_ID = createField("rubric_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_criterion</code> table reference
     */
    public AssessmentCriterion() {
        this("assessment_criterion", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_criterion</code> table reference
     */
    public AssessmentCriterion(String alias) {
        this(alias, ASSESSMENT_CRITERION);
    }

    private AssessmentCriterion(String alias, Table<AssessmentCriterionRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentCriterion(String alias, Table<AssessmentCriterionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentCriterionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_CRITERION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentCriterionRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_CRITERION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentCriterionRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentCriterionRecord>>asList(Keys.KEY_ASSESSMENT_CRITERION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentCriterionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentCriterionRecord, ?>>asList(Keys.ASSESSMENT_CR_RUBRIC_ID_30B7422EB7F191CD_FK_ASSESSMENT_RUBRIC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentCriterion as(String alias) {
        return new AssessmentCriterion(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentCriterion rename(String name) {
        return new AssessmentCriterion(name, null);
    }
}
