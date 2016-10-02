/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import schema.tables.WikiUrlpath;


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
public class WikiUrlpathRecord extends UpdatableRecordImpl<WikiUrlpathRecord> implements Record9<Integer, String, UInteger, UInteger, UInteger, UInteger, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1434828117;

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.slug</code>.
     */
    public void setSlug(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.slug</code>.
     */
    public String getSlug() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.lft</code>.
     */
    public void setLft(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.lft</code>.
     */
    public UInteger getLft() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.rght</code>.
     */
    public void setRght(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.rght</code>.
     */
    public UInteger getRght() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.tree_id</code>.
     */
    public void setTreeId(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.tree_id</code>.
     */
    public UInteger getTreeId() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.level</code>.
     */
    public void setLevel(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.level</code>.
     */
    public UInteger getLevel() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.article_id</code>.
     */
    public void setArticleId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.article_id</code>.
     */
    public Integer getArticleId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.wiki_urlpath.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.wiki_urlpath.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, UInteger, UInteger, UInteger, UInteger, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, UInteger, UInteger, UInteger, UInteger, Integer, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WikiUrlpath.WIKI_URLPATH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WikiUrlpath.WIKI_URLPATH.SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return WikiUrlpath.WIKI_URLPATH.LFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return WikiUrlpath.WIKI_URLPATH.RGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return WikiUrlpath.WIKI_URLPATH.TREE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return WikiUrlpath.WIKI_URLPATH.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return WikiUrlpath.WIKI_URLPATH.ARTICLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return WikiUrlpath.WIKI_URLPATH.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return WikiUrlpath.WIKI_URLPATH.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getLft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getRght();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getTreeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getArticleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value2(String value) {
        setSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value3(UInteger value) {
        setLft(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value4(UInteger value) {
        setRght(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value5(UInteger value) {
        setTreeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value6(UInteger value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value7(Integer value) {
        setArticleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value8(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord value9(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiUrlpathRecord values(Integer value1, String value2, UInteger value3, UInteger value4, UInteger value5, UInteger value6, Integer value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WikiUrlpathRecord
     */
    public WikiUrlpathRecord() {
        super(WikiUrlpath.WIKI_URLPATH);
    }

    /**
     * Create a detached, initialised WikiUrlpathRecord
     */
    public WikiUrlpathRecord(Integer id, String slug, UInteger lft, UInteger rght, UInteger treeId, UInteger level, Integer articleId, Integer parentId, Integer siteId) {
        super(WikiUrlpath.WIKI_URLPATH);

        set(0, id);
        set(1, slug);
        set(2, lft);
        set(3, rght);
        set(4, treeId);
        set(5, level);
        set(6, articleId);
        set(7, parentId);
        set(8, siteId);
    }
}
