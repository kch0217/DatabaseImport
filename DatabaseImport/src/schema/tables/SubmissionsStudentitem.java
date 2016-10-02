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
import schema.tables.records.SubmissionsStudentitemRecord;


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
public class SubmissionsStudentitem extends TableImpl<SubmissionsStudentitemRecord> {

    private static final long serialVersionUID = 235679281;

    /**
     * The reference instance of <code>bitnami_edx.submissions_studentitem</code>
     */
    public static final SubmissionsStudentitem SUBMISSIONS_STUDENTITEM = new SubmissionsStudentitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubmissionsStudentitemRecord> getRecordType() {
        return SubmissionsStudentitemRecord.class;
    }

    /**
     * The column <code>bitnami_edx.submissions_studentitem.id</code>.
     */
    public final TableField<SubmissionsStudentitemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_studentitem.student_id</code>.
     */
    public final TableField<SubmissionsStudentitemRecord, String> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_studentitem.course_id</code>.
     */
    public final TableField<SubmissionsStudentitemRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_studentitem.item_id</code>.
     */
    public final TableField<SubmissionsStudentitemRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.submissions_studentitem.item_type</code>.
     */
    public final TableField<SubmissionsStudentitemRecord, String> ITEM_TYPE = createField("item_type", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.submissions_studentitem</code> table reference
     */
    public SubmissionsStudentitem() {
        this("submissions_studentitem", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.submissions_studentitem</code> table reference
     */
    public SubmissionsStudentitem(String alias) {
        this(alias, SUBMISSIONS_STUDENTITEM);
    }

    private SubmissionsStudentitem(String alias, Table<SubmissionsStudentitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubmissionsStudentitem(String alias, Table<SubmissionsStudentitemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubmissionsStudentitemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBMISSIONS_STUDENTITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubmissionsStudentitemRecord> getPrimaryKey() {
        return Keys.KEY_SUBMISSIONS_STUDENTITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubmissionsStudentitemRecord>> getKeys() {
        return Arrays.<UniqueKey<SubmissionsStudentitemRecord>>asList(Keys.KEY_SUBMISSIONS_STUDENTITEM_PRIMARY, Keys.KEY_SUBMISSIONS_STUDENTITEM_SUBMISSIONS_STUDENTITEM_COURSE_ID_6A6ECCBDEC6FFD0B_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubmissionsStudentitem as(String alias) {
        return new SubmissionsStudentitem(alias, this);
    }

    /**
     * Rename this table
     */
    public SubmissionsStudentitem rename(String name) {
        return new SubmissionsStudentitem(name, null);
    }
}