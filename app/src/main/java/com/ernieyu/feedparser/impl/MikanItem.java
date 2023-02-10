package com.ernieyu.feedparser.impl;

import com.ernieyu.feedparser.Element;
import com.ernieyu.feedparser.FeedUtils;

import org.xml.sax.Attributes;

import java.util.Date;

public class MikanItem extends Rss2Item {
    private static final String PUB_DATE = "pubDate";
    private static final String TORRENT = "torrent";

    public MikanItem(String uri, String localName, Attributes attributes) {
        super(uri,localName,attributes);
    }

    public Date getPubDate() {
        Element pubDate = getElement(TORRENT).getElement(PUB_DATE);
        return (pubDate != null) ? FeedUtils.convertMikanDate(pubDate.getContent()) : null;
    }
}
