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
import schema.tables.records.AssessmentStudenttrainingworkflowitemRecord;


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
public class AssessmentStudenttrainingworkflowitem extends TableImpl<AssessmentStudenttrainingworkflowitemRecord> {

    private static final long serialVersionUID = -179894494;

    /**
     * The reference instance of <code>bitnami_edx.assessment_studenttrainingworkflowitem</code>
     */
    public static final AssessmentStudenttrainingworkflowitem ASSESSMENT_STUDENTTRAININGWORKFLOWITEM = new AssessmentStudenttrainingworkflowitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentStudenttrainingworkflowitemRecord> getRecordType() {
        return AssessmentStudenttrainingworkflowitemRecord.class;
    }

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.order_num</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, UInteger> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.started_at</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, Timestamp> STARTED_AT = createField("started_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.completed_at</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, Timestamp> COMPLETED_AT = createField("completed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.training_example_id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, Integer> TRAINING_EXAMPLE_ID = createField("training_example_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.assessment_studenttrainingworkflowitem.workflow_id</code>.
     */
    public final TableField<AssessmentStudenttrainingworkflowitemRecord, Integer> WORKFLOW_ID = createField("workflow_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.assessment_studenttrainingworkflowitem</code> table reference
     */
    public AssessmentStudenttrainingworkflowitem() {
        this("assessment_studenttrainingworkflowitem", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.assessment_studenttrainingworkflowitem</code> table reference
     */
    public AssessmentStudenttrainingworkflowitem(String alias) {
        this(alias, ASSESSMENT_STUDENTTRAININGWORKFLOWITEM);
    }

    private AssessmentStudenttrainingworkflowitem(String alias, Table<AssessmentStudenttrainingworkflowitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentStudenttrainingworkflowitem(String alias, Table<AssessmentStudenttrainingworkflowitemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AssessmentStudenttrainingworkflowitemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_STUDENTTRAININGWORKFLOWITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentStudenttrainingworkflowitemRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOWITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentStudenttrainingworkflowitemRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentStudenttrainingworkflowitemRecord>>asList(Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOWITEM_PRIMARY, Keys.KEY_ASSESSMENT_STUDENTTRAININGWORKFLOWITEM_ASSESSMENT_STUDENTTRAININGWORK_WORKFLOW_ID_484E930FEB86AD74_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AssessmentStudenttrainingworkflowitemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssessmentStudenttrainingworkflowitemRecord, ?>>asList(Keys.D74CE3E30635DE397FEF41AC869640C7, Keys.F9C080EBC7AD16394EDDA963ED3F280F);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentStudenttrainingworkflowitem as(String alias) {
        return new AssessmentStudenttrainingworkflowitem(alias, this);
    }

    /**
     * Rename this table
     */
    public AssessmentStudenttrainingworkflowitem rename(String name) {
        return new AssessmentStudenttrainingworkflowitem(name, null);
    }
}
