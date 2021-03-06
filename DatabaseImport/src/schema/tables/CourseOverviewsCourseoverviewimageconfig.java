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
import schema.tables.records.CourseOverviewsCourseoverviewimageconfigRecord;


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
public class CourseOverviewsCourseoverviewimageconfig extends TableImpl<CourseOverviewsCourseoverviewimageconfigRecord> {

    private static final long serialVersionUID = -1925078033;

    /**
     * The reference instance of <code>bitnami_edx.course_overviews_courseoverviewimageconfig</code>
     */
    public static final CourseOverviewsCourseoverviewimageconfig COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG = new CourseOverviewsCourseoverviewimageconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseOverviewsCourseoverviewimageconfigRecord> getRecordType() {
        return CourseOverviewsCourseoverviewimageconfigRecord.class;
    }

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.id</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.change_date</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.enabled</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_width</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> SMALL_WIDTH = createField("small_width", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.small_height</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> SMALL_HEIGHT = createField("small_height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_width</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> LARGE_WIDTH = createField("large_width", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.large_height</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> LARGE_HEIGHT = createField("large_height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_overviews_courseoverviewimageconfig.changed_by_id</code>.
     */
    public final TableField<CourseOverviewsCourseoverviewimageconfigRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.course_overviews_courseoverviewimageconfig</code> table reference
     */
    public CourseOverviewsCourseoverviewimageconfig() {
        this("course_overviews_courseoverviewimageconfig", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.course_overviews_courseoverviewimageconfig</code> table reference
     */
    public CourseOverviewsCourseoverviewimageconfig(String alias) {
        this(alias, COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG);
    }

    private CourseOverviewsCourseoverviewimageconfig(String alias, Table<CourseOverviewsCourseoverviewimageconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private CourseOverviewsCourseoverviewimageconfig(String alias, Table<CourseOverviewsCourseoverviewimageconfigRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CourseOverviewsCourseoverviewimageconfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CourseOverviewsCourseoverviewimageconfigRecord> getPrimaryKey() {
        return Keys.KEY_COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CourseOverviewsCourseoverviewimageconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseOverviewsCourseoverviewimageconfigRecord>>asList(Keys.KEY_COURSE_OVERVIEWS_COURSEOVERVIEWIMAGECONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CourseOverviewsCourseoverviewimageconfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CourseOverviewsCourseoverviewimageconfigRecord, ?>>asList(Keys.COURSE_OVERVIEWS__CHANGED_BY_ID_54B19BA1C134AF6A_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseOverviewsCourseoverviewimageconfig as(String alias) {
        return new CourseOverviewsCourseoverviewimageconfig(alias, this);
    }

    /**
     * Rename this table
     */
    public CourseOverviewsCourseoverviewimageconfig rename(String name) {
        return new CourseOverviewsCourseoverviewimageconfig(name, null);
    }
}
