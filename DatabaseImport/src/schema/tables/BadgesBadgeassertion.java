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
import schema.tables.records.BadgesBadgeassertionRecord;


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
public class BadgesBadgeassertion extends TableImpl<BadgesBadgeassertionRecord> {

    private static final long serialVersionUID = -414744176;

    /**
     * The reference instance of <code>bitnami_edx.badges_badgeassertion</code>
     */
    public static final BadgesBadgeassertion BADGES_BADGEASSERTION = new BadgesBadgeassertion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BadgesBadgeassertionRecord> getRecordType() {
        return BadgesBadgeassertionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.id</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.data</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, String> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.backend</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, String> BACKEND = createField("backend", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.image_url</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.assertion_url</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, String> ASSERTION_URL = createField("assertion_url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.modified</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.created</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.badge_class_id</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, Integer> BADGE_CLASS_ID = createField("badge_class_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.badges_badgeassertion.user_id</code>.
     */
    public final TableField<BadgesBadgeassertionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.badges_badgeassertion</code> table reference
     */
    public BadgesBadgeassertion() {
        this("badges_badgeassertion", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.badges_badgeassertion</code> table reference
     */
    public BadgesBadgeassertion(String alias) {
        this(alias, BADGES_BADGEASSERTION);
    }

    private BadgesBadgeassertion(String alias, Table<BadgesBadgeassertionRecord> aliased) {
        this(alias, aliased, null);
    }

    private BadgesBadgeassertion(String alias, Table<BadgesBadgeassertionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BadgesBadgeassertionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BADGES_BADGEASSERTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BadgesBadgeassertionRecord> getPrimaryKey() {
        return Keys.KEY_BADGES_BADGEASSERTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BadgesBadgeassertionRecord>> getKeys() {
        return Arrays.<UniqueKey<BadgesBadgeassertionRecord>>asList(Keys.KEY_BADGES_BADGEASSERTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BadgesBadgeassertionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BadgesBadgeassertionRecord, ?>>asList(Keys.BADGES_B_BADGE_CLASS_ID_3A4A16CB833201E8_FK_BADGES_BADGECLASS_ID, Keys.BADGES_BADGEASSERTION_USER_ID_14233CDEFEE1055A_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BadgesBadgeassertion as(String alias) {
        return new BadgesBadgeassertion(alias, this);
    }

    /**
     * Rename this table
     */
    public BadgesBadgeassertion rename(String name) {
        return new BadgesBadgeassertion(name, null);
    }
}
