/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.xwiki.android.resources;

import java.util.Collection;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * <p>
 * Java class for Page complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Page">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xwiki.org}PageSummary">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Root
@Namespace(reference = "http://www.xwiki.org")
public class Page extends PageSummary  
{

    @Element(required = false)
    public String language;

    @Element(required = false)
    public String version;

    @Element(required = false)
    public int majorVersion;

    @Element(required = false)
    public int minorVersion;

    @Element(required = false)
    public String created;

    @Element(required = false)
    public String creator;

    @Element(required = false)
    public String modified;

    @Element(required = false)
    public String modifier;

    @Element(required = false)
    public String content;

    /**
     * Gets the value of the language property.
     * 
     * @return possible object is {@link String }
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLanguage(String value)
    {
        this.language = value;

    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value)
    {
        this.version = value;
    }

    /**
     * Gets the value of the majorVersion property.
     */
    public int getMajorVersion()
    {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     */
    public void setMajorVersion(int value)
    {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     */
    public int getMinorVersion()
    {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     */
    public void setMinorVersion(int value)
    {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreated()
    {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreated(String value)
    {
        this.created = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreator()
    {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreator(String value)
    {
        this.creator = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return possible object is {@link String }
     */
    public String getModified()
    {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setModified(String value)
    {
        this.modified = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return possible object is {@link String }
     */
    public String getModifier()
    {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setModifier(String value)
    {
        this.modifier = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return possible object is {@link String }
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setContent(String value)
    {
        this.content = value;
    }

    public Page withLanguage(String value)
    {
        setLanguage(value);
        return this;
    }

    public Page withVersion(String value)
    {
        setVersion(value);
        return this;
    }

    public Page withMajorVersion(int value)
    {
        setMajorVersion(value);
        return this;
    }

    public Page withMinorVersion(int value)
    {
        setMinorVersion(value);
        return this;
    }

    public Page withCreated(String value)
    {
        setCreated(value);
        return this;
    }

    public Page withCreator(String value)
    {
        setCreator(value);
        return this;
    }

    public Page withModified(String value)
    {
        setModified(value);
        return this;
    }

    public Page withModifier(String value)
    {
        setModifier(value);
        return this;
    }

    public Page withContent(String value)
    {
        setContent(value);
        return this;
    }

    @Override
    public Page withId(String value)
    {
        setId(value);
        return this;
    }

    @Override
    public Page withFullName(String value)
    {
        setFullName(value);
        return this;
    }

    @Override
    public Page withWiki(String value)
    {
        setWiki(value);
        return this;
    }

    @Override
    public Page withSpace(String value)
    {
        setSpace(value);
        return this;
    }

    @Override
    public Page withName(String value)
    {
        setName(value);
        return this;
    }

    @Override
    public Page withTitle(String value)
    {
        setTitle(value);
        return this;
    }

    @Override
    public Page withParent(String value)
    {
        setParent(value);
        return this;
    }

    @Override
    public Page withParentId(String value)
    {
        setParentId(value);
        return this;
    }

    @Override
    public Page withXwikiRelativeUrl(String value)
    {
        setXwikiRelativeUrl(value);
        return this;
    }

    @Override
    public Page withXwikiAbsoluteUrl(String value)
    {
        setXwikiAbsoluteUrl(value);
        return this;
    }

    @Override
    public Page withTranslations(Translations value)
    {
        setTranslations(value);
        return this;
    }

    @Override
    public Page withSyntax(String value)
    {
        setSyntax(value);
        return this;
    }

    @Override
    public Page withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public Page withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }
    
    

}
