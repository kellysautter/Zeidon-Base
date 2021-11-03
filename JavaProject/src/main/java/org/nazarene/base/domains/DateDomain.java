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
import com.quinsoft.zeidon.ObjectEngine;
import com.quinsoft.zeidon.Task;
import com.quinsoft.zeidon.domains.DomainContext;
import com.quinsoft.zeidon.objectdefinition.AttributeDef;

import org.apache.commons.lang3.StringUtils;

/**
 * @author DG
 *
 */
//public class DateDomain extends AbstractDomain
public class DateDomain extends DateTimeDomain
{
    protected DateTimeFormatter defaultDateFormatter = DateTimeFormat.forPattern( ObjectEngine.INTERNAL_DATE_STRING_FORMAT );

    public DateDomain(Application application, Map<String, Object> domainProperties, Task task)
    {
        super( application, domainProperties, task );
    }

    public Object convertExternalValue(Task task, AttributeInstance attributeInstance, AttributeDef attributeDef, String contextName, Object externalValue)
    {

        // If external value is an AttributeInstance then get *its* internal value.
        if ( externalValue instanceof AttributeInstance )
            externalValue = ((AttributeInstance) externalValue).getValue();

    	// KJS - Added 01/27/11 because of line 2836 in lTrnscpt_Object.java
    	// OrderEntityForView( lTrnscpt, "StudentMajorDegreeTrack", "wPrimarySortOrder A GraduationDate A" );
    	// value = null so we are getting to the exception.  Will try returning null, see what happens.
    	if ( externalValue == null )
    		return null;

        if ( externalValue instanceof DateTime )
            return externalValue;

        if ( externalValue instanceof Date )
            return new DateTime( externalValue );

        // VML operations use "" as synonymous with null.
        if ( externalValue instanceof String && StringUtils.isBlank( (String) externalValue ) )
            return null;

        if ( externalValue instanceof CharSequence )
        {
            // If string is "NOW" then we'll use current datetime.
            if ( externalValue.toString().equals( "NOW" ) )
                return new DateTime();

            DomainContext context = getContext( task, contextName );
            // Now this calls convertExternalValue in DateTimeDomain which then still sends back the string in long format.
            return context.convertExternalValue( task, attributeDef, externalValue.toString() );
        }

        throw new InvalidAttributeValueException( attributeDef, externalValue,
                                                  "Invalid object: Domain %s cannot convert value for context %s.",
                                                  this.getClass().getName(), contextName );
    }

    public String convertToString(Task task, AttributeDef attributeDef, Object internalValue)
    {
        if ( internalValue == null )
            return super.convertToString( task, attributeDef, internalValue );

        return defaultDateFormatter.print( (DateTime) internalValue );
    }
}