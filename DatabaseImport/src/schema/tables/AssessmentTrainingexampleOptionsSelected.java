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
import schema.tables.records.AssessmentTrainingexampleOptionsSelectedRecord;


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
public class AssessmentTrainingexampleOptionsSelected extends TableImpl<AssessmentTrainingexampleOptionsSelectedRecord> {

    private static final long serialVersionUID = 742449817;

    /**
     * The reference instance of <code>bitnami_edx.assessment_trainingexample_options_selected</code>
     */
    public static final AssessmentTrainingexampleOptionsSelected ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED = new AssessmentTrainingexampleOptionsSelected();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentTrainingexampleOptionsSelectedRecord> getRecordType() {
        return AssessmentTrainingexampleOptionsSelectedRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_trainingexample_options_selected.id</code>.
     */
    public final TableField<AssessmentTrainingexampleOptionsSelectedRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_trainingexample_options_selected.trainingexample_id</code>.
     */
    public final TableField<AssessmentTrainingexampleOptionsSelectedRecord, Integer> TRAININGEXAMPLE_ID = createField("trainingexample_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_trainingexample_options_selected.criterionoption_id</code>.
     */
    public final TableField<AssessmentTrainingexampleOptionsSelectedRecord, Integer> CRITERIONOPTION_ID = createField("criterionoption_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_trainingexample_options_selected</code> table reference
     */
    public AssessmentTrainingexampleOptionsSelected() {
        this("assessment_trainingexample_options_selected", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_trainingexample_options_selected</code> table reference
     */
    public AssessmentTrainingexampleOptionsSelected(String alias) {
        this(alias, ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED);
    }

    private AssessmentTrainingexampleOptionsSelected(String alias, Table<AssessmentTrainingexampleOptionsSelectedRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentTrainingexampleOptionsSelected(String alias, Table<AssessmentTrainingexampleOptionsSelectedRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentTrainingexampleOptionsSelectedRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentTrainingexampleOptionsSelectedRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentTrainingexampleOptionsSelectedRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentTrainingexampleOptionsSelectedRecord>>asList(Keys.KEY_ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED_PRIMARY, Keys.KEY_ASSESSMENT_TRAININGEXAMPLE_OPTIONS_SELECTED_TRAININGEXAMPLE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentTrainingexampleOptionsSelectedRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentTrainingexampleOptionsSelectedRecord, ?>>asList(Keys.AE406D6687690BB9277287984729CFD8, Keys.D0B4A450EED0C653D223E489254ED8A1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentTrainingexampleOptionsSelected as(String alias) {
        return new AssessmentTrainingexampleOptionsSelected(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentTrainingexampleOptionsSelected rename(String name) {
        return new AssessmentTrainingexampleOptionsSelected(name, null);
    }
}
