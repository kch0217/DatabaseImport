/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.WikiImagerevisionRecord;


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
public class WikiImagerevision extends TableImpl<WikiImagerevisionRecord> {

    private static final long serialVersionUID = -376772675;

    /**
     * The reference instance of <code>bitnami_edx.wiki_imagerevision</code>
     */
    public static final WikiImagerevision WIKI_IMAGEREVISION = new WikiImagerevision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WikiImagerevisionRecord> getRecordType() {
        return WikiImagerevisionRecord.class;
    }

    /**
     * The column <code>bitnami_edx.wiki_imagerevision.revisionpluginrevision_ptr_id</code>.
     */
    public final TableField<WikiImagerevisionRecord, Integer> REVISIONPLUGINREVISION_PTR_ID = createField("revisionpluginrevision_ptr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_imagerevision.image</code>.
     */
    public final TableField<WikiImagerevisionRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(2000), this, "");

    /**
     * The column <code>bitnami_edx.wiki_imagerevision.width</code>.
     */
    public final TableField<WikiImagerevisionRecord, Short> WIDTH = createField("width", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>bitnami_edx.wiki_imagerevision.height</code>.
     */
    public final TableField<WikiImagerevisionRecord, Short> HEIGHT = createField("height", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>bitnami_edx.wiki_imagerevision</code> table reference
     */
    public WikiImagerevision() {
        this("wiki_imagerevision", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.wiki_imagerevision</code> table reference
     */
    public WikiImagerevision(String alias) {
        this(alias, WIKI_IMAGEREVISION);
    }

    private WikiImagerevision(String alias, Table<WikiImagerevisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private WikiImagerevision(String alias, Table<WikiImagerevisionRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<WikiImagerevisionRecord> getPrimaryKey() {
        return Keys.KEY_WIKI_IMAGEREVISION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WikiImagerevisionRecord>> getKeys() {
        return Arrays.<UniqueKey<WikiImagerevisionRecord>>asList(Keys.KEY_WIKI_IMAGEREVISION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WikiImagerevisionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WikiImagerevisionRecord, ?>>asList(Keys.FCC7A25DA8B3B9E0494C126CCF17852E);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiImagerevision as(String alias) {
        return new WikiImagerevision(alias, this);
    }

    /**
     * Rename this table
     */
    public WikiImagerevision rename(String name) {
        return new WikiImagerevision(name, null);
    }
}
