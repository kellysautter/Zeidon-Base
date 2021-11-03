/**
    This file is part of the Zeidon Java Object Engine (Zeidon JOE).

    Zeidon JOE is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Zeidon JOE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with Zeidon JOE.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2009-2015 QuinSoft
 */

package org.nazarene.nazsis.domains;

import java.util.Date;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.quinsoft.zeidon.Application;
import com.quinsoft.zeidon.AttributeInstance;
import com.quinsoft.zeidon.InvalidAttributeValueException;
import com.quinsoft.zeidon.Task;
import com.quinsoft.zeidon.ZeidonException;
import com.quinsoft.zeidon.domains.DateDomain;
import com.quinsoft.zeidon.domains.DomainContext;
import com.quinsoft.zeidon.domains.StringDomain;
import com.quinsoft.zeidon.objectdefinition.AttributeDef;

/**
 * This domain handles any differences needed to deal with time.
 * @author DG
 *
 */
public class DateTimeDomain extends DateDomain
{
    protected DateTimeFormatter defaultTimeFormatter = DateTimeFormat.forPattern("yyyyMMdd HHmmssS a");
    
    public DateTimeDomain(Application application, Map<String, Object> domainProperties, Task task )
    {
        super( application, domainProperties, task );
    }
   
    @Override
    public String convertToString(Task task, AttributeDef attributeDef, Object internalValue)
    {
        if ( internalValue == null )
            return StringDomain.checkNullString( attributeDef.getDomain().getApplication(), null );

        return defaultTimeFormatter.print( (DateTime) internalValue );
    }

/*
    @Override
    public void validateInternalValue( Task task, AttributeDef attributeDef, Object internalValue ) throws InvalidAttributeValueException
    {
            return;      
    }
*/
    @Override
    public int compare(Task task, AttributeInstance attributeInstance, AttributeDef attributeDef, Object internalValue, Object externalValue)
    {
        try
        {
        	// KJS 12/06/16 - In VmlOperation in CompareAttributeToAttribute, we call "int nRC = cursor1.getAttribute( attributeName1 ).compare( cursor2.getAttribute( attributeName2 ).getString() );"
        	// This call getString() on the 2nd entity. I don't think that's correct but I hate having to change zeidon-joe (means a new version number), so I wanted to 
        	// add this compare to nazsis. Now I also see that we call this compare in EntityCursorImpl (I believe it originates from OrderEntities)
        	// "cmp = cei1.getAttribute( key.attributeDef ).compare( cei2.getAttribute( key.attributeDef ).getValue() )", 
        	// which is not using the getString so the internal/external values are of the same format (so I think). So I need to account for that, otherwise I get an error.
            //Object value = convertExternalValue( task, attributeInstance, attributeDef, null, externalValue );
            //Integer rc = compareNull( task, attributeDef, internalValue, value);
            Integer rc = compareNull( task, attributeDef, internalValue, externalValue);
            
            if ( rc != null )
                return rc;
            
            Object internalValueTime = internalValue;
            Object externalValueTime = externalValue;
            
            if (internalValue.toString().length() != externalValue.toString().length())
            {
            	// The external value is in the format "HHmmssS a" but the internal value is in the format of datetime.
            	// Now the externalString and internalString should be the same format.
                internalValueTime = defaultTimeFormatter.print( (DateTime) internalValue );
            }
            else if (internalValue.toString().length() == 29)
            {
            	// We are going to assume that if the lengths are the same and the length = 29, then 
            	// we are looking at the whole datetime, but we only want to compare the time portion.
                internalValueTime = defaultTimeFormatter.print( (DateTime) internalValue );
                externalValueTime = defaultTimeFormatter.print( (DateTime) externalValue );
            }

            if ( internalValueTime instanceof Comparable )
            {
                assert internalValue.getClass() == externalValue.getClass();

                @SuppressWarnings("unchecked")
                Comparable<Object> c = (Comparable<Object>) internalValueTime;
                return c.compareTo( externalValueTime );
            }

            DomainContext context = getContext( task, null ); // Get the default context.
            return context.compare( task, internalValue, externalValue );
        }
        catch ( Throwable t )
        {
            throw ZeidonException.wrapException( t ).prependAttributeDef( attributeDef );
        }
    }
/*   
    @Override
    public Object convertExternalValue(Task task, attributeDef attributeDef, String contextName, Object externalValue)
    {
    	if ( externalValue == null )
    		return null;
    	//
    	// Is there any chance that I want to use the instanceof DateTime not to do a return but to
    	// make sure that the externalValue is a DateTime so that I know I can get the time from it???
        //if ( externalValue instanceof DateTime )
        //    return externalValue;
    	
        //if ( externalValue instanceof Date )
        //    return new DateTime( externalValue );
        //
    	
        // VML operations use "" as synonymous with null.
        if ( externalValue instanceof String && StringUtils.isBlank( (String) externalValue ) )
            return null;

        //if ( externalValue instanceof CharSequence )
        if ( externalValue instanceof DateTime )
        {
            DomainContext context = getContext( task, contextName );
            return context.convertExternalValue( task, attributeDef, externalValue );
        }

        throw new InvalidAttributeValueException( attributeDef, externalValue, 
                                                  "Invalid object: Domain %s cannot convert value for context %s.",
                                                  this.getClass().getName(), contextName );
    }

    @Override
    public TimeContext newContext(Task task)
    {
        return new TimeContext( this );
    }

    private class TimeContext extends BaseDomainContext
    {
        public TimeContext(Domain domain)
        {
            super( domain );
        }

        private String            editString;
        private DateTimeFormatter formatter;
        
        @Override
        public String convertToString(Task task, attributeDef attributeDef, Object internalValue)
        {
        	if ( internalValue == null )
        		return StringDomain.checkNullString(task.getApplication(), null);

            return formatter.print( (DateTime) internalValue );
        }

        @Override
        public Object convertExternalValue(Task task, attributeDef attributeDef, Object value) throws InvalidAttributeValueException
        {
        	if ( value == null )
        		return null;
        	
            //String s = (String) value;

            // VML operations use "" as synonymous with null.
        	//if ( StringUtils.isBlank( s ) )
        		//return null;
       	        	
            return formatter.print( (DateTime) value );
        }

        @Override
        public void setAttribute(PortableFileReader reader)
        {
            if ( reader.getAttributeName().equals( "JavaEditString" ) )
            {
                editString = reader.getAttributeValue();
                formatter = DateTimeFormat.forPattern( editString );
            }
            else
                super.setAttribute( reader );
        }
    }
*/
}
