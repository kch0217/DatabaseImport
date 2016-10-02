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
import schema.tables.records.WikiArticleRecord;


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
public class WikiArticle extends TableImpl<WikiArticleRecord> {

    private static final long serialVersionUID = -1381173617;

    /**
     * The reference instance of <code>bitnami_edx.wiki_article</code>
     */
    public static final WikiArticle WIKI_ARTICLE = new WikiArticle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WikiArticleRecord> getRecordType() {
        return WikiArticleRecord.class;
    }

    /**
     * The column <code>bitnami_edx.wiki_article.id</code>.
     */
    public final TableField<WikiArticleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.created</code>.
     */
    public final TableField<WikiArticleRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.modified</code>.
     */
    public final TableField<WikiArticleRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.group_read</code>.
     */
    public final TableField<WikiArticleRecord, Byte> GROUP_READ = createField("group_read", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.group_write</code>.
     */
    public final TableField<WikiArticleRecord, Byte> GROUP_WRITE = createField("group_write", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.other_read</code>.
     */
    public final TableField<WikiArticleRecord, Byte> OTHER_READ = createField("other_read", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.other_write</code>.
     */
    public final TableField<WikiArticleRecord, Byte> OTHER_WRITE = createField("other_write", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.current_revision_id</code>.
     */
    public final TableField<WikiArticleRecord, Integer> CURRENT_REVISION_ID = createField("current_revision_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.group_id</code>.
     */
    public final TableField<WikiArticleRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.wiki_article.owner_id</code>.
     */
    public final TableField<WikiArticleRecord, Integer> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.wiki_article</code> table reference
     */
    public WikiArticle() {
        this("wiki_article", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.wiki_article</code> table reference
     */
    public WikiArticle(String alias) {
        this(alias, WIKI_ARTICLE);
    }

    private WikiArticle(String alias, Table<WikiArticleRecord> aliased) {
        this(alias, aliased, null);
    }

    private WikiArticle(String alias, Table<WikiArticleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<WikiArticleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WIKI_ARTICLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WikiArticleRecord> getPrimaryKey() {
        return Keys.KEY_WIKI_ARTICLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WikiArticleRecord>> getKeys() {
        return Arrays.<UniqueKey<WikiArticleRecord>>asList(Keys.KEY_WIKI_ARTICLE_PRIMARY, Keys.KEY_WIKI_ARTICLE_CURRENT_REVISION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WikiArticleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WikiArticleRecord, ?>>asList(Keys.CURRENT_REVISION_ID_42A9DBEC1E0DD15C_FK_WIKI_ARTICLEREVISION_ID, Keys.WIKI_ARTICLE_GROUP_ID_2B38601B6AA39F3D_FK_AUTH_GROUP_ID, Keys.WIKI_ARTICLE_OWNER_ID_B1C1E44609A378F_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiArticle as(String alias) {
        return new WikiArticle(alias, this);
    }

    /**
     * Rename this table
     */
    public WikiArticle rename(String name) {
        return new WikiArticle(name, null);
    }
}