/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Common checking class
 * 
 * @author $Author$
 */
public class ECA0027CheckUtil {

    /**
     * Default constructor
     */
    public ECA0027CheckUtil() {
        super();
    }
    
    /**
     * Check Date Format
     * 
     * @param date
     *            date
     * @param dateFormat
     *            dateFormat
     * @return Return true when string is date format. Otherwise, return false.
     */
    public static boolean isDateFormat(String date, String dateFormat) {
        // Specify format
        SimpleDateFormat parser = new SimpleDateFormat(dateFormat);
        parser.setLenient(false);
        try {
            if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(dateFormat)) {
                return false;
            }else{
                parser.parse(date);
                // If date type is specified format,return true;
                return true;
            }
        } catch (ParseException e) {
            // If date type is not specified format,return false;
            return false;
        }
    }
    
    /**
     * Check if string of argument is halfwidth character & not blank end or not.
     * 
     * @param input String to check
     * @return Return true when string is halfwidth character & not blank end. Otherwise,return false.
     */
    public static boolean isAlphaNumericSymbolNotBlankEnd(String input) {
        if (CheckUtil.isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("^[\u0020-\u007F]*[\u0021-\u007F]$")) {
            return true;
        }
        return false;
    }
    
    /**
     * Check if string of argument is halfwidth character or not.
     * 
     * @param input String to check
     * @return Return true when string is halfwidth character. Otherwise,return false.
     */
    public static boolean isAlphaNumericSymbol(String input) {
        if (CheckUtil.isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("^[\u0020-\u007F]+$")) {
            return true;
        }
        return false;
    }
}
