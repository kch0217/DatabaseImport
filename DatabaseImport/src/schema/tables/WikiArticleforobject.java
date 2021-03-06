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
import schema.tables.records.WikiArticleforobjectRecord;


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
public class WikiArticleforobject extends TableImpl<WikiArticleforobjectRecord> {

    private static final long serialVersionUID = 1917384708;

    /**
     * The reference instance of <code>bitnami_edx.wiki_articleforobject</code>
     */
    public static final WikiArticleforobject WIKI_ARTICLEFOROBJECT = new WikiArticleforobject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WikiArticleforobjectRecord> getRecordType() {
        return WikiArticleforobjectRecord.class;
    }

    /**
     * The column <code>bitnami_edx.wiki_articleforobject.id</code>.
     */
    public final TableField<WikiArticleforobjectRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_articleforobject.object_id</code>.
     */
    public final TableField<WikiArticleforobjectRecord, UInteger> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_articleforobject.is_mptt</code>.
     */
    public final TableField<WikiArticleforobjectRecord, Byte> IS_MPTT = createField("is_mptt", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_articleforobject.article_id</code>.
     */
    public final TableField<WikiArticleforobjectRecord, Integer> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_articleforobject.content_type_id</code>.
     */
    public final TableField<WikiArticleforobjectRecord, Integer> CONTENT_TYPE_ID = createField("content_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.wiki_articleforobject</code> table reference
     */
    public WikiArticleforobject() {
        this("wiki_articleforobject", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.wiki_articleforobject</code> table reference
     */
    public WikiArticleforobject(String alias) {
        this(alias, WIKI_ARTICLEFOROBJECT);
    }

    private WikiArticleforobject(String alias, Table<WikiArticleforobjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private WikiArticleforobject(String alias, Table<WikiArticleforobjectRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WikiArticleforobjectRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WIKI_ARTICLEFOROBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WikiArticleforobjectRecord> getPrimaryKey() {
        return Keys.KEY_WIKI_ARTICLEFOROBJECT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WikiArticleforobjectRecord>> getKeys() {
        return Arrays.<UniqueKey<WikiArticleforobjectRecord>>asList(Keys.KEY_WIKI_ARTICLEFOROBJECT_PRIMARY, Keys.KEY_WIKI_ARTICLEFOROBJECT_WIKI_ARTICLEFOROBJECT_CONTENT_TYPE_ID_27C4CCE189B3BCAB_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WikiArticleforobjectRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WikiArticleforobjectRecord, ?>>asList(Keys.WIKI_ARTICLEFOROBJ_ARTICLE_ID_6EFFCFADF020E71_FK_WIKI_ARTICLE_ID, Keys.WIKI__CONTENT_TYPE_ID_6A39C68B7A20C3C4_FK_DJANGO_CONTENT_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticleforobject as(String alias) {
        return new WikiArticleforobject(alias, this);
    }

    /**
     * Rename this table
     */
    public WikiArticleforobject rename(String name) {
        return new WikiArticleforobject(name, null);
    }
}
