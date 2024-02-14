/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;

/**
 * Utility classes of actual values for comparison with the expected value
 * <br />期待値と実績値比較用のユーティリティークラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5941 $
 */
public class MatchingUtil {

    /**
     * Constructor.
     */
    public MatchingUtil() {
    }

    /**
     * Extract the field name of the target from an array of expected value.
     *
     * @param expected Expected string array
     * @return Matching target fields
     */
    public static String[] getTargetFields(String[] expected) {
        String[] results = new String[expected.length];
        for (int i = 0; i < expected.length; i++) {
            results[i] = expected[i].split("=")[0];
        }
        return results;
    }

    /**
     * Generate a comparison string from an array of expected value.
     *
     * @param expected Expected string array
     * @return Expected string
     */
    public static String expectedToString(String[] expected) {
        StringBuffer buffer = new StringBuffer();
        for (String item : expected) {
            buffer.append(item + "\n");
        }
        return buffer.toString();
    }

    /**
     * Generate a comparison string from object (only specified field).
     *
     * @param o Matching target actual object
     * @param fieldNames Matching target fields
     * @return Actual string array
     * @throws NoSuchFieldException If no field.
     * @throws IllegalAccessException If illegal access.
     */
    public static String actualToString(Object o,
        String[] fieldNames) throws NoSuchFieldException, IllegalAccessException {

        StringBuffer buffer = new StringBuffer();
        for (String fieldName : fieldNames) {
            Field field = getField(o.getClass(), fieldName);
            field.setAccessible(true);
            Object value = field.get(o);
            buffer.append(fieldName + "=");
            if (value == null) {
                buffer.append("null");
            } else if (java.util.Date.class.equals(field.getType())) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                buffer.append(format.format(value));
            } else if (java.sql.Timestamp.class.equals(field.getType())) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                buffer.append(format.format(value));
            } else {
                buffer.append(value.toString());
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

    //--------------------------------- Private methods below ----------------------------------

    /**
     * Get a Field object of the class.
     *
     * @param clazz Class
     * @param fieldName field name
     * @return Field object
     * @throws NoSuchFieldException If no field.
     */
    private static Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        Field field = null;
        while (clazz != null) {
            try {
                field = clazz.getDeclaredField(fieldName);
                break;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        }
        if (field == null) {
            throw new NoSuchFieldException(fieldName);
        }
        return field;
    }
}
