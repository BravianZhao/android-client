package org.xwiki.android.xmodel.xobjects;

import java.util.Date;

public class XComment extends XSimpleObject
{
     
    public XComment()
    {
        super("XWiki.XWikiComments");
    }
    
    public XComment(String comment)
    {
        this();
        setComment(comment);
    }
    
    String getAuthor()
    {
        XStringProperty prop = (XStringProperty) fields.get("author");
        if (prop != null) {
            return prop.getValue();
        }
        return null;
    }
    public void setAuthor(String author)
    {
        XStringProperty prop = (XStringProperty) fields.get("author");
        if (prop == null) {
            prop = new XStringProperty();
            setProperty("author", prop);
        }
        prop.setValue(author);
    }
    public String getComment()
    {
        XTextAreaProperty prop = (XTextAreaProperty) fields.get("comment");
        if (prop != null) {
            return prop.getValue();
        }
        return null;
    }
    public void setComment(String comment)
    {
        XTextAreaProperty prop = (XTextAreaProperty) fields.get("comment");
        if (prop == null) {
            prop = new XTextAreaProperty();
            setProperty("comment", prop);
        }
        prop.setValue(comment);
    }
    public Date getDate()
    {
        XDateProperty prop = (XDateProperty) fields.get("comment");
        if (prop != null) {
            return prop.getValue();
        }
        return null;
    }
    public void setDate(Date date)
    {
        XDateProperty prop = (XDateProperty) fields.get("date");
        if (prop == null) {
            prop = new XDateProperty();
            setProperty("date", prop);
        }
        prop.setValue(date);
    }
    public String getHighlight()
    {
        XTextAreaProperty prop = (XTextAreaProperty) fields.get("highlight");
        if (prop != null) {
            return prop.getValue();
        }
        return null;
    }
    public void setHighlight(String highlight)
    {
        XTextAreaProperty prop = (XTextAreaProperty) fields.get("highlight");
        if (prop == null) {
            prop = new XTextAreaProperty();
            setProperty("highlight", prop);
        }
        prop.setValue(highlight);
    }
    public Integer getReplyto()
    {
        XIntegerProperty prop = (XIntegerProperty) fields.get("replyto");
        if (prop != null) {
            return prop.getValue();
        }
        return null;
    }
    public void setReplyto(Integer replyto)
    {
        XIntegerProperty prop = (XIntegerProperty) fields.get("replyto");
        if (prop == null) {
            prop = new XIntegerProperty();
            setProperty("replyto", prop);
        }
        prop.setValue(replyto);
    }
    
   
    
    public XStringProperty getpAuthor()
    {
        return (XStringProperty) fields.get("author");
    }
    public void setpAuthor(XStringProperty author)
    {
        setProperty("author", author);
    }
    
    public XTextAreaProperty getpComment()
    {
        return (XTextAreaProperty) fields.get("comment");
    }
    public void setpComment(XTextAreaProperty comment)
    {
        setProperty("comment", comment);
    }
    public XDateProperty getpDate()
    {
        return (XDateProperty) fields.get("date");
    }
    public void setpDate(XDateProperty date)
    {
        setProperty("date", date);
    }
    public XTextAreaProperty getpHighlight()
    {
        return (XTextAreaProperty) fields.get("highlight");
    }
    public void setpHighlight(XTextAreaProperty highlight)
    {
        setProperty("highlight", highlight);
    }
    public XIntegerProperty getpReplyto()
    {
        return (XIntegerProperty) fields.get("replyto");
    }
    public void setpReplyto(XIntegerProperty replyto)
    {
        setProperty("replyto", replyto);
    }    
    
}
