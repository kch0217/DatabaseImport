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
import schema.tables.records.CoursewareOfflinecomputedgradeRecord;


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
public class CoursewareOfflinecomputedgrade extends TableImpl<CoursewareOfflinecomputedgradeRecord> {

    private static final long serialVersionUID = -578302674;

    /**
     * The reference instance of <code>bitnami_edx.courseware_offlinecomputedgrade</code>
     */
    public static final CoursewareOfflinecomputedgrade COURSEWARE_OFFLINECOMPUTEDGRADE = new CoursewareOfflinecomputedgrade();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoursewareOfflinecomputedgradeRecord> getRecordType() {
        return CoursewareOfflinecomputedgradeRecord.class;
    }

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.id</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.course_id</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.created</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.updated</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.gradeset</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, String> GRADESET = createField("gradeset", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.courseware_offlinecomputedgrade.user_id</code>.
     */
    public final TableField<CoursewareOfflinecomputedgradeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.courseware_offlinecomputedgrade</code> table reference
     */
    public CoursewareOfflinecomputedgrade() {
        this("courseware_offlinecomputedgrade", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.courseware_offlinecomputedgrade</code> table reference
     */
    public CoursewareOfflinecomputedgrade(String alias) {
        this(alias, COURSEWARE_OFFLINECOMPUTEDGRADE);
    }

    private CoursewareOfflinecomputedgrade(String alias, Table<CoursewareOfflinecomputedgradeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoursewareOfflinecomputedgrade(String alias, Table<CoursewareOfflinecomputedgradeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CoursewareOfflinecomputedgradeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSEWARE_OFFLINECOMPUTEDGRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CoursewareOfflinecomputedgradeRecord> getPrimaryKey() {
        return Keys.KEY_COURSEWARE_OFFLINECOMPUTEDGRADE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CoursewareOfflinecomputedgradeRecord>> getKeys() {
        return Arrays.<UniqueKey<CoursewareOfflinecomputedgradeRecord>>asList(Keys.KEY_COURSEWARE_OFFLINECOMPUTEDGRADE_PRIMARY, Keys.KEY_COURSEWARE_OFFLINECOMPUTEDGRADE_COURSEWARE_OFFLINECOMPUTEDGRADE_USER_ID_46133BBD0926078F_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CoursewareOfflinecomputedgradeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CoursewareOfflinecomputedgradeRecord, ?>>asList(Keys.COURSEWARE_OFFLINECOMPU_USER_ID_66BBCCBF945DFD56_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareOfflinecomputedgrade as(String alias) {
        return new CoursewareOfflinecomputedgrade(alias, this);
    }

    /**
     * Rename this table
     */
    public CoursewareOfflinecomputedgrade rename(String name) {
        return new CoursewareOfflinecomputedgrade(name, null);
    }
}
