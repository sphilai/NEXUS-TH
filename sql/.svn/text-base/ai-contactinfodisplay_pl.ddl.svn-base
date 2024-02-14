--------------------------------------------------------
--  DDL for Table LB_CONTACT_INFO_DETAIL
--------------------------------------------------------

CREATE TABLE LB_CONTACT_INFO_DETAIL (
    CONTACT_INFO_ID         VARCHAR2(20) NOT NULL, 
    LOCALE                  VARCHAR2(2) NOT NULL, 
    CONTACT_INFO            VARCHAR2(1024) NOT NULL, 
    SYSTEM_ID               VARCHAR2(20) NOT NULL, 
    REGIST_USER             VARCHAR2(20) NOT NULL, 
    REGIST_TIMESTAMP        TIMESTAMP (6) NOT NULL, 
    LAST_UPDATE_USER        VARCHAR2(20) NOT NULL, 
    LAST_UPDATE_TIMESTAMP   TIMESTAMP (6) NOT NULL, 
    CONSTRAINT LB_CONTACT_INFO_DETAIL_PK PRIMARY KEY (CONTACT_INFO_ID, LOCALE)
)
/
--------------------------------------------------------
--  DDL for Table LB_CONTACT_INFO_SYSTEM
--------------------------------------------------------
CREATE TABLE LB_CONTACT_INFO_SYSTEM (
    SYSTEM_ID               VARCHAR2(20) NOT NULL, 
    LOCALE                  VARCHAR2(2) NOT NULL, 
    SYSTEM_NAME             VARCHAR2(60) NOT NULL, 
    REGIST_USER             VARCHAR2(20) NOT NULL, 
    REGIST_TIMESTAMP        TIMESTAMP (6) NOT NULL, 
    LAST_UPDATE_USER        VARCHAR2(20) NOT NULL, 
    LAST_UPDATE_TIMESTAMP   TIMESTAMP (6) NOT NULL, 
    CONSTRAINT LB_CONTACT_INFO_SYSTEM_PK PRIMARY KEY (SYSTEM_ID, LOCALE)
)
/