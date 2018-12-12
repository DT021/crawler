package org.loopring.crawler.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "jinse_news")
@Data
public class JinseNews extends BasicModel {

    @Column(columnDefinition = "text")
    private String title;

    @Column(columnDefinition = "text")
    private String url;

    @Column(name = "intro_content", columnDefinition = "text")
    private String absContent;

    @Column(columnDefinition = "longtext")
    private String content;

    @Column(name = "content_html", columnDefinition = "longtext")
    private String contentHtml;

    @Column(name = "publish_time")
    private Date publishTime;

    @Column(name = "publish_time_str", columnDefinition = "text")
    private String publishTimeStr;

    @Column
    private String source;

    @Column(name = "source_url", columnDefinition = "text")
    private String sourceUrl;

    @Column
    private String author;

    @Column(name = "crawl_source")
    private String crawlSource;

    @Column(columnDefinition = "text")
    private String tags;

    @Column
    private Long level;

    @Override
    public boolean isValid() {

        String title = getTitle();
        String content = getContent();
        if (title == null || "".equals(title.trim()) || content == null || "".equals(content.trim()))
            return false;
        else
            return true;
    }
}
