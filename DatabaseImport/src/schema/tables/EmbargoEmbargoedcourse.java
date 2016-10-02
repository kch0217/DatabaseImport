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
import schema.tables.records.EmbargoEmbargoedcourseRecord;


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
public class EmbargoEmbargoedcourse extends TableImpl<EmbargoEmbargoedcourseRecord> {

    private static final long serialVersionUID = -218247355;

    /**
     * The reference instance of <code>bitnami_edx.embargo_embargoedcourse</code>
     */
    public static final EmbargoEmbargoedcourse EMBARGO_EMBARGOEDCOURSE = new EmbargoEmbargoedcourse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmbargoEmbargoedcourseRecord> getRecordType() {
        return EmbargoEmbargoedcourseRecord.class;
    }

    /**
     * The column <code>bitnami_edx.embargo_embargoedcourse.id</code>.
     */
    public final TableField<EmbargoEmbargoedcourseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.embargo_embargoedcourse.course_id</code>.
     */
    public final TableField<EmbargoEmbargoedcourseRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.embargo_embargoedcourse.embargoed</code>.
     */
    public final TableField<EmbargoEmbargoedcourseRecord, Byte> EMBARGOED = createField("embargoed", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.embargo_embargoedcourse</code> table reference
     */
    public EmbargoEmbargoedcourse() {
        this("embargo_embargoedcourse", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.embargo_embargoedcourse</code> table reference
     */
    public EmbargoEmbargoedcourse(String alias) {
        this(alias, EMBARGO_EMBARGOEDCOURSE);
    }

    private EmbargoEmbargoedcourse(String alias, Table<EmbargoEmbargoedcourseRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmbargoEmbargoedcourse(String alias, Table<EmbargoEmbargoedcourseRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EmbargoEmbargoedcourseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMBARGO_EMBARGOEDCOURSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmbargoEmbargoedcourseRecord> getPrimaryKey() {
        return Keys.KEY_EMBARGO_EMBARGOEDCOURSE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmbargoEmbargoedcourseRecord>> getKeys() {
        return Arrays.<UniqueKey<EmbargoEmbargoedcourseRecord>>asList(Keys.KEY_EMBARGO_EMBARGOEDCOURSE_PRIMARY, Keys.KEY_EMBARGO_EMBARGOEDCOURSE_COURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmbargoEmbargoedcourse as(String alias) {
        return new EmbargoEmbargoedcourse(alias, this);
    }

    /**
     * Rename this table
     */
    public EmbargoEmbargoedcourse rename(String name) {
        return new EmbargoEmbargoedcourse(name, null);
    }
}