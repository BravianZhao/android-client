package org.xwiki.android.rest.transformation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xwiki.android.resources.Attachment;
import org.xwiki.android.resources.Comment;
import org.xwiki.android.resources.Page;
import org.xwiki.android.resources.Object;
import org.xwiki.android.resources.Tags;

/**
 * @author xwiki gsoc 2012 A scratch pad for converting. !!! Public but for ral package use only.
 */
public class DocLaunchPadForXML
{
    Page page;

    String wikiName, spaceName, pageName;

    List<Object> newObjects; // new local objs
    Map<String, Object> editedObjects; // key= XObjClass/<num>
    List<String> deletedObjects; // locally
    
    List<Comment> newComments;
    List<Comment> editedComments;//modification of comments sup for obj only.
    List<String> deletedComments;
    
    Tags tags;    
    
    List<org.xwiki.android.xmodel.entity.Attachment> attatchmentsToupload;//new and update both. Same xmlrpc method.
    Set<String> deletedAttachments;
    
    public DocLaunchPadForXML()
    {
        newObjects = new ArrayList<Object>();
        editedObjects = new Hashtable<String, Object>();
        deletedObjects = new ArrayList<String>();
        newComments=new ArrayList<Comment>();
        editedComments=new ArrayList<Comment>();
        deletedComments=new ArrayList<String>();
        
        attatchmentsToupload=new ArrayList<org.xwiki.android.xmodel.entity.Attachment>();
        deletedAttachments=new HashSet<String>();
        
    }

    /**
     * @return the page
     */
    public Page getPage()
    {
        return page;
    }

    /**
     * @return the wikiName
     */
    public String getWikiName()
    {
        return wikiName;
    }

    /**
     * @return the spaceName
     */
    public String getSpaceName()
    {
        return spaceName;
    }

    /**
     * @return the pageName
     */
    public String getPageName()
    {
        return pageName;
    }

    /**
     * @return the newObjects
     */
    public List<Object> getNewObjects()
    {
        return newObjects;
    }

    /**
     * @return the editedObjects
     */
    public Map<String, Object> getEditedObjects()
    {
        return editedObjects;
    }

    /**
     * @return the deletedObjects
     */
    public List<String> getDeletedObjects()
    {
        return deletedObjects;
    }

    
    
    public List<Comment> getNewComments()
	{
		return newComments;
	}

	public List<Comment> getEditedComments()
	{
		return editedComments;
	}

	
	public List<String> getDeletedComments()
	{
		return deletedComments;
	}
    
    
    
    public Tags getTags()
	{
		return tags;
	}

    
    
    public List<org.xwiki.android.xmodel.entity.Attachment> getAttatchmentsToupload()
	{
		return attatchmentsToupload;
	}

    public Set<String> getDeletedAttachments()
	{
		return deletedAttachments;
	}

	

	
	

	
	
	

	void addNewOjbect(Object obj)
    {
        newObjects.add(obj);
    }

    boolean markDeletedObject(String objkey)
    {
        return deletedObjects.add(objkey);
    }

    Object putEditedObject(String key, Object obj)
    {
        return editedObjects.put(key, obj);
    }

    // TODO: implement fr comments...
    // TODO: implement XSimpleObjectWrappers, DocumentWrapper for lazy fetching. Also maps to hold wrapped objs.

}
